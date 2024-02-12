package edu.otc;

import java.util.Random;

public class Game {
    static Random rng = new Random();

    public static void main(String[] args) {
        // Create array of players in the game.
        Player[] playerList = new Player[] {
                new Player("Joseph", new Weapon("rapier", "pierces")),
                new Player("Sally", new Weapon("longsword", "slices"))
        };
        int attackerIndex = 0;
        // Player objects to track which player is attacking and defending.
        Player playerAttacking;
        Player playerDefending = playerList[attackerIndex + 1];

        // While all players still have health then loop through each player attacking the other.
        do {
            // Define damage applied as a random integer 10 to 20.
            int damageNum = rng.nextInt(20 + 1) + 10;
            // Index the players array to set the attacking player.
            playerAttacking = playerList[attackerIndex];

            // Display result of the attack, weapon stats, and health remaining.
            System.out.printf("Player %s is attacking.\n", playerAttacking.getName());
            System.out.println(playerAttacking.getWeapon().strike(damageNum));
            System.out.println(playerDefending.attack(damageNum));

            // Transition to next player's turn if the defending player survived the attack.
            if (playerDefending.getHealth() > 0) {
                // Set defending player of next turn to the attacking player
                // and advance attacker to next player in array.
                playerDefending = playerAttacking;
                attackerIndex = (attackerIndex + 1 == playerList.length) ? 0 : attackerIndex + 1;

                // Display transition message on a delay between turns.
                // 4 seconds delay between each turn.
                // Accounts for a possible InterruptedException from Thread.sleep().
                try {
                    Thread.sleep(500);
                    System.out.print("\nNext turn in...");
                    Thread.sleep(500);

                    for (int i = 3; i >= 1; i--) {
                        System.out.print(" " + i);
                        Thread.sleep(1000);
                    }
                    System.out.println("\n");
                }
                catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
        }
        while (playerDefending.getHealth() > 0);

        // Display the game result once a player reaches zero health.
        System.out.printf("\nPlayer %s reached 0 health!\nPlayer %s won!", playerDefending.getName(), playerAttacking.getName());
    }
}
