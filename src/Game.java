import java.util.Scanner;

/**
 * Created by branden on 2/3/16 at 10:56.
 */
public class Game {

    //create a global scanner object
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome friend");

        //create new Player object
        Player player = new Player();

        //run methods on player
        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();

    }


}