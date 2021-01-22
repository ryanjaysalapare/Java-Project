/**
 * This class will be the view for the class FAKEWORLD. It is a simple program simulation and in this class
 * we will create Elves, Hobbits, Humans, Fighters, and Wizards.
 * Every humanoid can attack, but if a fighter attacks it will deal double damage.
 * Elves belong either to the "FOREST" or "CITY" clan.
 * If any humanoid gets 0 health, they are DEAD, otherwise they're ALIVE
 * Elves consider one hobbit to be their best friend (but they could change it)
 * Every human have an elf as their sworn enemy and it doesn't change
 * Hobbits can steal money
 * Wizards can heal, but will lose 3 magic rating after casting heal
 *
 *
 * created July 26, 2020
 * @author RYAN JAY SALAPARE - 000823653
 */
public class FakeWorld {
    public static void main(String[] args) {


        System.out.println("WELCOME TO FAKEWORLD!\n");

        //Creating the HUMANOIDS
        //Create Hobbits
        Hobbits hobbit1 = new Hobbits("Master Hobbit");
        Hobbits hobbit2 = new Hobbits("Junior Hobbit", hobbit1.getStrength(), hobbit1.getDexterity(), hobbit1.getArmour(), hobbit1.getMoxie(), hobbit1.getCoins(), hobbit1.getHealth());
        System.out.println(hobbit1);
        System.out.println(hobbit2 + "\n");

        //Create Elves
        Elves elf1 = new Elves("Master Elf");
        Elves elf2 = new Elves("Junior Elf", elf1.getStrength(), elf1.getDexterity(), elf1.getArmour(), elf1.getMoxie(), elf1.getCoins(), elf1.getHealth(), elf1.getClan(), hobbit1);
        System.out.println(elf1);
        System.out.println(elf2 + "\n");

        //Create Humans
        Humans human1 = new Humans("Captain America");
        Humans human2 = new Humans("Ironman", human1.getStrength(), human1.getDexterity(), human1.getArmour(), human1.getMoxie(), human1.getCoins(), human1.getHealth(), elf2);
        System.out.println(human1);
        System.out.println(human2 + "\n");

        //Create Fighters
        Fighter fighter1 = new Fighter("Master Fighter");
        Fighter fighter2 = new Fighter("Junior Fighter", fighter1.getStrength(), fighter1.getDexterity(), fighter1.getArmour(), fighter1.getMoxie(), fighter1.getCoins(), fighter1.getHealth(), fighter1.getEnemy());
        System.out.println(fighter1);
        System.out.println(fighter2 + "\n");

        //Create Wizards
        Wizard wizard1 = new Wizard("Master Wizard");
        Wizard wizard2 = new Wizard("Junior Wizard", wizard1.getStrength(), wizard1.getDexterity(), wizard1.getArmour(), wizard1.getMoxie(), wizard1.getCoins(), wizard1.getHealth(), elf1, wizard1.getMagic());
        System.out.println(wizard1);
        System.out.println(wizard2);

        //Calling attack method
        System.out.printf("\n%s ATTACKED its sworn enemy %s! \n", elf2.getName(), human2.getName());
        elf2.attack(human2);
        System.out.println(human2);

        //Calling steal method of the hobbit
        System.out.printf("\n%s STEAL coins from %s!\n", hobbit1.getName(), human2.getName());
        hobbit1.stealCoin(human2);
        System.out.println(hobbit1);
        System.out.println(human2);

        //Calling double attack method because fighters deal double damage when attacking
        System.out.printf("\n%s ATTACKS %s!\n", fighter1.getName(), hobbit2.getName());
        fighter1.doubleAttack(hobbit2);
        System.out.println(hobbit2);

        //Calling heal method of the wizard
        System.out.printf("\n%s HEALS %s!\n", wizard2.getName(), hobbit1.getName());
        wizard2.heal(hobbit1);
        System.out.println(wizard2);
        System.out.println(hobbit1);

        //ELf changing his best friend because they are fickle and frequently change their minds
        System.out.printf("\n%s CHANGES his best friend!\n", elf2.getName());
        elf2.changeFriend();
        System.out.println(elf2);

    }
}
