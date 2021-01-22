import java.util.Random;

/**
 * This model class inherits from the Humanoid Class
 * and will let us create human characters
 *
 */
public class Humans extends Humanoid {

    /**
     * Human's Enemy
     */
    private Elves enemy;

    /**
     * Constructor that only takes in 1 parameter, which is name
     *
     * @param name Human's Name
     */
    public Humans(String name){
        super(name);
        this.enemy = new Elves("Junior Elf");
    }

    /**
     * Constructor with 8 parameters, 7 of which is inherited from Humanoid Class (Top Class)
     *
     * @param name      Human's Name
     * @param strength  Human's Random Strength value from 1-20
     * @param dexterity Human's Random Dexterity value from 1-20
     * @param armour    Human's Random Armour value from 1-20
     * @param moxie     Human's Random Moxie value from 1-20
     * @param coins     Human's Random Coins value from 1-100
     * @param health    Human's Random Health value from 1-100
     * @param enemy     Human's Enemy
     */
    public Humans(String name, int strength, int dexterity, int armour, int moxie, int coins, int health, Elves enemy){
        super(name, strength, dexterity, armour, moxie, coins, health);
        this.enemy = enemy;
    }

    /**
     * Gets the Elf enemy of the Human
     * @return Elf Enemy of the Human
     */
    public Elves getEnemy(){
        return this.enemy;
    }

    /**
     * Return a String representation of the Human
     *
     * @return String representation of the Human
     */
    @Override
    public String toString() {
        return super.toString() +
               String.format("[ENEMY: %s]", getEnemy().getName());
    }
}
