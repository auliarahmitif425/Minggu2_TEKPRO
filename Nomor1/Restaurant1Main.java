import java.util.Scanner;
public class Restaurant1Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Restaurant1 menu = new Restaurant1();

        // Tambah menu awal
        menu.tambahMenuMakanan("Pizza", 250000, 20);
        
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
       
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

        int pilihan;
        String pesanLagi;
    do {
    System.out.println("\n=== Selamat Datang di Aulia Gourmet House! ===");
    System.out.println("\n=== MENU RESTAURANT ===");
    menu.tampilMenuMakanan();

    System.out.println("\n1. Pesan Menu");
    System.out.println("2. Keluar");
    System.out.println("Pilih: ");
    pilihan = input.nextInt();
    input.nextLine();

    if (pilihan == 1) {
        do {
            System.out.print("Masukkan nama menu: ");
            String nama = input.nextLine();

            System.out.print("Jumlah pesanan: ");
            int jumlah = input.nextInt();
            input.nextLine();

            menu.pesanMenu(nama, jumlah);

            System.out.print("Ingin menambah pesanan? (y/t): ");
            pesanLagi = input.nextLine();

        } while (pesanLagi.equalsIgnoreCase("y"));
        break;
    }

} while (pilihan != 2);

System.out.println("Terima kasih atas pesanannya! Silahkan menunggu.");
input.close();
    }
}