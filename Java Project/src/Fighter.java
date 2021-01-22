/**
 * This model class inherits from the humans Class
 * and will let us create fighter characters
 *
 */
public class Fighter extends Humans {

    /**
     * Constructor that only takes in 1 parameter, which is name
     *
     * @param name Fighter's Name
     */
    public Fighter(String name) {
        super(name);
    }

    /**
     * Constructor with 7 parameters, all inherited from the Humans Class
     *
     * @param name      Fighter's Name
     * @param strength  Fighter's Random Strength value from 1-20
     * @param dexterity Fighter's Random Dexterity value from 1-20
     * @param armour    Fighter's Random Armour value from 1-20
     * @param moxie     Fighter's Random Moxie value from 1-20
     * @param coins     Fighter's Random Coins value from 1-100
     * @param health    Fighter's Random Health value from 1-100
     */
    public Fighter(String name, int strength, int dexterity, int armour, int moxie, int coins, int health, Elves enemy) {
        super(name, strength, dexterity, armour, moxie, coins, health, enemy);
    }

    /**
     * Method that deals damage to a Humanoid based on the average of our Strength, Dexterity, and Health then
     * divide it with the armour of the chosen target. The value of the damage will be multiplied by two.
     * If the target has 0 armour, we make it 1 so we can divide.
     * If our health is 0, we cannot attack.
     *
     * @param target Humanoid chosen to be attacked
     */
    public void doubleAttack(Humanoid target) {
        if (getHealth() > 0) {
            if (target.getArmour() == 0)
                target.setArmour(1);
            int totalDmg = (getStrength() + getDexterity() + getHealth()) / 3;
            int doubleDmg = (totalDmg/target.getArmour()) * 2;
            target.setHealth(target.getHealth() - doubleDmg);
        }
        else {
            target.setHealth(target.getHealth());
        }
    }

    /**
     * Return a String representation of the Fighter
     *
     * @return String representation of the Fighter
     */
    @Override
    public String toString() {
        return super.toString();
    }
}

