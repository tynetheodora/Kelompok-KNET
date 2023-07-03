package model;
public class OrderDetail{

    /*
 * didalam icon order , memiliki atribut:
 * common attribut
 * - ID order detail
 * - ID Order
 * - nama menu
 * - ID menu
 * - price
 * - QTY
 * - tax
 * - total price
 * 
 * 
 */

    
    String IDorderDetail;
    Order order;
    Menu menu;
    Menu IDmenu;
    int Price;
    int QTY;
    int tax;
    int totalPrice;


     public OrderDetail() {

    }

    public OrderDetail(String IDorderDetail, Order order, Menu menu, Menu IDmenu, int Price, int QTY , int tax , int totalPrice) {
        this.IDorderDetail = IDorderDetail;
        this.order = order;
        this.menu = menu;
        this.IDmenu = IDmenu;
        this.Price = Price;
        this.QTY = QTY;
        this.tax = tax;
        this.totalPrice = totalPrice;
    }

    public String getIDorderDetail() {
        return this.IDorderDetail;
    }

    public void setIDorderDetail(String IDorderDetail) {
        this.IDorderDetail = IDorderDetail;
    }

    public Order getorder() {
        return this.order;
    }

    public void setIDorder(Order order) {
        this.order = order;
    }

    public Menu getNamaMenu() {
        return this.menu;
    }

    public void setNamaMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getIDmenu() {
        return this.IDmenu;
    }

    public void setIDmenu(Menu IDmenu) {
        this.IDmenu = IDmenu;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setHarga(int Price) {
        this.Price = Price;
    }

    public int getQTY() {
        return this.QTY;
    }

    public void setKuantitas(int QTY) {
        this.QTY = QTY;
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

    public void setTotalHarga(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
