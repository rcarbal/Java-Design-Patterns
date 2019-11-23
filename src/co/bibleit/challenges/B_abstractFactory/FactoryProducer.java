package co.bibleit.challenges.B_abstractFactory;

import javax.swing.*;

public class FactoryProducer {

    public static MovieFactoryInterface getFactory(String choice){
        if (choice.equalsIgnoreCase("HollywoodMovie")){
            return new HollywoodMovieFactory();
        }
        else if (choice.equalsIgnoreCase("BollywoodMovie")){
            return new BollywoodMovieFactory();
        }

        return null;
    }
}
