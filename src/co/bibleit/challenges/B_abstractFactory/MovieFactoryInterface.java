package co.bibleit.challenges.B_abstractFactory;

interface MovieFactoryInterface {

    HollywoodMoviesInterface getHollywoodMovie(String type);
    BollywoodMovieInterface getBollywoodMovie(String type);
}

class HollywoodMovieFactory implements MovieFactoryInterface{
    public HollywoodMoviesInterface getHollywoodMovie(String type){
        if (type.equalsIgnoreCase("action")){
            return new HollywoodActionMovie();
        }
        else if (type.equalsIgnoreCase("comedy")){
            return new HollywoodComedyMovie();
        }
        return null;
    }

    public BollywoodMovieInterface getBollywoodMovie(String type){
        return null;
    }
}

class BollywoodMovieFactory implements MovieFactoryInterface{
    public HollywoodMoviesInterface getHollywoodMovie(String type){
        return null;
    }

    public BollywoodMovieInterface getBollywoodMovie(String type){
        if (type.equalsIgnoreCase("action")){
            return new BollywoodActionMovie();
        }
        else if (type.equalsIgnoreCase("comedy")){
            return new BollywoodComedyMovie();
        }
        return null;
    }

}
