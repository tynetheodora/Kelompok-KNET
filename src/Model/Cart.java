package model;
import java.util.Objects;

public class Cart {
    /* dalam CART memiliki atribut berikut :
    * product name
    * quantity
    * price
    * sub-total
    * discount
    * total price
    * checkout
    * notes
    */

    public class Product {
        private String productName;
        private int quantity;
        private double price;
        private double subTotal;
        private double discount;
        private double totalPrice;
        private boolean checkout;
        private String notes;
    
        // Setter dan Getter untuk atribut productName
        public void setProductName(String productName) {
            this.productName = productName;
        }
    
        public String getProductName() {
            return productName;
        }
    
        // Setter dan Getter untuk atribut quantity
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    
        public int getQuantity() {
            return quantity;
        }
    
        // Setter dan Getter untuk atribut price
        public void setPrice(double price) {
            this.price = price;
        }
    
        public double getPrice() {
            return price;
        }
    
        // Setter dan Getter untuk atribut subTotal
        public void setSubTotal(double subTotal) {
            this.subTotal = subTotal;
        }
    
        public double getSubTotal() {
            return subTotal;
        }
    
        // Setter dan Getter untuk atribut discount
        public void setDiscount(double discount) {
            this.discount = discount;
        }
    
        public double getDiscount() {
            return discount;
        }
    
        // Setter dan Getter untuk atribut totalPrice
        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }
    
        public double getTotalPrice() {
            return totalPrice;
        }
    
        // Setter dan Getter untuk atribut checkout
        public void setCheckout(boolean checkout) {
            this.checkout = checkout;
        }
    
        public boolean isCheckout() {
            return checkout;
        }
    
        // Setter dan Getter untuk atribut notes
        public void setNotes(String notes) {
            this.notes = notes;
        }
    
        public String getNotes() {
            return notes;
        }

        @Override
        public String toString() {
            return "Cart{" +
                    "productName='" + productName + '\'' +
                    ", quantity='" + quantity + '\'' +
                    ", price='" + price + '\'' +
                    ", subTotal='" + subTotal + '\'' +
                    '}';
        }

        /**
         * @param args
         */
        public static void main(String[] args) {
            Cart Cart1 = new Cart();
            Cart1.productName("Martabak");
            Cart1.quantity("1");
            Cart1.price("38000");
            Cart1.subTotal("38000");
    
            System.out.println(Cart1.toString());
    
            Cart Cart2 = new Cart("Martabak", "t1", "38000", "38000");
    
            System.out.println(Cart2.toString());
        }
    }

    public Cart(String string, String string2, String string3, String string4) {
    }

    public Cart() {
    }

    public void productName(String string) {
    }

    public void subTotal(String string) {
    }

    public void price(String string) {
    }

    public void quantity(String string) {
    }   
}
