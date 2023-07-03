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
 * - QTY
 * - tax
 * - total price
 * 
 * 
 */

    
    String IDorderDetail;
    Order IDorder;
    Menu NamaMenu;
    Menu IDmenu;
    int Price;
    int QTY;
    int tax;
    int totalPrice;


     public OrderDetail() {

    }

    public OrderDetail(String IDorderDetail, Order IDorder, Menu NamaMenu, Menu IDmenu, Integer Price, Integer QTY , Integer tax , Integer totalPrice) {
        this.IDorderDetail = IDorderDetail;
        this.IDorder = IDorder;
        this.NamaMenu = NamaMenu;
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

    public Order getIDorder() {
        return this.IDorder;
    }

    public void setIDorder(Order IDorder) {
        this.IDorder = IDorder;
    }

    public Menu NamaMenu() {
        return this.NamaMenu;
    }

    public void setmenu(Menu menu) {
        this.NamaMenu = menu;
    }

    public Menu getIDmenu() {
        return this.IDmenu;
    }

    public void setIDmenu(Menu IDmenu) {
        this.IDmenu = IDmenu;
    }

    public Integer getPrice() {
        return this.Price;
    }

    public void setPrice(Integer Price) {
        this.Price = Price;
    }

    public Integer getQTY() {
        return this.QTY;
    }

    public void setKuantitas(Integer QTY) {
        this.QTY = QTY;
    }

    public Integer getTax() {
        return this.tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalHarga(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    
     @Override
    public String toString() {
        return "|" +
            " " + getIDorderDetail() + "\t|" +
            " " + getIDorder() + "\t|" +
            " " + getNamaMenu() + "\t|" +
            " " + getIDmenu() + "\t|" +
            " " + getPrice() + "\t|" +
            " " + getQTY() + "\t|" +
            " " + getTax() + "\t|" +
            " " + getTotalPrice() + "\t|" +
            "";
    }


     public static void add(OrderDetail OrderDetail) {
    }

}

   