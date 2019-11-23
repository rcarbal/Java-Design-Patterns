package co.bibleit.challenges.B_abstractFactory;

interface MovieFactoryInterface {

    HollywoodMoviesInterface getHollywoodMovie();
    BollywoodMovieInterface getBollywoodMovie();
}

class ComedyMovieFactory implements MovieFactoryInterface{
    public HollywoodMoviesInterface getHollywoodMovie(){
        return new HollywoodComedyMovie();
    }

    public BollywoodMovieInterface getBollywoodMovie(){
        return new BollywoodComedyMovie();
    }
}

class ActionMovieFactory implements MovieFactoryInterface{
    public HollywoodMoviesInterface getHollywoodMovie(){
        return new HollywoodActionMovie();
    }

    public BollywoodMovieInterface getBollywoodMovie(){
        return new BollywoodActionMovie();
    }
}
