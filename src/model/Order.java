package model;

public class Order {
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
    
    public Order (){

    }
        
    public Order ( String namaRestoran, String alamatRestoran, String namaPengguna, String idPemesanan, String tanggalPembelian, String jamPembelian){
    this.namaRestoran = namaRestoran;
    this.alamatRestoran = alamatRestoran;
    this.namaPengguna = namaPengguna;
    this.idPemesanan = idPemesanan;
    this.tanggalPembelian = tanggalPembelian;
    this.jamPembelian = jamPembelian;
    
    }

     public String gettanggalPembelian() {
        return this.tanggalPembelian;
    }

    public void settanggalPembelian(String tanggalPembelian) {
        this.tanggalPembelian = tanggalPembelian;
    }

    public Order(String namaRestoran2, String alamatRestoran2, String namaPelanggan, String idPemesanan2,
            String tanggalPembelian2) {
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
                    ", Alamat Restoran ='" + alamatRestoran + '\'' +
                    ", Nama Pengguna='" + namaPengguna + '\'' +
                    ", ID Pemesanan='" + idPemesanan + '\'' +
                    ", Tanggal ='" + tanggalPembelian + '\'' +
                    ", Jam ='" + jamPembelian + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            Order Order1 = new Order();
            Order1.setNamaRestoran("Online Order");
            Order1.setAlamatRestoran("Polonia Medan");
            Order1.setNamaPengguna("Tyne Theodora");
            Order1.setIdPemesanan("1220028");
            Order1.setTanggalPembelian("11 November 2023");
            Order1.setJamPembelian("11:11");
    
            System.out.println(Order1.toString());

            Order Order2 = new Order("Online Order", "Polonia Medan", "Tyne Theodora", "1220028", "11 November 2023", "11:11");
            System.out.println(Order2.toString());
        }

        public static void add(Order order) {
        }
    }
