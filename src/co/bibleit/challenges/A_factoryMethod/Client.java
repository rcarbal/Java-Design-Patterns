package co.bibleit.challenges.A_factoryMethod;

public class Client {

    public static void main(String[] args) throws Exception{
        System.out.println("*** this is a factory pattern demo \n");
        AnimalFactoryInterface animalFactory = new ConcreteFactory();

        AnimalInterface duckType = animalFactory.getAnimalType("Duck");
        duckType.eat();

        AnimalInterface tigerType = animalFactory.getAnimalType("Tiger");
        tigerType.eat();

        AnimalInterface lionType = animalFactory.getAnimalType("Lion");
        lionType.eat();

    }
}
