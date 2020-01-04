package playcard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 1/4/2020
 **/
public class PlayCardApp {

    ///////////////////////////////////////////////////////////////////////////
    // Demo
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Player[] players = {
                new Player("Dog"),
                new Player("Cat"),
                new Player("Rabbit"),
                new Player("Mouse"),
                new Player("Pig")
        };

        SimpleDeck simpleDeck = new SimpleDeck();

        println("******************* Playing Card App *******************");
        System.out.printf("There are %d players playing card of a %s%n", players.length, SimpleDeck.class.getSimpleName());
        println();

        // Shuffle
        println("Start shuffling...");
        simpleDeck.shuffle();
        println();

        // Deal
        println("Start dealing cards...");
        simpleDeck.deal(Arrays.asList(players));
        println();

        // Print players' cards
        forEach(players, player -> {
            println(player);
            List<Card> playerCards = player.getCards();
            println(playerCards);

            // Sort their playerCards
            println("====> Player sorts their cards");
//            DeckAction.sort(playerCards);
            playerCards.sort(Comparator.reverseOrder());
            println("====> " + playerCards);
        });

        println();

        // Remain cards in deck
        println("Cards remain in the deck: ");
        println(simpleDeck.getCards());
    }

    public static void println(Object s) {
        System.out.println(s);
    }

    public static void println() {
        System.out.println();
    }

    public static <T> void forEach(T[] array, Consumer<T> action) {
        Objects.requireNonNull(action);
        for (T t : array) {
            action.accept(t);
        }
    }
}
