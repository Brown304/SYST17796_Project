package solitaire_project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */

public class Solitaire extends Game {

    public Solitaire(String name, ArrayList<Player> players) {
        super.setName(name);
        super.setPlayers(players);
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        String playAgain;
        Deck deck = new Deck(52);
        Tableau tab1 = new Tableau(1);
        Tableau tab2 = new Tableau(2);
        Tableau tab3 = new Tableau(3);
        Tableau tab4 = new Tableau(4);
        Tableau tab5 = new Tableau(5);
        Tableau tab6 = new Tableau(6);
        Tableau tab7 = new Tableau(7);
        Foundation found1 = new Foundation(13);
        Foundation found2 = new Foundation(13);
        Foundation found3 = new Foundation(13);
        Foundation found4 = new Foundation(13);
        Stock stock1 = new Stock(1);
        Stock stock2 = new Stock(1);
        Stock stock3 = new Stock(1);
        Waste waste = new Waste(52);
        deck.populateDeck();
        deck.shuffle();
        tab1.populateGroup(deck.getCards());
        tab2.populateGroup(deck.getCards());
        tab3.populateGroup(deck.getCards());
        tab4.populateGroup(deck.getCards());
        tab5.populateGroup(deck.getCards());
        tab6.populateGroup(deck.getCards());
        tab7.populateGroup(deck.getCards());
        while (k == 0) {
            if (deck.getCards().isEmpty() && found1.getCards().size() == 13
                    && found2.getCards().size() == 13 && found3.getCards().size() == 13
                    && found4.getCards().size() == 13) {
                declareWinner();
                System.out.println("Would you like to play again? Y/N");
                playAgain = scan.nextLine();
                if (playAgain == "Y" || playAgain == "y") {
                    continue;
                } else {
                    break;
                }
            } else if (deck.getCards().isEmpty()) {
                System.out.println("The round has been lost!");
                System.out.println("Would you like to play again? Y/N");
                playAgain = scan.nextLine();
                if (playAgain == "Y" || playAgain == "y") {
                    continue;
                } else {
                    break;
                }
            } else {
                deck.printFace(deck.getCards());
                System.out.println("");
                System.out.print("Foundations Pile 1 Face Card:" + "");
                found1.printFace(found1.getCards());
                System.out.print("Foundations Pile 2 Face Card:" + "");
                found2.printFace(found2.getCards());
                System.out.print("Foundations Pile 3 Face Card:" + "");
                found3.printFace(found3.getCards());
                System.out.print("Foundations Pile 4 Face Card:" + "");
                found4.printFace(found4.getCards());
                System.out.println("");
                System.out.print("Tableau Pile 1 Face Card:" + "");
                tab1.printFace(tab1.getCards());
                System.out.print("Tableau Pile 2 Face Card:" + "");
                tab2.printFace(tab2.getCards());
                System.out.print("Tableau Pile 3 Face Card:" + "");
                tab3.printFace(tab3.getCards());
                System.out.print("Tableau Pile 4 Face Card:" + "");
                tab4.printFace(tab4.getCards());
                System.out.print("Tableau Pile 5 Face Card:" + "");
                tab5.printFace(tab5.getCards());
                System.out.print("Tableau Pile 6 Face Card:" + "");
                tab6.printFace(tab6.getCards());
                System.out.print("Tableau Pile 7 Face Card:" + "");
                tab7.printFace(tab7.getCards());
                System.out.println("");
                waste.printFace(waste.getCards());
                System.out.println("");                
                System.out.println("Enter the number 1 to move a card from a Tableau pile to a Foundations pile.");
                System.out.println("Enter the number 2 to draw several cards from the stock pile (choose if you are out of available moves).");
                System.out.println("Enter the number 0 to exit the game.");
                l = scan.nextInt();
                if (l == 1) {
                    System.out.println("Please choose a Tableau pile to move a card from (enter a number from 1 - 7):");
                    m = scan.nextInt();
                    System.out.println("Please choose a Foudnations pile to move a card to (enter a number from 1 - 4):");
                    n = scan.nextInt();
                    if (m == 1 && n == 1) {
                        if (found1.getCards().isEmpty()) {
                            tab1.moveFirstCard(found1.getCards());
                            continue;
                        } else {
                            tab1.moveCard(found1.getCards());
                            continue;
                        }
                    }
                    if (m == 1 && n == 2) {
                        if (found2.getCards().isEmpty()) {
                            tab1.moveFirstCard(found2.getCards());
                            continue;
                        } else {
                            tab1.moveCard(found2.getCards());
                            continue;
                        }
                    }
                    if (m == 1 && n == 3) {
                        if (found3.getCards().isEmpty()) {
                            tab1.moveFirstCard(found3.getCards());
                            continue;
                        } else {
                            tab1.moveCard(found3.getCards());
                            continue;
                        }
                    }
                    if (m == 1 && n == 4) {
                        if (found4.getCards().isEmpty()) {
                            tab1.moveFirstCard(found4.getCards());
                            continue;
                        } else {
                            tab1.moveCard(found4.getCards());
                            continue;
                        }
                    }
                    if (m == 2 && n == 1) {
                        if (found1.getCards().isEmpty()) {
                            tab2.moveFirstCard(found1.getCards());
                            continue;
                        } else {
                            tab2.moveCard(found1.getCards());
                            continue;
                        }
                    }
                    if (m == 2 && n == 2) {
                        if (found2.getCards().isEmpty()) {
                            tab2.moveFirstCard(found2.getCards());
                            continue;
                        } else {
                            tab2.moveCard(found2.getCards());
                            continue;
                        }
                    }
                    if (m == 2 && n == 3) {
                        if (found3.getCards().isEmpty()) {
                            tab2.moveFirstCard(found3.getCards());
                            continue;
                        } else {
                            tab2.moveCard(found3.getCards());
                            continue;
                        }
                    }
                    if (m == 2 && n == 4) {
                        if (found4.getCards().isEmpty()) {
                            tab2.moveFirstCard(found4.getCards());
                            continue;
                        } else {
                            tab2.moveCard(found4.getCards());
                            continue;
                        }
                    }
                    if (m == 3 && n == 1) {
                        if (found1.getCards().isEmpty()) {
                            tab3.moveFirstCard(found1.getCards());
                            continue;
                        } else {
                            tab3.moveCard(found1.getCards());
                            continue;
                        }
                    }
                    if (m == 3 && n == 2) {
                        if (found2.getCards().isEmpty()) {
                            tab3.moveFirstCard(found2.getCards());
                            continue;
                        } else {
                            tab3.moveCard(found2.getCards());
                            continue;
                        }
                    }
                    if (m == 3 && n == 3) {
                        if (found3.getCards().isEmpty()) {
                            tab3.moveFirstCard(found3.getCards());
                            continue;
                        } else {
                            tab3.moveCard(found3.getCards());
                            continue;
                        }
                    }
                    if (m == 3 && n == 4) {
                        if (found4.getCards().isEmpty()) {
                            tab3.moveFirstCard(found4.getCards());
                            continue;
                        } else {
                            tab3.moveCard(found4.getCards());
                            continue;
                        }
                    }
                    if (m == 4 && n == 1) {
                        if (found1.getCards().isEmpty()) {
                            tab4.moveFirstCard(found1.getCards());
                            continue;
                        } else {
                            tab4.moveCard(found1.getCards());
                            continue;
                        }
                    }
                    if (m == 4 && n == 2) {
                        if (found2.getCards().isEmpty()) {
                            tab4.moveFirstCard(found2.getCards());
                            continue;
                        } else {
                            tab4.moveCard(found2.getCards());
                            continue;
                        }
                    }
                    if (m == 4 && n == 3) {
                        if (found3.getCards().isEmpty()) {
                            tab4.moveFirstCard(found3.getCards());
                            continue;
                        } else {
                            tab4.moveCard(found3.getCards());
                            continue;
                        }
                    }
                    if (m == 4 && n == 4) {
                        if (found4.getCards().isEmpty()) {
                            tab4.moveFirstCard(found4.getCards());
                            continue;
                        } else {
                            tab4.moveCard(found4.getCards());
                            continue;
                        }
                    }
                    if (m == 5 && n == 1) {
                        if (found1.getCards().isEmpty()) {
                            tab5.moveFirstCard(found1.getCards());
                            continue;
                        } else {
                            tab5.moveCard(found1.getCards());
                            continue;
                        }
                    }
                    if (m == 5 && n == 2) {
                        if (found2.getCards().isEmpty()) {
                            tab5.moveFirstCard(found2.getCards());
                            continue;
                        } else {
                            tab5.moveCard(found2.getCards());
                            continue;
                        }
                    }
                    if (m == 5 && n == 3) {
                        if (found3.getCards().isEmpty()) {
                            tab5.moveFirstCard(found3.getCards());
                            continue;
                        } else {
                            tab5.moveCard(found3.getCards());
                            continue;
                        }
                    }
                    if (m == 5 && n == 4) {
                        if (found4.getCards().isEmpty()) {
                            tab5.moveFirstCard(found4.getCards());
                            continue;
                        } else {
                            tab5.moveCard(found4.getCards());
                            continue;
                        }
                    }
                    if (m == 6 && n == 1) {
                        if (found1.getCards().isEmpty()) {
                            tab6.moveFirstCard(found1.getCards());
                            continue;
                        } else {
                            tab6.moveCard(found1.getCards());
                            continue;
                        }
                    }
                    if (m == 6 && n == 2) {
                        if (found2.getCards().isEmpty()) {
                            tab6.moveFirstCard(found2.getCards());
                            continue;
                        } else {
                            tab6.moveCard(found2.getCards());
                            continue;
                        }
                    }
                    if (m == 6 && n == 3) {
                        if (found3.getCards().isEmpty()) {
                            tab6.moveFirstCard(found3.getCards());
                            continue;
                        } else {
                            tab6.moveCard(found3.getCards());
                            continue;
                        }
                    }
                    if (m == 6 && n == 4) {
                        if (found4.getCards().isEmpty()) {
                            tab6.moveFirstCard(found4.getCards());
                            continue;
                        } else {
                            tab6.moveCard(found4.getCards());
                            continue;
                        }
                    }

                } else if (l == 2) {
                    int p = 0;
                    int q = 0;
                    int r = 0;
                    stock1.populateGroup(deck.getCards());
                    stock2.populateGroup(deck.getCards());
                    stock3.populateGroup(deck.getCards());
                    System.out.println("");
                    System.out.println("The following cards were Drawn:");
                    stock1.printFace(stock1.getCards());
                    stock2.printFace(stock2.getCards());
                    stock3.printFace(stock3.getCards());
                    System.out.println("Press 1 to move a drawn card to a Tableau pile, or enter any other number to re-shuffle the deck.");
                    p = scan.nextInt();
                    System.out.println("");
                    if (p == 1) {
                        System.out.println("Please enter a number to choose a card to move, according to the order it was printed in (enter value from 1 - 3)");
                        q = scan.nextInt();
                        System.out.println("");
                        System.out.println("Please enter a Tableau  pile to move the chosen card into (enter a value from 1 - 4).");
                        r = scan.nextInt();
                        System.out.println("");
                        if (q == 1 && r == 1) {
                            stock1.moveCard(tab1.getCards());
                        } else if (q == 1 && r == 2) {
                            stock1.moveCard(tab2.getCards());
                        } else if (q == 1 && r == 3) {
                            stock1.moveCard(tab3.getCards());
                        } else if (q == 1 && r == 4) {
                            stock1.moveCard(tab4.getCards());
                        } else if (q == 1 && r == 5) {
                            stock1.moveCard(tab5.getCards());
                        } else if (q == 1 && r == 6) {
                            stock1.moveCard(tab6.getCards());
                        } else if (q == 1 && r == 7) {
                            stock1.moveCard(tab7.getCards());
                        } else if (q == 2 && r == 1) {
                            stock2.moveCard(tab1.getCards());
                        } else if (q == 2 && r == 2) {
                            stock2.moveCard(tab2.getCards());
                        } else if (q == 2 && r == 3) {
                            stock2.moveCard(tab3.getCards());
                        } else if (q == 2 && r == 4) {
                            stock2.moveCard(tab4.getCards());
                        } else if (q == 2 && r == 5) {
                            stock2.moveCard(tab5.getCards());
                        } else if (q == 2 && r == 6) {
                            stock2.moveCard(tab6.getCards());
                        } else if (q == 2 && r == 7) {
                            stock2.moveCard(tab7.getCards());
                        } else if (q == 3 && r == 1) {
                            stock3.moveCard(tab1.getCards());
                        } else if (q == 3 && r == 2) {
                            stock3.moveCard(tab2.getCards());
                        } else if (q == 3 && r == 3) {
                            stock3.moveCard(tab3.getCards());
                        } else if (q == 3 && r == 4) {
                            stock3.moveCard(tab4.getCards());
                        } else if (q == 3 && r == 5) {
                            stock3.moveCard(tab5.getCards());
                        } else if (q == 3 && r == 6) {
                            stock3.moveCard(tab6.getCards());
                        } else if (q == 3 && r == 7) {
                            stock3.moveCard(tab7.getCards());
                        } else {
                            deck.shuffle();
                            waste.populateWaste(stock1.getCards());
                            waste.populateWaste(stock2.getCards());
                            waste.populateWaste(stock3.getCards());
                            System.out.println("Incorrect input! Cards have been placed in to the waste pile and deck has been re-shuffled.");
                        }
                    } else {
                        deck.shuffle();
                        waste.populateWaste(stock1.getCards());
                        waste.populateWaste(stock2.getCards());
                        waste.populateWaste(stock3.getCards());
                        System.out.println("Cards have been placed in to the waste pile and deck has been re-shuffled.");
                    }
                } else if (l == 0) {
                    System.exit(0);
                } else {
                    System.out.println("");
                    System.out.println("Incorrect value entered! Please re-enter a valid number.");
                    System.out.println("");
                }
            }
        }
    }

    @Override
    public void declareWinner() {
        System.out.println("Congratulations, you won the game!");
    }

}
