/**
 * This model class inherits from the Humanoid Class
 * and will let us create hobbit characters
 *
 */
public class Hobbits extends Humanoid {

    /**
     * Constructor that only takes in 1 parameter, which is name
     *
     * @param name Name of a the Hobbit
     */
    public Hobbits(String name) {
        super(name);
    }

    /**
     * Constructor that takes in 7 parameters, all inherited from the Humanoid Class (Top Class)
     *
     * @param name      Hobbit's Name
     * @param strength  Hobbit's Random Strength value from 1-20
     * @param dexterity Hobbit's Random Dexterity value from 1-20
     * @param armour    Hobbit's Random Armour value from 1-20
     * @param moxie     Hobbit's Random Moxie value from 1-20
     * @param coins     Hobbit's Random Coins value from 1-100
     * @param health    Hobbit's Random Health value from 1-100
     */
    public Hobbits(String name, int strength, int dexterity, int armour, int moxie, int coins, int health) {
        super(name, strength, dexterity, armour, moxie, coins, health);
    }

    /**
     * A method that lets a Hobbit steal a coin from any Humanoid. The amount that will be stolen
     * is going to be based on the Hobbits Dexterity divided by 2.
     *
     * @param target Humanoid we want to steal money from
     */
    public void stealCoin(Humanoid target) {
        if (getHealth() > 0){
            int steal = getDexterity() / 2;
            target.setCoins(target.getCoins() - steal);
            setCoins(getCoins() + steal);
        }
        else {
            target.setCoins(target.getCoins());
        }
    }

    /**
     * Return a String representation of the Hobbits
     *
     * @return String representation of the Hobbits
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
