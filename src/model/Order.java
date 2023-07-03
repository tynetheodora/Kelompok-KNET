package model;

public class Order {

    public static int length;
    /* Attributes */
    String idOrder;
    String namaRestoran;
    String alamatRestoran;
    String userName;
    String orderDate;
    OrderDetail orderDetail;

    public Order() {

    }

    public Order(String idOrder, String namaRestoran, String alamatRestoran, String userName, String orderDate, OrderDetail orderDetail) {
        this.idOrder = idOrder;
        this.namaRestoran = namaRestoran;
        this.alamatRestoran = alamatRestoran;
        this.userName = userName;
        this.orderDate = orderDate;
        this.orderDetail = orderDetail;
    }

    public Order(String idOrder, String namaRestoran, String alamatRestoran, String userName, String orderDate, String orderDetail) {
    }

    public String idOrder(){
        return this.idOrder;
    }

    public void setIdOrder(){
        this.idOrder = idOrder;
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

    public OrderDetail getorderDetail() {
        return this.orderDetail;
    }

    public void setorderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID Order='" + idOrder + '\'' +
                "Nama Restoran='" + namaRestoran + '\'' +
                ", Alamat Restoran='" + alamatRestoran + '\'' +
                ", Nama Pengguna='" + userName + '\'' +
                ", Tanggal='" + orderDate + '\'' +
                ", Order Detail='" + orderDetail + '\'' +
                '}';
    }

    public static void add(Order order) {
    }
}