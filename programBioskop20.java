import java.util.Scanner;

public class programBioskop20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket, totalTiket, totalHarga;
        int hargatiket1 = 0, hargatiket2 = 0, hargatiket3 = 0;
        int tiket1 = 0, tiket2 = 0, tiket3 = 0;
        int harga;
        int hargaTiket = 50000;
        String nama, ulang = "y";

        System.out.println("====== Mesin Penghitung Total Harian ======");
        System.out.print("\nMasukkan nama pengelola: ");
        nama = sc.nextLine();

        do {
            System.out.print("Masukkan tiket: ");
            tiket = sc.nextInt();
            if (tiket <= 0) {
                System.out.println("Tiket tidak valid. Masukkan lagi tiket yang valid!");
                continue;
            }
            if (tiket > 4 && tiket <= 10) {
                tiket1 += tiket;
                harga = tiket * hargaTiket * 90 / 100;
                hargatiket1 += harga;
                System.out.println("Harga: " + harga);
            } else if (tiket > 10) {
                tiket2 += tiket;
                harga = tiket * hargaTiket * 85 / 100;
                hargatiket2 += harga;
                System.out.println("Harga: " + harga);
            } else {
                tiket3 += tiket;
                harga = tiket * hargaTiket;
                hargatiket3 += harga;
                System.out.println("Harga: " + harga);
            }

            sc.nextLine();
            System.out.print("Ulangi lagi (y/n): ");
            ulang = sc.nextLine();

        } while (ulang.equalsIgnoreCase("y"));

        totalTiket = tiket1 + tiket2 + tiket3;
        totalHarga = hargatiket1 + hargatiket2 + hargatiket3;
        System.out.println("\nTotal penjualan tiket hari ini: " + totalTiket);
        System.out.println("Total harga penjualan tiket hari ini: " + totalHarga);
        System.out.println("Pengelola: " + nama);

        System.out.println("\n====== Terimakasih ======");
        sc.close();
    }
}
