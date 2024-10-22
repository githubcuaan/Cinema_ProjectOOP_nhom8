package main.cinemaproject.dao;

import java.util.ArrayList;
import main.cinemaproject.model.Movie;

public interface IMovieDAO {
    void addMovie(Movie movie);
    void updateMovie(Movie movie);
    void deleteMovie(int id);
    Movie getMovieById(int id);
    ArrayList<Movie> getAllMovies();
    int getMovieId(String movieName);
}
