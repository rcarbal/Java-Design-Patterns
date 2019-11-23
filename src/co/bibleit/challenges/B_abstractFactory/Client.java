package co.bibleit.challenges.B_abstractFactory;

public class Client {
    public static void main(String[] args) {
        MovieFactoryInterface hollywoodMovieFactory = FactoryProducer.getFactory("HollywoodMovie");

        // Create a hollywood movie
        HollywoodMoviesInterface hAction = hollywoodMovieFactory.getHollywoodMovie("action");
        HollywoodMoviesInterface hComedy = hollywoodMovieFactory.getHollywoodMovie("comedy");

        System.out.println("\nAction Movies are");
        System.out.println(hAction.getMovieString());
        System.out.println(hComedy.getMovieString());

        // comedy movies
        MovieFactoryInterface bollywoodMovie = FactoryProducer.getFactory("BollywoodMovie");

        // Create a hollywood movie
        BollywoodMovieInterface bAction = bollywoodMovie.getBollywoodMovie("action");
        BollywoodMovieInterface bComedy = bollywoodMovie.getBollywoodMovie("comedy");

        System.out.println("\nComedy Movies are");
        System.out.println(bAction.getMovieName());
        System.out.println(bComedy.getMovieName());
    }



}
