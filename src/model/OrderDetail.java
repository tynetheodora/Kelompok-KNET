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
    String IDorder;
    String namaMenu;
    String IDmenu;
    String Price;
    String QTY;
    String tax;
    String totalPrice;


     public OrderDetail() {

    }

    public OrderDetail(String IDorderDetail, String IDorder, String namaMenu, String IDmenu, String Price, String QTY , String tax , String totalPrice) {
        this.IDorderDetail = IDorderDetail;
        this.IDorder = IDorder;
        this.namaMenu = namaMenu;
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

    public String getIDorder() {
        return this.IDorder;
    }

    public void setIDorder(String IDorder) {
        this.IDorder = IDorder;
    }

    public String getNamaMenu() {
        return this.namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getIDmenu() {
        return this.IDmenu;
    }

    public void setIDmenu(String IDmenu) {
        this.IDmenu = IDmenu;
    }

    public String getPrice() {
        return this.Price;
    }

    public void setHarga(String Price) {
        this.Price = Price;
    }

    public String getQTY() {
        return this.QTY;
    }

    public void setKuantitas(String QTY) {
        this.QTY = QTY;
    }

    public String getTax() {
        return this.tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalHarga(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void add(OrderDetail orderDetail) {
    }
}
   