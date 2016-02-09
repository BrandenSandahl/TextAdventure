import java.util.ArrayList;

/**
 * Created by branden on 2/3/16 at 11:37.
 */
public class Player extends Character{


    // Set up Vars
    String weapon, location;
    ArrayList<String> items = new ArrayList<>();

    public Player() {
        this.health = 20;
        this.damage = 20;
    }



    public void chooseName() {
        System.out.println("What is your name?");
        this.name = Game.nextLine();        //read in user input
        System.out.printf("Welcome, %s\n" , name);

    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        this.weapon = Game.nextLine();

        //test the weapon
        if (weapon.equalsIgnoreCase("sword") || weapon.equalsIgnoreCase("mace")) {
            System.out.println("You have chosen a " + weapon + "!");
        } else {
            throw new Exception("You have chosen a " + weapon + ". Did you see that in the list of options? No. No you did not. Try again.");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your starting location [forest/tunnel]");
         this.location = Game.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        } else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid location");
        }

    }

    public void findItem(String item) {
        System.out.printf("You have found a %s! Pick it up? [y/n]: \t", item);
        String answer = Game.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
        }

    }


}