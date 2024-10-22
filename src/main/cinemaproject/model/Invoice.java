package main.cinemaproject.model;

import java.util.Date;

public class Invoice {
    private int id;
    private int customer_id;
    private double total_amount;
    private Date purchase_date;

    public Invoice() {
    }

    public Invoice(int id, int customer_id, double total_amount, Date purchase_date) {
        this.id = id;
        this.customer_id = customer_id;
        this.total_amount = total_amount;
        this.purchase_date = purchase_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }
    
    
}
