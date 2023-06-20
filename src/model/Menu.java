package model;

public class Menu {
    String namaItem;
    String idItem;
    String category;
    Integer price;
    String description;

    public Menu(){

    }

    public Menu(String namaItem, String idItem, String category, Integer price, String description){
        this.namaItem = namaItem;
        this.idItem = idItem;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "|" +
            " " + getNamaItem() + "\t|" +
            " " + getIdItem() + "\t|" +
            " " + getCategory() + "\t|" +
            " " + getPrice() + "\t|" +
            " " + getDescription() + "\t|" +
            "";
    }

    public String getNamaItem() {
        return this.namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getIdItem() {
        return this.idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

        // contructor
    public static void main(String[] args) {
        Menu Cust1 = new Menu();
        Cust1.setNamaItem("Waffle");
        Cust1.setIdItem("01");
        Cust1.setCategory("Dessert");
        Cust1.setPrice(200000);        
        Cust1.setDescription("Original waffle with vanilla ice cream & honey");

        System.out.println(Cust1.toString());

        Menu Cust2 = new Menu("Pizza", "02", "Main course", 350000, "Signature regular pizza");

        System.out.println(Cust2.toString());

    }
}

