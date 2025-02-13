package repository;

import model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieDatabase {

    private List<Movie> movies;
    private int movieIdCounter = 1;

    public MovieDatabase() {
        movies = new ArrayList<>();
        movies.add(new Movie(movieIdCounter++, "Inception", "Sci-Fi", 8.8, "Amazing movie with mind-bending plot", "2010-07-16"));
        movies.add(new Movie(movieIdCounter++, "Titanic", "Romance", 7.8, "Heart-touching love story", "1997-12-19"));
        movies.add(new Movie(movieIdCounter++, "The Dark Knight", "Action", 9.0, "Best Batman movie ever", "2008-07-18"));
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> searchMovies(String title) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public List<Movie> getAllMovies() {
        return Collections.unmodifiableList(movies);
    }
}
