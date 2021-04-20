package solitaire_project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */

public class GroupOfCards {

    public ArrayList<PlayingCard> cards = new ArrayList<PlayingCard>();
    public int size;

    public ArrayList<PlayingCard> getCards() {
        return cards;
    }

    public ArrayList<PlayingCard> setCards(PlayingCard card) {
        return cards;
    }

    public void populateGroup(ArrayList<PlayingCard> popCards) {
        for (int i = 0; i < this.getSize(); i++) {

            cards.add(popCards.get(i)); 
            popCards.remove(i);

        }
    }

    public void moveCard(ArrayList<PlayingCard> card) {
        PlayingCard faceCard1 = cards.get(0);
        PlayingCard faceCard2 = card.get(0);

        if (faceCard1.getRankValue() == (faceCard2.getRankValue() + 1)
                && faceCard1.getSuitValue() == faceCard2.getSuitValue()) {
            System.out.println("");
            System.out.println("Card has been moved in to the pile!");
            System.out.println("");
            card.add(cards.get(0));
            cards.remove(0);
        } else {
            System.out.println("");
            System.out.println("Sorry, that move is invalid!");
            System.out.println("");
        }
    }

    public void printFace(ArrayList<PlayingCard> card) {
        if (card.isEmpty()) {
            System.out.println(" " + "There are currently no cards in this deck");
        } else {
            PlayingCard faceCard = card.get(0);
            System.out.println(" " + faceCard + " " + "//" + " " + "There are currently" + " " + card.size() + " " + "cards in this pile");
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
