package co.bibleit.challenges.B_abstractFactory;

interface HollywoodMoviesInterface {
    String getMovieString();
}

class HollywoodActionMovie implements HollywoodMoviesInterface {

    @Override
    public String getMovieString() {
        return "True Lies is a Hollywood action movie.";
    }
}

class HollywoodComedyMovie implements HollywoodMoviesInterface {

    @Override
    public String getMovieString() {
        return "The Jerk is a Hollywood Comedy Movie";
    }
}
