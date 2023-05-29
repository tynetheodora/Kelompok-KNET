package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cart {
    private String name;
    private double price;

    public Cart(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class CartItem {
    private Cart product;
    private int quantity;

    public CartItem(Cart product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Cart getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}