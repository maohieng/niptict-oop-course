package playcard;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/29/2019
 **/
public class Player {
    private final String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Player: " + name;
    }
}
