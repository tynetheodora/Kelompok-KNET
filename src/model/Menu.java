package model;

public class Menu {
    String food;
    String drink;
    String dessert;
    Double price;

    public Menu (){

    }

    public Menu (String food, String drink, String dessert, Double price){
        this.food = food;
        this.drink = drink;
        this.dessert = dessert;
        this.price = price;
    }

    @Override
    public String toString() {
        return "|" +
            " " + getFood() + "\t|" +
            " " + getDrink() + "\t|" +
            " " + getDessert() + "\t|" +
            " " + getPrice() + "\t|" +
            "";
    }

    public String getFood() {
        return this.food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return this.drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDessert() {
        return this.dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
