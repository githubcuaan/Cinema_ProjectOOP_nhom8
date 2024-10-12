package main.cinemaproject.dao;

import main.cinemaproject.model.Customers;
import java.util.List;

public interface ICustomerDAO {
    List<Customers> getAllCustomers();
    Customers getCustomerById(int id);
    void addCustomer(Customers customer);
    void updateCustomer(Customers customer);
    void deleteCustomer(int id);
    Customers login(String username, String password);
    boolean register(String username, String email, String password);
}