package main.cinemaproject.dao;

import main.cinemaproject.model.Customers;
import java.util.List;
import java.util.ArrayList;

public interface ICustomerDAO {
    List<Customers> getAllCustomers();
    Customers getCustomerById(int id);
    boolean updateCustomer(Customers customer);
    boolean deleteCustomer(int id);
    Customers login(String username, String password);
    boolean register(String username, String email, String password);  
    boolean addCustomer(Customers customer);
    ArrayList<Customers> searchCustomers(String searchTerm);
    int getCustomerIdByUsername(String username);
}
