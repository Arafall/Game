package edu.otc;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Joseph", new Weapon("rapier", "pierces"));
        Player player2 = new Player("Sally", new Weapon("longsword", "slices"));

        System.out.println(player1.getWeapon().strike(10));
    }
}
