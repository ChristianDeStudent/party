package be.thomasmore.party.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int nrOfOrders;
    private double totalAmount;
    private double discountTaken;

    public Client(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfOrders() {
        return nrOfOrders;
    }

    public void setNrOfOrders(int nrOfOrders) {
        this.nrOfOrders = nrOfOrders;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDiscountTaken() {
        return discountTaken;
    }

    public void setDiscountTaken(double discountTaken) {
        this.discountTaken = discountTaken;
    }
}
