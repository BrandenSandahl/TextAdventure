import java.util.Scanner;

/**
 * Created by branden on 2/3/16 at 10:56.
 */
public class Game {

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome friend");
        System.out.println("What is your name?");

        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();        //read in user input
        System.out.println("Welcome, " + name);

        System.out.println("Choose your weapon [sword/mace]");
        String weapon = scanner.nextLine();

        //test the weapon
        if (weapon.equalsIgnoreCase("sword") || weapon.equalsIgnoreCase("mace")) {
            System.out.println("You have chosen a " + weapon + "!");
        } else {
            throw new Exception("You have chosen a " + weapon + ". Did you see that in the list of options? No. No you did not. Try again.");
        }

        //read in location
        System.out.println("Choose your starting location [forest/tunnel]");
        String startingLocation = scanner.nextLine();

        if (startingLocation.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        } else if (startingLocation.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid location");
        }

    }


}