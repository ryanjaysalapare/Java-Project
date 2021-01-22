import java.util.Random;

/**
 * This model class inherits from the humans Class
 * and will let us create wizard characters
 */
public class Wizard extends Humans {

    /**
     * Wizard's Magic
     */
    private int magic;

    /**
     * Constructor that only takes in 1 parameter, which is name
     *
     * @param name Wizard's Name
     */
    public Wizard(String name) {
        super(name);
        Random random = new Random();
        this.magic = random.nextInt(21);
    }

    /**
     * Constructor that takes in 8 parameters, 7 of which is inherited from
     *
     * @param name      Wizard's Name
     * @param strength  Wizard's Random Strength value from 1-20
     * @param dexterity Wizard's Random Dexterity value from 1-20
     * @param armour    Wizard's Random Armour value from 1-20
     * @param moxie     Wizard's Random Moxie value from 1-20
     * @param coins     Wizard's Random Coins value from 1-100
     * @param health    Wizard's Random Health value from 1-100
     * @param enemy     Wizard's Enemy
     * @param magic     Wizard's Random Magic value from 1-20
     */
    public Wizard(String name, int strength, int dexterity, int armour, int moxie, int coins, int health, Elves enemy, int magic) {
        super(name, strength, dexterity, armour, moxie, coins, health, enemy);
        Random random = new Random();
        this.magic = random.nextInt(21);
    }

    /**
     * Gets the Wizard's Magic
     *
     * @return Wizard's Magic
     */
    public int getMagic() {
        /**
         Random random = new Random();
         int randomMagic = random.nextInt(21);
         return this.magic = randomMagic;
         */
        return magic;
    }

    /**
     * Method that lets a Wizard heal a Humanoid based on the Wizard's Magic rating divided by 2.
     * Every time a Wizard casts heal, the Wizard loses 3 magic rating
     *
     * @param target Humanoid chosen to be healed
     */
    public void heal(Humanoid target) {

        int magicRating = this.magic / 2;
        if (getHealth() > 0) {
            if (target.getHealth() > 0) {
                if (getMagic() > 0) {
                    //int magicRating = this.magic / 2;
                    target.setHealth(target.getHealth() + magicRating);
                    this.magic = getMagic() - 3;
                    if (getMagic() < 0)
                        this.magic = 0;
                }
            }
        }
    }

    /**
     * Return a String representation of the Wizard
     *
     * @return String representation of the Wizard
     */
    public String toString() {
        return super.toString()
                + String.format("[MAGIC: %d]", magic);
    }

}

