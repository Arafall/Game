package edu.otc;

public class Weapon {
    // Name of weapon, such as "sword", "club", "axe", etc.
    private String weaponType;
    // Manner of attacking, such as "slashes", "bonks", "sears," etc.
    private String weaponAction;

    // Class constructor.
    public Weapon(String weaponType, String weaponAction) {
        this.weaponType = weaponType;
        this.weaponAction = weaponAction;
    }

    // Strike method uses a provided damage amount to return a string of the weapon information.
    public String strike(int newWeaponDamage) {
        return String.format("The %s %s.\nIt does %s damage.", weaponType, weaponAction, newWeaponDamage);
    }
    public String getWeaponAction() {
        return weaponAction;
    }
    public void setWeaponAction(String weaponAction) {
        this.weaponAction = weaponAction;
    }
    public String getWeaponType() {
        return weaponType;
    }
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

}
