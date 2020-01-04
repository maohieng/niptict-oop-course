package eat;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/29/2019
 **/
public class Chicken extends Animal implements Edible {
    @Override
    String sound() {
        return "cock!cock!";
    }

    @Override
    public String howToEat() {
        return "Chicken soup.";
    }
}
