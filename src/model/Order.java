package model;
    

import java.util.ArrayList;
import java.util.List;

class Order{
    private List<String> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public List<String> getItems() {
        return items;
    }
}

public class Order{

    public static void main(String[] args) {
        Order order = new Order();

        order.addItem("Produk A");
        order.addItem("Produk B");

        System.out.println("Pesanan: " + order.getItems());
    
        }
    }
