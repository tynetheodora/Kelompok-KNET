package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    /* Attributes */
    String namaRestoran;
    String alamatRestoran;
    String namaPengguna;
    String idPemesanan;
    String tanggalPembelian;
    String jamPembelian;

    public Order() {

    }

    public Order(String namaRestoran, String alamatRestoran, String namaPengguna, String idPemesanan, String tanggalPembelian, String jamPembelian) {
        this.namaRestoran = namaRestoran;
        this.alamatRestoran = alamatRestoran;
        this.namaPengguna = namaPengguna;
        this.idPemesanan = idPemesanan;
        this.tanggalPembelian = tanggalPembelian;
        this.jamPembelian = jamPembelian;
    }

    public String getNamaRestoran() {
        return this.namaRestoran;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    public String getAlamatRestoran() {
        return this.alamatRestoran;
    }

    public void setAlamatRestoran(String alamatRestoran) {
        this.alamatRestoran = alamatRestoran;
    }

    public String getNamaPengguna() {
        return this.namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getIdPemesanan() {
        return this.idPemesanan;
    }

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getTanggalPembelian() {
        return this.tanggalPembelian;
    }

    public void setTanggalPembelian(String tanggalPembelian) {
        this.tanggalPembelian = tanggalPembelian;
    }

    public String getJamPembelian() {
        return this.jamPembelian;
    }

    public void setJamPembelian(String jamPembelian) {
        this.jamPembelian = jamPembelian;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Nama Restoran='" + namaRestoran + '\'' +
                ", Alamat Restoran='" + alamatRestoran + '\'' +
                ", Nama Pengguna='" + namaPengguna + '\'' +
                ", ID Pemesanan='" + idPemesanan + '\'' +
                ", Tanggal='" + tanggalPembelian + '\'' +
                ", Jam='" + jamPembelian + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        Order order1 = new Order("Online Order", "Polonia Medan", "Tyne Theodora", "1220028", "11 November 2023", "11:11");
        orderList.add(order1);

        Order order2 = new Order("Online Order", "Polonia Medan", "Tyne Theodora", "1220029", "12 November 2023", "12:12");
        orderList.add(order2);


        for (Order order : orderList) {
            System.out.println(order.toString());
        }
    }
}