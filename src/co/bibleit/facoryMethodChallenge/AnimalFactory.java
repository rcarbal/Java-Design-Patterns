package co.bibleit.facoryMethodChallenge;

public class AnimalFactory {

    public static Animal getAnimal(String animal){
        switch (animal){
            case "DUCK":
                return new Duck();
            case "TIGER":
                return new Tiger();
            default:
                return null;
        }
    }
}
