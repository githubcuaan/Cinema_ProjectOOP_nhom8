package main.cinemaproject.dao;

import main.cinemaproject.model.ScreeningStatus;
import java.util.List;

public interface IScreeningStatusDAO {
    boolean addScreening(ScreeningStatus screening);
    
    ScreeningStatus getScreeningById(int id);
    
    List<ScreeningStatus> getAllScreenings();
    
    boolean updateScreening(ScreeningStatus screening);
    
    boolean deleteScreening(int id);
}