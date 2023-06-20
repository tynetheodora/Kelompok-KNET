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
    String currency;
    String amount;
    String paymentMethod;
    String transactionDate;
    String transactionId;
    String status;
    String additionalDetails;

    public Payment(){

    }

    public Payment(String currency, String amount, String paymentMethod, 
    String transactionDate, String transactionId, 
    String status, String additionalDetails) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionDate = transactionDate;
        this.transactionId = transactionId;
        this.status = status;
        this. additionalDetails = additionalDetails;
    }

    @Override
    public String toString() {
        return "|" +
            " " + getCurrency() + "\t|" +
            " " + getAmount() + "\t|" +
            " " + getPaymentMethod() + "\t|" +
            " " + getTransactionDate() + "\t|" +
            " " + getTransactionId() + "\t|" +
            " " + getStatus() + "\t|" +
            " " + getAdditionalDetails() + "\t|" +
            "";
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdditionalDetails() {
        return this.additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    // contructor
    public static void main(String[] args) {
        Payment Customer1 = new Payment();
        Customer1.setCurrency("IDR");
        Customer1.setAmount("200.000");
        Customer1.setPaymentMethod("Cash \t");
        Customer1.setTransactionDate("5/6/2023");        
        Customer1.setTransactionId("xcsznjc0ldr");
        Customer1.setStatus("Completed");
        Customer1.setAdditionalDetails(" - ");

        System.out.println(Customer1.toString());

        Payment Customer2 = new Payment("IDR", "250.000", "Bank Transfer", "5/6/2023", "sjnclasc5", "Failed", " - ");

        System.out.println(Customer2.toString());

    }

}