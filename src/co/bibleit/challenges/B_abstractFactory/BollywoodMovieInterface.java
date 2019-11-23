package co.bibleit.challenges.B_abstractFactory;

interface BollywoodMovieInterface {

    String getMovieName();
}

class BollywoodActionMovie implements BollywoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Bang Bang is a Bollywood action movie";
    }
}

class BollywoodComedyMovie implements BollywoodMovieInterface {

    @Override
    public String getMovieName() {
        return "MBBS is a Bollywood comedy movie";
    }
}
