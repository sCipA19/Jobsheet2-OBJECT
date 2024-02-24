import java.util.Scanner;

public class Buku28 {
    private String judul;
    private String pengarang;
    private int halaman;
    private int stok;
    private int harga;

    public Buku28() {
    }

    public Buku28(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    public void terjual(int jumlahTerjual) {
        if (jumlahTerjual <= stok) {
            stok -= jumlahTerjual;
        } else {
            System.out.println("Jumlah terjual melebihi stok yang tersedia.");
        }
    }

    public void restock(int jumlahRestock) {
        stok += jumlahRestock;
    }

    public void gantiHarga(int hargaBaru) {
        harga = hargaBaru;
    }
}
