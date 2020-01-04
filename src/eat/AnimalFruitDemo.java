package eat;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/29/2019
 **/
public class AnimalFruitDemo {
    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal chicken = new Chicken();
        // V1
        Animal[] animals = {new Chicken(), new Dog()};
        Fruit[] fruits = {new Apple(), new Orange()};

        for (Animal animal : animals) {
            println("Animal: " + animal + ", sound: " + animal.sound());

            if (animal instanceof Edible) {
                Edible animalEdible = (Edible) animal;
                println("---- Animal edible: " + animalEdible.howToEat());
            }
        }

        println("");

        Object[] objects = {
                new Apple(), new Dog(),
                new Orange(), new Chicken()
        };

        for (Object object : objects) {
            if (object instanceof Edible)
                println("Edible object: " + ((Edible) object).howToEat());

            if (object instanceof Animal)
                println("Animal object: " + ((Animal) object).sound());
        }
//
//        for (Animal animal : animals) {
//            println("Animal: " + animal + ", sound: " + animal.sound());
//
//            if (animal instanceof Edible) {
//                println("Edible: " + ((Edible) animal).howToEat());
//            }
//        }
//
//        for (Fruit fruit : fruits) {
//            println("Fruit: " + fruit + ", howToEat: " + fruit.howToEat());
//        }
//
//        println("");
//
//        // V2
//        Object[] objects = {new Chicken(), new Dog(), new Apple(), new Orange()};
//        for (Object object : objects) {
//            println(object.toString());
//
//            if (object instanceof Animal) {
//                println("Sound: " + ((Animal) object).sound());
//            }
//
//            if (object instanceof Edible) {
//                println("Eat: " + ((Edible) object).howToEat());
//            }
//        }
    }

    public static void println(Object s) {
        System.out.println(s);
    }
}
