package model;
import java.util.Objects;

/* Nama : Kayla Namira
 * NIM : 03081220026
 */

public class Payment {
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

     String currency;
     String amount;
     String paymentMethod;
     String transactionDate;
     String transactionId;
     String status;
     String additionalDetails;

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
}