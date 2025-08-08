package view;


import model.Player;

public class PlayerView {

    public void displayPlayer(Player player) {
        System.out.println("ID: " + player.getId());
        System.out.println("Name: " + player.getName());
        System.out.println("Team: " + player.getTeam());
        System.out.println("Role: " + player.getRole());
        System.out.println("Runs: " + player.getRuns());
        System.out.println("Wickets: " + player.getWickets());
        System.out.println("--------------------------");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
