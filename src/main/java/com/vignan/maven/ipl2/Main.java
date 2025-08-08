package com.vignan.maven.ipl2;

package com.vignan.maven.ipl2;



import controller.PlayerController;
import model.Player;
import view.PlayerView;

public class Main {
    public static void main(String[] args) {
        PlayerView view = new PlayerView();
        PlayerController controller = new PlayerController(view);

        // Adding Players
        controller.addPlayer(new Player(1, "Virat Kohli", "RCB", "Batsman", 7000, 4));
        controller.addPlayer(new Player(2, "Jasprit Bumrah", "MI", "Bowler", 500, 150));

        // Display all players
        controller.displayAllPlayers();

        // Update a player’s stats
        controller.updateStats(1, 7100, 5);

        // Display again after update
        controller.displayAllPlayers();
    }
}

