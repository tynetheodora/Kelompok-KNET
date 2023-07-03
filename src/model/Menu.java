package model;

import java.util.ArrayList;

public class Menu {
    private String idMenu;
    private String namaMenu;
    private String category;
    private Integer price;
    private String description;
    private ArrayList<OrderDetail> orderDetail = new ArrayList<OrderDetail>(); 

    public Menu(){

    }

    public Menu(String idMenu, String namaMenu, String category, Integer price, String description){
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public Menu(String idMenu, String namaMenu, String category, Integer price, String description, ArrayList<OrderDetail> orderDetail){
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.category = category;
        this.price = price;
        this.description = description;
        this.orderDetail = orderDetail; 
    }

    public void inputOrderDetailData(OrderDetail orderDetail){
        orderDetail.add(orderDetail);
    }

    public String getIdMenu() {
        return this.idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return this.namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<OrderDetail> getOrderDetail() {
        return this.orderDetail;
    }

    public void setOrderDetail(ArrayList<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }



    @Override
    public String toString() {
        return "|" +
            " " + getIdMenu() + "\t|" +
            " " + getNamaMenu() + "\t|" +
            " " + getCategory() + "\t|" +
            " " + getPrice() + "\t|" +
            " " + getDescription() + "\t|" +
            " " + getOrderDetail() + "\t|" +
            "";
    }

    public static void add(Menu menu) {
    }

}

