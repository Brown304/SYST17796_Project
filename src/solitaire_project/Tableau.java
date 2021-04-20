package solitaire_project;

import java.util.ArrayList;

/**
 *
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */
public class Tableau extends GroupOfCards {

    public Tableau(int size) {
        this.size = size;
    }

    public void moveFirstCard(ArrayList<PlayingCard> card) {
        PlayingCard faceCard1 = cards.get(0);
        if (card.isEmpty() && faceCard1.getRankValue() == 1) {
            System.out.println("");
            System.out.println("Ace has been moved in to the pile!");
            System.out.println("");
            card.add(cards.get(0));
            cards.remove(0);
        } else {
            System.out.println("");
            System.out.println("Sorry, that move is invalid!");
            System.out.println("");
        }
    }

}
