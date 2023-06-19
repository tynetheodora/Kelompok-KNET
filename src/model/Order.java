package model;
public class Order{
    /*
 * didalam icon order , memiliki atribut:
 * common attribut
 * - nama pengguna
 * - nama menu
 * - kuantitas
 * - harga
 * 
 * 
 */

 String namapengguna;
 String namamenu;
 String kuantitas;
 String harga;



    public String getNamapengguna() {
        return this.namapengguna;
    }

    public void setNamapengguna(String namapengguna) {
        this.namapengguna = namapengguna;
    }

    public String getNamamenu() {
        return this.namamenu;
    }

    public void setNamamenu(String namamenu) {
        this.namamenu = namamenu;
    }

    public String getKuantitas() {
        return this.kuantitas;
    }

    public void setKuantitas(String kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getHarga() {
        return this.harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}