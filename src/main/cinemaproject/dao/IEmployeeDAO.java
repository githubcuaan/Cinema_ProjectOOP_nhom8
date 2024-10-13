package main.cinemaproject.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import main.cinemaproject.model.Employee;

public interface IEmployeeDAO {
    Employee login(String username, String password);
    Employee getEmployeeById(int id);
    ArrayList<Employee> getAllEmployee();
    String[] getEmployeeCredentials(int employeeId) throws SQLException;
    void deleteEmployee(int employeeId) throws SQLException;
    void updateEmployee(Employee employee) throws SQLException;
    void updateEmployeeCredentials(int employeeId, String username, String password) throws SQLException;
    int addEmployee(Employee employee) throws SQLException;
    void addEmployeeCredentials(int employeeId, String username, String password) throws SQLException;
}
