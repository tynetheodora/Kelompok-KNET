package model;

/* Nama : Kayla Namira
 * NIM : 03081220026
 */

        /*
     * Deskripsi
     * Atribut
     * amount: jumlah orderan
     * currency: IDR
     * paymentMethod : transfer bank, cash
     * transactionDate : waktu transaksi pembayaran
     * transactionId : ID transaksi pembayaran
     * status: status payment berhasil, proses, gagal
     * additionalDetails : informasi tambahan(detail alamat, dll)
     * 
     * task
     * memproses transaksi pembayaran
     * 
     */

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

    public Payment(){

    }



    public Payment(double amount2) {
    }

    @Override
    public String toString() {
        return "|" +
            " " + getIdPayment() + "\t|" +
            " " + getAmount() + "\t|" +
            " " + getPaymentMethod() + "\t|" +
            " " + getTransactionDate() + "\t|" +
            " " + getStatus() + "\t|" +
            " " + getIdOrder() + "\t|" +
            "";
    }

    



    public static void add(Payment payment) {
    }

}