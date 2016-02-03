
/**
 * Created by branden on 2/3/16 at 11:37.
 */
public class Player {


    // Set up Vars
    private String name, weapon, location;


    // Constructors if used


    /**
    * Start Getters and Setters  End of Getters and Setters
    */


    /** End of Getters and Setters */


    public void chooseName() {
        System.out.println("What is your name?");
        this.name = Game.scanner.nextLine();        //read in user input
        System.out.println("Welcome, " + name);

    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        this.weapon = Game.scanner.nextLine();

        //test the weapon
        if (weapon.equalsIgnoreCase("sword") || weapon.equalsIgnoreCase("mace")) {
            System.out.println("You have chosen a " + weapon + "!");
        } else {
            throw new Exception("You have chosen a " + weapon + ". Did you see that in the list of options? No. No you did not. Try again.");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your starting location [forest/tunnel]");
         this.location = Game.scanner.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        } else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid location");
        }

    }
}