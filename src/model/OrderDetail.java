package model;
public class OrderDetail{

    /*
 * didalam icon order , memiliki atribut:
 * common attribut
 * - ID order detail
 * - ID Order
 * - menu
 * - ID menu
 * - price
 * - qty
 * - tax
 * - total price
 * 
 * 
 */

    
    String idOrderDetail;
    Order idOrder;
    Menu menu;
    Menu idMenu;
    int price;
    int qty;
    int tax;
    int totalPrice;

    public String getIdOrderDetail() {
        return this.idOrderDetail;
    }

    public void setIdOrderDetail(String idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public Order getIdOrder() {
        return this.idOrder;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public void setNamaMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getIdMenu() {
        return this.idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTax() {
        return this.tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public OrderDetail() {

    }

    public OrderDetail(String idOrderDetail, Order idOrder, Menu menu, Menu idMenu, Integer price, Integer qty , Integer tax , Integer totalPrice) {
        this.idOrderDetail = idOrderDetail;
        this.idOrder = idOrder;
        this.menu = menu;
        this.idMenu = idMenu;
        this.price = price;
        this.qty = qty;
        this.tax = tax;
        this.totalPrice = totalPrice;
    }


    
     @Override
    public String toString() {
        return "|" +
            " " + getIdOrderDetail() + "\t|" +
            " " + getIdOrder() + "\t|" +
            " " + getMenu() + "\t|" +
            " " + getIdMenu() + "\t|" +
            " " + getPrice() + "\t|" +
            " " + getQty() + "\t|" +
            " " + getTax() + "\t|" +
            " " + getTotalPrice() + "\t|" +
            "";
    }


     public static void add(OrderDetail OrderDetail) {
    }

}
