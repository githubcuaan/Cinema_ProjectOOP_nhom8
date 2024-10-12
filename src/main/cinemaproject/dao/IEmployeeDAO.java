package main.cinemaproject.dao;
import main.cinemaproject.model.Employee;

public interface IEmployeeDAO {
    Employee login(String username, String password);
}
