public class Mage extends Class {
    private int mana;

    public Mage(String className, String starterWeapon, int damage) {
        super(className, starterWeapon, damage);
        this.mana = 100;
    }

    @Override 
    public void useAbility() {
        if (mana < 25) {
            System.out.println(super.getClassName() + " dont have enough mana to cast a spell!");
        } else {
            mana = mana - 25;
            System.out.println(super.getClassName() + " spends 25 mana and casts a spell. It deals " + (super.getDamage() * 10) + " damage!");
        }
    }
}