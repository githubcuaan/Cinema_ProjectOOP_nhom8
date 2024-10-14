package main.cinemaproject.controller;

import main.cinemaproject.dao.MovieDAO;
import main.cinemaproject.model.Movie;
import main.cinemaproject.model.MovieStatistics;
import main.cinemaproject.database.JBDCUntil;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class MovieController {
    private MovieDAO movieDAO;

    public MovieController() {
        Connection connection = JBDCUntil.getConnection();
        this.movieDAO = new MovieDAO(connection);
    }

    public void addMovie(Movie movie) {
        movieDAO.addMovie(movie);
    }

    public Movie getMovieById(int id) {
        return movieDAO.getMovieById(id);
    }

    public ArrayList<Movie> getAllMovies() {
        return movieDAO.getAllMovies();
    }

    public void updateMovie(Movie movie) {
        movieDAO.updateMovie(movie);
    }

    public void deleteMovie(int id) {
        movieDAO.deleteMovie(id);
    }

    public List<MovieStatistics> getMovieStatistics() {
        return movieDAO.getMovieStatistics();
    }

    public List<MovieStatistics> getMovieStatistics(String startDate, String endDate) {
        return movieDAO.getMovieStatistics(startDate, endDate);
    }

    public List<MovieStatistics> getMovieStatistics(String movieName, String startDate, String endDate) {
        return movieDAO.getMovieStatistics(movieName, startDate, endDate);
    }

    public List<MovieStatistics> getMovieStatistics(String movieName) {
        return movieDAO.getMovieStatistics(movieName);
    }
}

