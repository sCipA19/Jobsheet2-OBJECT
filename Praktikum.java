import java.util.Scanner;
public class Praktikum {

        private String judul;
        private String pengarang;
        private int halaman;
        private int stok;
        private int harga;
    
        public Praktikum(String judul, String pengarang, int halaman, int stok, int harga) {
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
            System.out.println("Halaman: " + halaman);
            System.out.println("Stok: " + stok);
            System.out.println("Harga: " + harga);
        }
    
        public void terjual(int jml) {
            if (jml > stok) {
                throw new IllegalArgumentException("Jumlah terjual melebihi stok");
            }
            stok -= jml;
        }
    
        public void restock(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Jumlah restock tidak boleh negatif");
            }
            stok += n;
        }
    
        public void gantiHarga(int hrg) {
            if (hrg < 0) {
                throw new IllegalArgumentException("Harga tidak boleh negatif");
            }
            harga = hrg;
        }
    
        public int hitungHargaTotal(int jml) {
            return jml * harga;
        }
    
        public int hitungDiskon(int hargaTotal) {
            int diskon = 0;
            if (hargaTotal > 150000) {
                diskon = hargaTotal * 12 / 100;
            } else if (hargaTotal >= 75000) {
                diskon = hargaTotal * 5 / 100;
            }
            return diskon;
        }
    
        public int hitungHargaBayar(int hargaTotal, int diskon) {
            return hargaTotal - diskon;
        }
    }

