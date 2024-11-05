package main.cinemaproject.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import main.cinemaproject.model.Employee;

public interface IEmployeeDAO {
    Employee login(String username, String password);
    Employee getEmployeeById(int id);
    ArrayList<Employee> getAllEmployee();
    boolean deleteEmployee(int employeeId) throws SQLException;
    boolean updateEmployee(Employee employee) throws SQLException;
    boolean addEmployee(Employee employee) throws SQLException;
    boolean isUsernameExists(String username) throws SQLException;
    int getIdByUsername(String username);
}
