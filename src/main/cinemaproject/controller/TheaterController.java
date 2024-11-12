package main.cinemaproject.controller;

import java.sql.Connection;
import java.util.ArrayList;

import main.cinemaproject.dao.TheaterDao;
import main.cinemaproject.model.Theater;
import main.cinemaproject.utils.JBDCUtils;

public class TheaterController {
    private TheaterDao theaterDao;
    private Connection connection = JBDCUtils.getConnection();

    public TheaterController()
    {
        this.theaterDao = new TheaterDao(connection);
    }

    public ArrayList<Theater> getAllTheaters() {
        return theaterDao.getAllTheaters();
    }

    public ArrayList<String> getAllTheaterNames()
    {
        return theaterDao.getAllTheaterNames();
    }
}
