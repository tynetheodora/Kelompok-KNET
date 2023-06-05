package model;
public class Order{
    /*
 * didalam icon order , memiliki atribut:
 * common attribut
 * - edit pesanan
 * - lihat rating pesanan
 * - search bar
 * 
 * 
 * 
 * detail attribut
 * - order detail
 * - order number
 * - order Time
 * - order queue
 * 
 * 
 * 
 * 
 */

 String editpesanan;
 String ratingpesanan;
 String searchbar;
 String detail;
 String number;
 String Time;
 String queue;

    public String getEditpesanan() {
        return this.editpesanan;
    }

    public void setEditpesanan(String editpesanan) {
        this.editpesanan = editpesanan;
    }

    public String getRatingpesanan() {
        return this.ratingpesanan;
    }

    public void setRatingpesanan(String ratingpesanan) {
        this.ratingpesanan = ratingpesanan;
    }

    public String getSearchbar() {
        return this.searchbar;
    }

    public void setSearchbar(String searchbar) {
        this.searchbar = searchbar;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return this.Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getQueue() {
        return this.queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
