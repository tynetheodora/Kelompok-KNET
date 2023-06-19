package model;

public class Rating{
    /*
 *
 * di dalam icon rating terdapat attribut:
 * - bintang
 * - review
 * - menu
 * 
 */

 String bintang;
 String review;
 String menu;
 

    public String getBintang() {
        return this.bintang;
    }

    public void setBintang(String bintang) {
        this.bintang = bintang;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getMenu() {
        return this.menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

}
