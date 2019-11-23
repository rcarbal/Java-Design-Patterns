package co.bibleit.challenges.B_abstractFactory;

public class Client {
    public static void main(String[] args) {
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory("Action");

        // Create a hollywood movie
        HollywoodMoviesInterface hAction = actionMovies.getHollywoodMovie();
        BollywoodMovieInterface bAction = actionMovies.getBollywoodMovie();

        System.out.println("\nAction Movies are");
        System.out.println(hAction.getMovieString());
        System.out.println(bAction.getMovieName());

        // comedy movies
        MovieFactoryInterface comedyMovies = FactoryProducer.getFactory("Comedy");

        // Create a hollywood movie
        HollywoodMoviesInterface hComedy = actionMovies.getHollywoodMovie();
        BollywoodMovieInterface bComedy = actionMovies.getBollywoodMovie();

        System.out.println("\nComedy Movies are");
        System.out.println(hComedy.getMovieString());
        System.out.println(bComedy.getMovieName());
    }



}
