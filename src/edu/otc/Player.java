package edu.otc;

public class Player {
    // Display name for player object.
    private String name;
    // Weapon object to hold data for attack method.
    private Weapon weapon;
    // Health that defaults to 100.
    private int health = 100;

    // Class constructor.
    public Player(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        //this.health = health;
    }

    // Attack method applies damage to the player and returns a damage report string.
    public String attack(int damage) {
        // Decrease by the amount provided until zero is reached.
        health = Math.max(health - damage, 0);
        return String.format("%s lost %s health!\n%s HP remaining.", name, damage, health);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
