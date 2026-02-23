//PROGRAM SESUAI KONSEP OOP
public class Restaurant1 {

    // attribute private
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private byte id = 0; 

    public Restaurant1() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (id >= nama_makanan.length){
            System.out.println("Maaf, kapasitas nama menu tidak cukup");
            return;
        } 
        if (stok < 0) {
        System.out.println("Stok tidak boleh negatif!");
        return;
        }
        nama_makanan[id] = nama;
        harga_makanan[id] = harga;
        this.stok[id] = stok;
        id++;
    }
    // getter (mengambil data)
    public String getNamaMakanan(int index) {
        return nama_makanan[index];
    }
    public double getHargaMakanan(int index) {
        return harga_makanan[index];
    }
    public int getStok(int index) {
        return stok[index];
    }
    // setter (mengubah data dengan validasi)
    public void setStok(int index, int stokBaru) {
        if (stokBaru >= 0) {
            stok[index] = stokBaru;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }
    // menampilkan menu
    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (stok[i] > 0) {
                System.out.println(
                        nama_makanan[i] + " [" + stok[i] + "] \tRp. " + harga_makanan[i]
                );
            }
        }
    }
    // fitur pemesanan 
    public void pesanMenu(String nama, int jumlah) {
    if (jumlah <= 0) {
        System.out.println("Jumlah pesanan harus lebih dari 0!");
        return;
    }
    for (int i = 0; i < id; i++) {
        if (nama_makanan[i].equalsIgnoreCase(nama)) {
            if (stok[i] < jumlah) {
                System.out.println("Mohon maaf pesanan tidak dapat diproses, stok tidak cukup!");
            } else {
                stok[i] -= jumlah;
                System.out.println("Pesanan berhasil! Sisa stok: " + stok[i]);
            }
            return;
        }
    } System.out.println("Mohon maaf menu tidak ditemukan, silahkan untuk input menu yang tersedia!");
  }
}

