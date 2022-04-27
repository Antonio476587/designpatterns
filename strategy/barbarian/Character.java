package poo.strategy.barbarian;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {}

    public abstract void display();

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior wb) {
        this.weapon = wb;
    }
}