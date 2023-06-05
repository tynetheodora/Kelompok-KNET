package model;

public class Rating{
    /*
 *
 * di dalam icon rating terdapat attribut:
 * - bintang : 1,2,3,4,5
 * - review 
 * - rekomendasi resto rating tinggi 
 * 
 */

 String bintang;
 String review;
 String rekomendasi;
 



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

    public String getRekomendasi() {
        return this.rekomendasi;
    }

    public void setRekomendasi(String rekomendasi) {
        this.rekomendasi = rekomendasi;
    }
}
    
 