package main.cinemaproject.controller;

import main.cinemaproject.dao.CustomersDAO;
import main.cinemaproject.model.Customers;
import main.cinemaproject.utils.JBDCUtils;

import java.sql.Connection;
import java.util.ArrayList;

public class CustomerController {
    //lấy tất cả thông tin khách hàng
    public ArrayList<Customers> getAllCustomers() {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            return customersDAO.getAllCustomers();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //thêm khách hàng
    public boolean addCustomer(Customers customer) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            boolean success = customersDAO.addCustomer(customer);
            return success;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //cập nhật thông tin khách hàng
    public boolean updateCustomer(Customers customer) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            customersDAO.updateCustomer(customer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //xóa khách hàng theo id
    public boolean deleteCustomer(int customerId) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            customersDAO.deleteCustomer(customerId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    //lấy thông tin khách hàng theo id
    public Customers getCustomerById(int customerId) {
        Connection connection = null;
        try {
            connection = JBDCUtils.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            return customersDAO.getCustomerById(customerId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JBDCUtils.closeConnection(connection);
        }
    }

    public ArrayList<Customers> searchCustomers(String searchTerm) {
        Connection connection = null;
        connection = JBDCUtils.getConnection();
        CustomersDAO customersDAO = new CustomersDAO(connection);
        return customersDAO.searchCustomers(searchTerm);
    }

    //lấy id khách hàng theo username
    public int getCustomerIdByUsername(String username)
    {
        Connection connection = null;
        try
        {
            connection = JBDCUtils.getConnection();
            CustomersDAO customersDAO = new CustomersDAO(connection);
            int customerId = customersDAO.getCustomerIdByUsername(username);
            return customerId;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return -1;
        }
        finally
        {
            JBDCUtils.closeConnection(connection);
        }
    }
}
