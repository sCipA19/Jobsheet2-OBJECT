import java.util.Scanner;
public class ClassDiagram {

    private final String judul;
    private final String pengarang;
    private final int halaman;
    private int stok;
    private int harga;

    public ClassDiagram (String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        setStok(stok);
        setHarga(harga);
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getHalaman() {
        return halaman;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif");
        }
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;
    }

    public void terjual(int jumlah) {
        if (jumlah > stok) {
            throw new IllegalArgumentException("Jumlah terjual melebihi stok");
        }
        stok -= jumlah;
    }

    public void restock(int jumlah) {
        if (jumlah < 0) {
            throw new IllegalArgumentException("Jumlah restock tidak boleh negatif");
        }
        stok += jumlah;
    }

    public void gantiHarga(int harga) {
        setHarga(harga);
    }

    public String toString() {
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", halaman=" + halaman +
                ", stok=" + stok +
                ", harga=" + harga +
                '}';
    }


    public static void main(String[] args) {
        ClassDiagram buku1 = new ClassDiagram("Java Dasar", "Dicoding", 200, 10, 50000);

        System.out.println(buku1);
        System.out.println("Jumlah terjual: 5");
        buku1.terjual(5);
        System.out.println(buku1);
        System.out.println("Restock: 10");
        buku1.restock(10);
        System.out.println(buku1);
        System.out.println("Ganti harga: 60000");
        buku1.gantiHarga(60000);
        System.out.println(buku1);
    }
}
