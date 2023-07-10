package model;

public class Payment {
    private String idPayment;
    private String amount;
    private String paymentMethod;
    private String transactionDate;
    private String status;
    private String idOrder;

    public Payment(String idPayment, String amount, String paymentMethod, 
    String transactionDate, String status, String idOrder) {
        this. idPayment = idPayment;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionDate = transactionDate;
        this.status = status;
        this. idOrder = idOrder;
    }
    
    public String getIdPayment() {
        return this.idPayment;
    }

    public void setIdPayment(String idPayment) {
        this.idPayment = idPayment;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdOrder() {
        return this.idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public Payment(double amount2){

    }

    public Payment(String idPayment2, String amount2, String paymentMethod2, String transactionDate2, String status2,
            Order order) {
    }

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("╔════════════════════════════════════════════════════╗\n");
    sb.append("║               Payment Information                  ║\n");
    sb.append("╟──────────────────────────────────────────────────────╢\n");
    sb.append("║ Id Payment:       ").append(getIdPayment()).append("║\n");
    sb.append("║ Amount:           ").append(getAmount()).append("║\n");
    sb.append("║ Payment Method:   ").append(getPaymentMethod()).append("║\n");
    sb.append("║ Transaction Date: ").append(getTransactionDate()).append("║\n");
    sb.append("║ Status:           ").append(getStatus()).append("║\n");
    sb.append("║ Id Order:         ").append(getIdOrder()).append("║\n");
    sb.append("╚════════════════════════════════════════════════════╝\n");
    return sb.toString();
}


    public static void add(Payment payment) {
    }

}