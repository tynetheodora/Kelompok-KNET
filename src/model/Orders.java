package model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Orders {
    /* Attributes :
     * Nama Restoran
     * Alamat Restoran
     * Nama Pengguna
     * ID Pemesanan
     * Tanggal Pembelian
     * Jam Pembelian
     * 
     * TASK : memberi informasi mengenai pemesanan
     */

    String namaRestoran;
    String alamatRestoran;
    String namaPengguna;
    String idPemesanan;
    String tanggalPembelian;
    String jamPembelian;
    

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
            LocalDateTime waktuSekarang = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");


            return "Orders{" +
                    "Nama Restoran='" + namaRestoran + '\'' +
                    ", Alamat Restoran ='" + alamatRestoran + '\'' +
                    ", Nama Pengguna='" + namaPengguna + '\'' +
                    ", ID Pemesanan='" + idPemesanan + '\'' +
                    ", Tanggal ='" + tanggalPembelian + '\'' +
                    ", Jam ='" + jamPembelian + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            Orders Orders1 = new Orders();
            Orders1.setNamaRestoran("Online Orders");
            Orders1.setAlamatRestoran("Polonia Medan");
            Orders1.setNamaPengguna("Tyne Theodora");
            Orders1.setIdPemesanan("1220028");
            Orders1.setTanggalPembelian("11 November 2023");
            Orders1.setJamPembelian("11:11");
    
            System.out.println(Orders1.toString());
            Orders Orders2 = new Orders();

            System.out.println(Orders2.toString());
        }
    }
