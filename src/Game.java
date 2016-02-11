import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by branden on 2/3/16 at 10:56.
 */
public class Game {

    //create a global scanner object
    public static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player();

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome friend");

       try {
           player = loadGame();
           System.out.println("Loading your game");
       } catch (Exception e) {
           System.out.println("Starting a new game");
       }

        //run methods on player



        if (player.name == null) player.chooseName();
        if (player.weapon == null) player.chooseWeapon();
        if (player.location == null) player.chooseLocation();

        if (player.items.isEmpty()) {
            player.findItem("shield");
            player.findItem("boots");
            player.findItem("belt");
        }


        Enemy ogre = new Enemy("ogre", 10, 10);

        player.battle(ogre);

    }

    public static String nextLine() {
        String line = scanner.nextLine();
        while (line.startsWith("/")) {
            switch (line) {
                case "/hello":
                    System.out.println("hello");
                    break;
                case "/inv":
                    player.items.forEach(System.out::println);
                    break;
                case "/exit":
                    System.exit(0);
                    break;
                case "/save":
                    try {
                        saveGame();
                        System.out.println("Game Saved!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Command not found!");
                    break;
            }
            line = scanner.nextLine();
        }
        return line;
    }

    public static void saveGame() throws IOException {
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("*").serialize(player);

        File f = new File("Game.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

    public static Player loadGame() throws FileNotFoundException {
        File f = new File("Game.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();

        JsonParser parser = new JsonParser();
        return parser.parse(contents, Player.class);
    }

}