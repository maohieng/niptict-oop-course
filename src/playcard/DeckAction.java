package playcard;

import java.util.*;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/29/2019
 **/
public interface DeckAction {

    List<Card> getCards();

    void addCards(List<Card> cards);
    void addCard(Card card);

    static void requireCards(List<Card> cards) {
        if (cards == null || cards.isEmpty())
            throw new IllegalStateException("No card? Oop!");
    }

    default void shuffle() {
        List<Card> cards = getCards();
        requireCards(cards);

        Collections.shuffle(cards);
    }

    default void sort() {
        List<Card> cards = getCards();
        requireCards(cards);

        Collections.sort(cards);
    }

    default void sort(Comparator<Card> c) {
        List<Card> cards = getCards();
        requireCards(cards);

        cards.sort(c);
    }

    /**
     * Deals all cards to the players.
     *
     * @param players
     */
    default void deal(List<Player> players) {
        int numbCard = getCards().size() / players.size();

        deal(players, numbCard);
    }

    default void deal(List<Player> players, int numbCard) {
        deal(players, numbCard, true);
    }

    default void deal(List<Player> players, int numbCard, boolean dealCardsRemoved) {
        List<Card> cards = getCards();
        requireCards(cards);

        int playerSize = players.size();
        int totalCard = numbCard * playerSize;

        if (totalCard > cards.size())
            throw new IllegalArgumentException("Oop! one of the players will get less cards than the others.");

        for (int p = 0; p < playerSize; p++) {
            Player player = players.get(p);
            List<Card> playerCards = new ArrayList<>();

            for (int j = 0; j < numbCard; j++) {
                Card eachCard = cards.get(p + playerSize * j);
                playerCards.add(eachCard);
            }

            player.setCards(playerCards);
        }


        // remove all deal cards
        if (dealCardsRemoved)
            cards.subList(0, totalCard).clear();
    }

}
