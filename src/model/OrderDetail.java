package model;


    /*
 * didalam icon order , memiliki atribut:
 * common attribut
 * - ID order detail
 * - ID Order
 * - menu
 * - ID menu
 * - price
 * - qty
 * - tax
 * - total price
 * 
 * 
 */


public class OrderDetail{
    private String idOrderDetail;
    private Order idOrder;
    private Menu menu;
    private int qty;
   


public OrderDetail() {

}

public OrderDetail ( String idOrderDetail , Order idOrder , Menu menu,  int qty  ) {
    this.idOrderDetail = idOrderDetail;
    this.idOrder = idOrder;
    this.menu = menu;
    this.qty = qty;
    

}

    public String getIdOrderDetail() {
        return this.idOrderDetail;
    }

    public void setIdOrderDetail(String idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public Order getIdOrder() {
        return this.idOrder;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }




    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }




    
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("╔════════════════════════════════════════════════════╗\n");
    sb.append("║               Order Detail Information              ║\n");
    sb.append("╟──────────────────────────────────────────────────────╢\n");
    sb.append("║ Id Order Detail: ").append(getIdOrderDetail()).append("║\n");
    sb.append("║ Id Order:        ").append(getIdOrder()).append("║\n");
    sb.append("║ Menu:            ").append(getMenu()).append("║\n");
    sb.append("║ Quantity:        ").append(getQty()).append("║\n");
    sb.append("╚════════════════════════════════════════════════════╝\n");
    return sb.toString();
}



     public static void add(OrderDetail OrderDetail) {
    }

}
