import javax.swing.*;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.security.PublicKey;
import java.util.Random;

/**
 * This model class will be our Top Class for Humanoids and will let us create characters of Elves, Hobbits, and Humans.
 * This will be inherited by Class Elves, Hobbits, and Humans.
 *
 */
public class Humanoid {

    /**
     * Humanoid's Name
     */
    private String name;
    /**
     * Humanoid's Strength
     */
    private int strength;
    /**
     * Humanoid's Dexterity
     */
    private int dexterity;
    /**
     * Humanoid's Armour
     */
    private int armour;
    /**
     * Humanoid's Moxie
     */
    private int moxie;
    /**
     * Humanoid's Coins
     */
    private int coins;
    /**
     * Humanoid's Health
     */
    private int health;


    /**
     * Constructor that only takes in 1 parameter, which is name
     *
     * @param name Humanoid's Name
     */
    public Humanoid(String name) {
        Random random = new Random();
        this.name = name;
        this.strength = random.nextInt(21);
        this.dexterity = random.nextInt(21);
        this.armour = random.nextInt(21);
        this.moxie = random.nextInt(21);
        this.coins = random.nextInt(100);
        this.health = random.nextInt(100);
    }

    /**
     * Constructor that takes in 7 parameters with random values except for the name
     *
     * @param name      Humanoid's Name
     * @param strength  Humanoid's Random Strength value from 1-20
     * @param dexterity Humanoid's Random Dexterity value from 1-20
     * @param armour    Humanoid's Random Armour value from 1-20
     * @param moxie     Humanoid's Random Moxie value from 1-20
     * @param coins     Humanoid's Random Coins value from 1-100
     * @param health    Humanoid's Random Health value from 1-100
     */
    public Humanoid(String name, int strength, int dexterity, int armour, int moxie, int coins, int health) {
        Random random = new Random();
        this.name = name;
        this.strength = random.nextInt(21);
        this.dexterity = random.nextInt(21);
        this.armour = random.nextInt(21);
        this.moxie = random.nextInt(21);
        this.coins = random.nextInt(100);
        this.health = random.nextInt(100);
    }

    /**
     * Sets the coins of the Humanoids
     *
     * @param coins Humanoid's coins
     */
    public void setCoins(int coins) {
        this.coins = coins;
    }

    /**
     * Sets the health of the Humanoids
     *
     * @param health Humanoid's health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Sets the armour of the Humanoids
     *
     * @param armour Humanoid's armour
     */
    public void setArmour(int armour) {
        this.armour = armour;
    }

    /**
     * Gets the name of the Humanoids
     *
     * @return name of the Humanoid
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the strength of the Humanoids
     *
     * @return strength of the Humanoids
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Gets the dexterity of the Humanoids
     *
     * @return dexterity of the Humanoids
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Gets the armour of the Humanoids
     *
     * @return armour of the Humanoids
     */
    public int getArmour() {
        return armour;
    }

    /**
     * Gets the moxie of the Humanoids
     *
     * @return moxie of the Humanoids
     */
    public int getMoxie() {
        return moxie;
    }

    /**
     * Gets the coins of the Humanoids
     *
     * @return coins of the Humanoids
     */
    public int getCoins() {
        return coins;
    }

    /**
     * Gets the health of the Humanoids
     *
     * @return health of the Humanoids
     */
    public int getHealth() {
        return health;
    }

    /**
     * Method that deals damage to a Humanoid based on the average of our Strength, Dexterity, and Health then
     * divide it with the armour of the chosen target. If the target has 0 armour, we make it 1 so we can divide.
     * If our health is 0, we cannot attack.
     *
     * @param target Humanoid we want to attack.
     */
    public void attack(Humanoid target) {
        if (health > 0) {
            if (target.armour == 0)
                target.armour = 1;
            int damage = (strength + dexterity + health) / 3;
            int newHealth = target.health - (damage / target.armour);
            target.setHealth(newHealth);
        }
    }

    /**
     * Method that tells us if a Humanoid is "ALIVE" or "DEAD" based on their health
     *
     * @return health status of the Humanoid based on their health
     */
    public String healthStatus() {
        if (health > 0) {
            return "[ALIVE]";
        } else {
            this.health = 0;
            this.strength = 0;
            this.dexterity = 0;
            this.armour = 0;
            this.moxie = 0;
            return "[DEAD]";
        }
    }

    /**
     * Returns a String representation of the Humanoids
     *
     * @return String representation of the Humanoids
     */
    @Override
    public String toString() {
        return
                name + healthStatus() + " [" +
                        "Strength = " + strength +
                        ", Dexterity = " + dexterity +
                        ", Armour = " + armour +
                        ", Moxie = " + moxie +
                        ", Coins = " + coins +
                        ", Health = " + health + "]";
    }
}

