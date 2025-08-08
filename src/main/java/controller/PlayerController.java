package controller;


import model.Player;
import view.PlayerView;

import java.util.ArrayList;
import java.util.List;

public class PlayerController {
    private List<Player> players;
    private PlayerView view;

    public PlayerController(PlayerView view) {
        this.players = new ArrayList<>();
        this.view = view;
    }

    public void addPlayer(Player player) {
        players.add(player);
        view.displayMessage("Player added successfully!");
    }

    public void updateStats(int id, int runs, int wickets) {
        for (Player player : players) {
            if (player.getId() == id) {
                player.setRuns(runs);
                player.setWickets(wickets);
                view.displayMessage("Player stats updated!");
                return;
            }
        }
        view.displayMessage("Player not found!");
    }

    public void displayAllPlayers() {
        for (Player player : players) {
            view.displayPlayer(player);
        }
    }
}

