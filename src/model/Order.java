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
    StringBuilder sb = new StringBuilder();
    sb.append("╔═════════════════════════════════════════╗\n");
    sb.append("║            Order Information             ║\n");
    sb.append("╟─────────────────────────────────────────╢\n");
    sb.append("║ Id Order:      ").append(getIdOrder()).append("║\n");
    sb.append("║ Nama Resto:    ").append(getNamaRestoran()).append("║\n");
    sb.append("║ Alamat Resto:  ").append(getAlamatRestoran()).append("║\n");
    sb.append("║ Cust:          ").append(getUserName()).append("║\n");
    sb.append("║ Date:          ").append(getOrderDate()).append("║\n");
    sb.append("║ Order Details: ").append(getOrderDetails()).append("║\n");
    sb.append("╚═════════════════════════════════════════╝\n");
    return sb.toString();
}


    public static void add(Order order) {
    }

    public String getId() {
        return null;
    }

    public String getOrderId() {
        return null;
    }
}