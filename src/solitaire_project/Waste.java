package solitaire_project;

import java.util.ArrayList;

/**
 *
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */

public class Waste extends GroupOfCards {

    public Waste(int size) {
        this.size = size;
    }
    
    public void populateWaste(ArrayList<PlayingCard> popCards) {   
        int i = 0;         
        cards.add(popCards.get(i));
        popCards.remove(i);
    }
    
    @Override
    public void printFace(ArrayList<PlayingCard> card) {
        if (card.isEmpty()) {
            System.out.println("Waste:" + " " + "There are currently no cards in this deck");
        } else {
            PlayingCard faceCard = card.get(0);
            System.out.println("Waste:" + " " + "There are currently" + " " + card.size() + " " + "cards in this pile");
        }
    }

}