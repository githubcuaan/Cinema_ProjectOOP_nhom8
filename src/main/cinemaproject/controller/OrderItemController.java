package main.cinemaproject.controller;

import main.cinemaproject.utils.JBDCUtils;
import main.cinemaproject.dao.OrderItemDAO;
import main.cinemaproject.model.OrderItem;
import java.sql.Connection;
import java.sql.SQLException;
public class OrderItemController {
    private OrderItemDAO orderItemDAO;
    private Connection connection = JBDCUtils.getConnection();

    public OrderItemController() {
        this.orderItemDAO = new OrderItemDAO(connection);
    }

    public void addOrderItem(OrderItem orderItem) {
        try {
            orderItemDAO.addOrderItem(orderItem);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
