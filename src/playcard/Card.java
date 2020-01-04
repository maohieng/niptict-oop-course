package playcard;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/29/2019
 **/
public class Card implements Comparable<Card> {

    public enum Rank {
        TWO,THREE,FOUR,FIVE,SIX,SEVEN,
        EIGHT,NINE,TEN,JACK,QUEEN,KING, ACE;
    }

    public enum Suit {
        HEART, DIAMOND,
        CLUB, SPADE;
    }

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card o) {
        int rankCompared = this.rank.compareTo(o.rank);
        if (rankCompared == 0) {
            return this.suit.compareTo(o.suit);
        }

        return rankCompared;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card("+rank+","+suit+")";
    }
}
