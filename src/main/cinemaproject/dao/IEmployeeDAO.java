package main.cinemaproject.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import main.cinemaproject.model.Employee;

public interface IEmployeeDAO {
    Employee login(String username, String password);
    Employee getEmployeeById(int id);
    ArrayList<Employee> getAllEmployee();
    String[] getEmployeeCredentials(int employeeId) throws SQLException;
    boolean deleteEmployee(int employeeId) throws SQLException;
    boolean updateEmployee(Employee employee) throws SQLException;
    boolean updateEmployeeCredentials(int employeeId, String username, String password) throws SQLException;
    boolean addEmployee(Employee employee) throws SQLException;
    void addEmployeeCredentials(int employeeId, String username, String password) throws SQLException;
}
