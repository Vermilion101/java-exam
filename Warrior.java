public class Warrior extends Class {
    private int rage;

    public Warrior(String className, String starterWeapon, int damage) {
        super(className, starterWeapon, damage);
        this.rage = 0;
    }

    @Override 
    public void attack() {
        super.attack();
        if (rage >= 100) {
            System.out.println(super.getClassName() + "s rage bar is full.");
        } else {
            rage = rage + 20;
            System.out.println(super.getClassName() + " recived 20 rage.");
        }
    }
    @Override 
    public void useAbility() {
        if (rage < 20) {
            System.out.println(super.getClassName() + " dont have enough rage to use an ability!");
        } else {
            rage = rage - 20;
            System.out.println(super.getClassName() + " spends 20 rage and uses an ability. It deals " + (super.getDamage() * 1.5) + " damage!");
        }
    }
}
