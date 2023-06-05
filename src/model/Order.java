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

public class MyClass {
    private String editpesanan;
    private String ratingpesanan;
    private String searchbar;
    private String detail;
    private String number;
    private String Time;
    private String queue;

    // Empty constructor
    public MyClass() {
    }

    // Constructor with all fields
    public MyClass(String editpesanan, String ratingpesanan, String searchbar, String detail, String number, String Time, String queue) {
        this.editpesanan = editpesanan;
        this.ratingpesanan = ratingpesanan;
        this.searchbar = searchbar;
        this.detail = detail;
        this.number = number;
        this.Time = Time;
        this.queue = queue;
    }

    // Getter and setter methods...

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

    // toString() method
    @Override
    public String toString() {
        return "MyClass{" +
                "editpesanan='" + editpesanan + '\'' +
                ", ratingpesanan='" + ratingpesanan + '\'' +
                ", searchbar='" + searchbar + '\'' +
                ", detail='" + detail + '\'' +
                ", number='" + number + '\'' +
                ", Time='" + Time + '\'' +
                ", queue='" + queue + '\'' +
                '}';
        }
    }
}