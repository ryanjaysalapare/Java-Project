import java.util.Random;

/**
 * This model class inherits from the Humanoid class
 * and will let us create our Elf Character
 */
public class Elves extends Humanoid {

    /**
     * Elf's clan
     */
    private String clan;
    /**
     * Elf's friend
     */
    private Hobbits friend;


    /**
     * Constructor that only takes in 1 parameter, which is name
     *
     * @param name Name of the Elf
     */
    public Elves(String name) {
        super(name);
        Random random = new Random();
        int bestFriend = random.nextInt(2);
        if (bestFriend == 1){
            this.friend = new Hobbits("Master Hobbit");
        }
        else{
            this.friend = new Hobbits("Junior Hobbit");
        }
    }

    /**
     * Constructor that takes in 9 Parameters, 7 of which is inherited from Humanoid Class (Top Class)
     *
     * @param name      Elf's Name
     * @param strength  Elf's Random Strength value from 1-20
     * @param dexterity Elf's Random Dexterity value from 1-20
     * @param armour    Elf's Random Armour value from 1-20
     * @param moxie     Elf's Random Moxie value from 1-20
     * @param coins     Elf's Random Coins value from 1-100
     * @param health    Elf's Random Health value from 1-100
     */
    public Elves(String name, int strength, int dexterity, int armour, int moxie, int coins, int health, String clan, Hobbits friend) {
        super(name, strength, dexterity, armour, moxie, coins, health);
        this.clan = clan;
        this.friend = friend;
    }

    /**
     * Gets the clan of an Elf
     *
     * @return Clan of an Elf
     */
    public String getClan() {
        Random random = new Random();
        int clanNumber = random.nextInt(2);
        if (clanNumber == 1) {
            return clan = "FOREST";
        } else {
            return clan = "CITY";
        }
    }

    /**
     * Gets the friend of the Elf, which is a Hobbit
     *
     * @return Hobbit friend of an Elf
     */
    public Hobbits getFriend() {
        return this.friend;
    }

    /**
     * Method that changes the friend of the Elf
     *
     * @return New Best friend of the Elf
     */
    public Hobbits changeFriend() {
        return this.friend = new Hobbits("Junior Hobbit");
    }

    /**
     * Return a String representation of the Elves
     *
     * @return String representation of the Elves
     */
    @Override
    public String toString() {
        return
                super.toString() +
                        String.format("[CLAN: %s][BEST FRIEND: %s]", clan, getFriend().getName());
    }
}

