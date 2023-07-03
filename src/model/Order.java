package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public static int length;
    /* Attributes */
    String idOrder;
    String namaRestoran;
    String alamatRestoran;
    String userName;
    String orderDate;
    String orderDetail;

    public Order() {

    }

    public Order(String namaRestoran, String alamatRestoran, String userName, String idPemesanan, String orderDate, String orderDetail) {
        this.namaRestoran = namaRestoran;
        this.alamatRestoran = alamatRestoran;
        this.userName = userName;
        this.orderDate = orderDate;
        this.orderDetail = orderDetail;
    }

    public String getNamaRestoran() {
        return this.namaRestoran;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    public String getAlamatRestoran() {
        return this.alamatRestoran;
    }

    public void setAlamatRestoran(String alamatRestoran) {
        this.alamatRestoran = alamatRestoran;
    }

    public String getuserName() {
        return this.userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getorderDate() {
        return this.orderDate;
    }

    public void setorderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getorderDetail() {
        return this.orderDetail;
    }

    public void setorderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Nama Restoran='" + namaRestoran + '\'' +
                ", Alamat Restoran='" + alamatRestoran + '\'' +
                ", Nama Pengguna='" + userName + '\'' +
                ", Tanggal='" + orderDate + '\'' +
                ", Order Detail='" + orderDetail + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        Order order1 = new Order("Online Order", "Polonia Medan", "Tyne Theodora", "1220028", "11 November 2023", "11:11");
        orderList.add(order1);

        Order order2 = new Order("Online Order", "Polonia Medan", "Tyne Theodora", "1220029", "12 November 2023", "12:12");
        orderList.add(order2);
    }

    public static void add(Order order) {
    }

    public String getidOrder() {
        return null;
    }
}