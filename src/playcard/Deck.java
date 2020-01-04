package playcard;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/29/2019
 **/
public class Deck implements DeckAction {

    final List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public List<Card> getCards() {
        return cards;
    }

    @Override
    public synchronized void addCard(Card card) {
        this.cards.add(card);
    }

    @Override
    public synchronized void addCards(List<Card> cards) {
        this.cards.addAll(cards);
    }
}
