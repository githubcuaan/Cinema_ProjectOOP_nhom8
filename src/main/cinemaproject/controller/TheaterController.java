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

    public Theater getTheaterById(int id)
    {
        return theaterDao.getTheaterById(id);
    }


    public ArrayList<Theater> getAllTheaters() {
        return theaterDao.getAllTheaters();
    }

    public ArrayList<String> getAllTheaterNames()
    {
        return theaterDao.getAllTheaterNames();
    }

    public boolean deleteTheater(int theaterId)
    {
        return theaterDao.deleteTheater(theaterId);
    }

    public boolean addTheater(Theater theater)
    {
        return theaterDao.addTheater(theater);
    }

    public boolean updateTheater(Theater theater)
    {
        return theaterDao.updateTheater(theater);
    }

    public int getTheaterId(String theaterName)
    {
        return theaterDao.getTheaterId(theaterName);
    }
}
