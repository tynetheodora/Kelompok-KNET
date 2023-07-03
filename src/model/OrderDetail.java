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
    String harga;
    String kuantitas;
    String tax;
    String totalHarga;

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

    public String getHarga() {
        return this.harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getKuantitas() {
        return this.kuantitas;
    }

    public void setKuantitas(String kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getTax() {
        return this.tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTotalHarga() {
        return this.totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }
}
   