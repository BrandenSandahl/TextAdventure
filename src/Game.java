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


        //run methods on player
        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
        player.findItem("shield");
        player.findItem("boots");
        player.findItem("belt");


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
                default:
                    System.out.println("Command not found!");
                    break;
            }
            line = scanner.nextLine();
        }
        return line;
    }

}