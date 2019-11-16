package co.bibleit.facoryMethodChallenge;

public class Client {

    public static void main(String[] args) {
        // create a tiger and duck and call their eat method
        Animal tiger = AnimalFactory.getAnimal("TIGER");
        tiger.eat();

        Animal duck = AnimalFactory.getAnimal("DUCK");
        duck.eat();
    }
}
