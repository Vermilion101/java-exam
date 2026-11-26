public abstract class Class {
    private final String className;
    private final String starterWeapon;
    private int damage;

    public Class(String className, String starterWeapon, int damage) {
        this.className = className;
        this.starterWeapon = starterWeapon;
        this.damage = damage;
    }

    public String getClassName() {
        return className;
    }

    public int getDamage() {
        return damage;
    }

    public void attack() {
        System.out.println(className + " makes an attack with " + starterWeapon + " and deals " + damage + " damage!");
    }

    public abstract void useAbility();
}
