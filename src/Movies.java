import java.util.ArrayList;

public class Movies {
    public static void main(String[] args) {
        ArrayList<MovieListings>movieList;
        movieList = new ArrayList<MovieListings>();
        MovieListings Movie;
        //First Movie
        Movie = new MovieListings("Tomb Raider","Nine",2018);
        movieList.add(Movie);
        //Second Movie
        Movie = new MovieListings("Avengers","Eight",2012);
        movieList.add(Movie);
        //Third Movie
        Movie = new MovieListings("Rambo","Five",1997);
        movieList.add(Movie);
        System.out.println(movieList.toString());
        movieList.remove(1);
        System.out.println(movieList.toString());
    }
}
