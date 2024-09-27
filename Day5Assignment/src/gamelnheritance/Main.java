package gamelnheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a game:");
        String gameName = scanner.nextLine();

        System.out.println("Enter the maximum number of players:");
        int maxPlayers = scanner.nextInt();
        scanner.nextLine();

        Game game = new Game();
        game.setName(gameName);
        game.setMaxNumPlayers(maxPlayers);

        System.out.println("Enter a game that has time limit:");
        String timeGameName = scanner.nextLine();

        System.out.println("Enter the maximum number of players:");
        int timeGameMaxPlayers = scanner.nextInt();

        System.out.println("Enter the time limit in minutes:");
        int timeLimit = scanner.nextInt();

        GameWithTimeLimit gameWithTime = new GameWithTimeLimit();
        gameWithTime.setName(timeGameName);
        gameWithTime.setMaxNumPlayers(timeGameMaxPlayers);
        gameWithTime.setTimeLimit(timeLimit);

        System.out.println();
        System.out.println(game.toString());
        System.out.println(gameWithTime.toString());

        scanner.close();
    }
}
