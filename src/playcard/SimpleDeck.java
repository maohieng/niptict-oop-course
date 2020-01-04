package playcard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/29/2019
 **/
public class SimpleDeck extends Deck {

    static List<Card> create52Cards() {
        List<Card> cards = new ArrayList<>(52);
        Card.Rank[] ranks = Card.Rank.values();
        Card.Suit[] suits = Card.Suit.values();

        for (Card.Rank rank : ranks) {
            for (Card.Suit suit : suits) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
        /*this.cards = cards;*//*ImmutableList.copyOf(cards);*/
        return cards;
    }

    private SimpleDeck(List<Card> cards) {
        super(cards);
    }

    public SimpleDeck() {
        this(create52Cards());
    }

    @Override
    public final void addCard(Card card) {
        throw new IllegalStateException("SimpleDeck limit 52 cards only.");
    }

    @Override
    public final void addCards(List<Card> cards) {
        throw new IllegalStateException("SimpleDeck limit 52 cards only.");
    }
}
