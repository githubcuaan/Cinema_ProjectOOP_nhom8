package main.cinemaproject.controller;

import main.cinemaproject.dao.ScreeningStatusDAO;
import main.cinemaproject.model.ScreeningStatus;
import main.cinemaproject.utils.JBDCUtils;
import main.cinemaproject.model.ScreeningInfo;
import java.sql.Connection;

import java.util.List;

public class ScreeningStatusController {
    private ScreeningStatusDAO screeningStatusDAO;

    public ScreeningStatusController() {
        Connection connection = JBDCUtils.getConnection();
        this.screeningStatusDAO = new ScreeningStatusDAO(connection);
    }

    public List<ScreeningStatus> getAllScreenings() {
        return screeningStatusDAO.getAllScreenings();
    }

    public boolean updateScreening(ScreeningStatus screening) {
        return screeningStatusDAO.updateScreening(screening);
    }
    public boolean addScreening(ScreeningStatus screening) {
        return screeningStatusDAO.addScreening(screening);
    }

    public ScreeningStatus getScreeningById(int id) {
        return screeningStatusDAO.getScreeningById(id);
    }

    public boolean deleteScreening(int id) {
        return screeningStatusDAO.deleteScreening(id);
    }

    public List<ScreeningInfo> getScreeningInfo(String selectedMovie, String selectedTheater, String selectedDate) {
        return screeningStatusDAO.getScreeningInfo(selectedMovie, selectedTheater, selectedDate);
    }

    public int getScreeningStatusId(String theater, String date, String showtime) {
        return screeningStatusDAO.getScreeningStatusId(theater, date, showtime);
    }
}
