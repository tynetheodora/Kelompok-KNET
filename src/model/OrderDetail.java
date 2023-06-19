package model;
public class OrderDetail{

    /*
 * didalam icon order , memiliki atribut:
 * common attribut
 * 
 * - nama menu
 * - ID menu
 * - harga
 * - kuantitas
 * - total harga
 * 
 * 
 */

    
    String namamenu;
    String IDmenu;
    String harga;
    String kuantitas;
    String totalHarga;

    public OrderDetail (){

    }

    public OrderDetail ( String namamenu, String IDmenu, String harga, String kuantitas, String totalHarga){
        this.namamenu = namamenu;
        this.IDmenu = IDmenu;
        this.harga = harga;
        this.kuantitas = kuantitas;
        this.totalHarga = totalHarga;
    
    }


    
    public String getNamamenu() {
        return this.namamenu;
    }

    public void setNamamenu(String namamenu) {
        this.namamenu = namamenu;
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

    public String getTotalHarga() {
        return this.totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }

}