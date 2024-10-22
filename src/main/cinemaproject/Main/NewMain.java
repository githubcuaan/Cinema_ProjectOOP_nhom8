/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.cinemaproject.Main;

import java.sql.Connection;
import main.cinemaproject.dao.MovieDAO;
import main.cinemaproject.database.JBDCUntil;

/**
 *
 * @author DinhAn
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void testGetMovieId() {
        Connection con = JBDCUntil.getConnection();
        MovieDAO movieDAO = new MovieDAO(con);
            int movieId = movieDAO.getMovieId("Avengers: Endgame"); // Thay bằng tên phim thực tế
            System.out.println(movieId);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        testGetMovieId();

    }
    
}
