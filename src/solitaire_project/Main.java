package solitaire_project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */

public class Main {

    public void printFace(ArrayList<Card> card) {
        Card faceCard = card.get(0);
        System.out.println(faceCard);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gameType = "Solitaire";
        String user;
        String pass;
        PasswordAuthenticator auth = new PasswordAuthenticator();
        int i = 0;
        int j = 0;
        while (i == 0) {
            System.out.println("Welcome! Please enter the number 1 to begin the game, or any other number to exit.");
            j = scan.nextInt();
            if (j == 1) {
                System.out.println("Please enter your username and 8 character password to begin.");
                System.out.print("Username:" + " ");
                user = scan.next();
                user.trim();
                System.out.print("Password:" + " ");
                pass = scan.next();
                pass.trim();
                if (auth.authenticate(pass) == true) {
                    Player player1 = new Player(user, pass);
                    ArrayList<Player> players = new ArrayList<Player>();
                    players.add(player1);
                    Solitaire cardGame = new Solitaire(gameType, players);
                    System.out.println("");
                    System.out.println("Welcome to" + " " + cardGame.getName() + "," + " " + cardGame.getPlayers() + "!");
                    System.out.println("");
                    cardGame.play();
                } else {
                    System.out.println("The password entered is under 8 characters long. Please re-enter your information.");
                    continue;
                }
            } else {
                System.exit(0);
            }
        }
    }
}
