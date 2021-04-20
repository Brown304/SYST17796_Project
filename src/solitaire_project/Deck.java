package solitaire_project;

import java.util.ArrayList;

/**
 *
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */

public class Deck extends GroupOfCards {

    public Deck(int size) {
        this.size = size;
    }

    public void populateDeck() {
        for (PlayingCard.CardSuit j : PlayingCard.CardSuit.values()) { 
            for (PlayingCard.CardRank k : PlayingCard.CardRank.values()) { 
                PlayingCard card = new PlayingCard(j, k); 
                cards.add(card); 
            }
        }
    }

    @Override
    public void printFace(ArrayList<PlayingCard> card) {
        if (card.isEmpty()) {
            System.out.println("Deck:" + " " + "There are currently no cards in this deck");
        } else {
            PlayingCard faceCard = card.get(0);
            System.out.println("Deck:" + " " + "There are currently" + " " + card.size() + " " + "cards in this pile");
        }
    }
    
}
