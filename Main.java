public class Main {

    public static void main(String[] args) {
        Class warrior = new Warrior("Warrior", "Sword", 15);
        Class mage = new Mage("Mage", "Staff", 3);
        battle(warrior);
        battle(mage);
    }

    public static void battle(Class c) {
        c.attack();
        c.useAbility();
        c.useAbility();
    }
}