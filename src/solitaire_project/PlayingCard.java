package solitaire_project;

/**
 *
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */
public class PlayingCard extends Card {

    public enum CardSuit {
        HEARTS(1),
        SPADES(2),
        CLUBS(3),
        DIAMONDS(4);

        private int suitValue;

        private CardSuit(int value) {
            this.suitValue = value;
        }

        public int getVal() {
            return suitValue;
        }
    }

    public enum CardRank {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private int cardValue;

        private CardRank(int value) {
            this.cardValue = value;
        }

        public int getVal() {
            return cardValue;
        }

    }

    private CardSuit cardSuit;
    private CardRank cardRank;

    public PlayingCard(CardSuit suits, CardRank ranks) {
        this.cardSuit = suits;
        this.cardRank = ranks;
    }

    public int getRankValue() {
        return cardRank.getVal();
    }

    public int getSuitValue() {
        return cardSuit.getVal();
    }

    @Override
    public String toString() {
        return cardRank.name() + " " + "of" + " " + cardSuit.name();
    }

}
