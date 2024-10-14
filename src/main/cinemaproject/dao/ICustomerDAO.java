package main.cinemaproject.dao;

import main.cinemaproject.model.Customers;
import java.util.List;

public interface ICustomerDAO {
    List<Customers> getAllCustomers();
    Customers getCustomerById(int id);
    boolean addCustomer(Customers customer);
    boolean updateCustomer(Customers customer);
    boolean deleteCustomer(int id);
    Customers login(String username, String password);
    boolean register(String username, String email, String password);
    void addCustomerCredentials(int customerId, String username, String password);
    String[] getCustomerCredentials(int customerId);
    void updateCustomerCredentials(int customerId, String username, String password);
}
