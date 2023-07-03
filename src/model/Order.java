package model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String idOrder;
    private String namaRestoran;
    private String alamatRestoran;
    private String userName;
    private String orderDate;
    private List<OrderDetail> orderDetails;

    public Order() {
        orderDetails = new ArrayList<>();
    }

    public Order(String idOrder, String namaRestoran, String alamatRestoran, String userName, String orderDate, List<OrderDetail> orderDetails) {
        this.idOrder = idOrder;
        this.namaRestoran = namaRestoran;
        this.alamatRestoran = alamatRestoran;
        this.userName = userName;
        this.orderDate = orderDate;
        this.orderDetails = orderDetails;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getNamaRestoran() {
        return namaRestoran;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    public String getAlamatRestoran() {
        return alamatRestoran;
    }

    public void setAlamatRestoran(String alamatRestoran) {
        this.alamatRestoran = alamatRestoran;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder='" + idOrder + '\'' +
                ", namaRestoran='" + namaRestoran + '\'' +
                ", alamatRestoran='" + alamatRestoran + '\'' +
                ", userName='" + userName + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderDetails=" + orderDetails +
                '}';
    }

    public static void add(Order order) {
    }
}