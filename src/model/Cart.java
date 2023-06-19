package model;

    /* dalam CART memiliki atribut berikut :
    * product name
    * quantity
    * price
    * sub-total
    * discount
    * total price
    * notes
    */

public class Cart {
   String productName;
   String quantity;
   String price;
   String subTotal;
   String discount;
   String totalPrice;
   String notes;

   public Cart(){

   }

   public Cart(String productName,
   String quantity,
   String price,
   String subTotal,
   String discount,
   String totalPrice,
   String notes){
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
    this.subTotal = subTotal;
    this.discount = discount;
    this.totalPrice = totalPrice;
    this.notes = notes;
   }

   @Override
        public String toString() {
            return "Cart{" +
                    "productName='" + productName + '\'' +
                    ", quantity='" + quantity + '\'' +
                    ", price='" + price + '\'' +
                    ", subTotal='" + subTotal + '\'' +
                    ", discount='" + discount + '\'' +
                    ", totalPrice='" + totalPrice + '\'' +
                    ", notes='" + notes + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            Cart Cart1 = new Cart();
            Cart1.setProductName("Martabak");
            Cart1.setQuantity("1");
            Cart1.setPrice("38.000");
            Cart1.setSubTotal("38.000");
            Cart1.setDiscount("3.000");
            Cart1.setTotalPrice("35.000");
            Cart1.setNotes("extra cheese");
            System.out.println(Cart1.toString());
    
    
            System.out.println(Cart1.toString());
        }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getDiscount() {
        return this.discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}