// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 16 April 2026
// Waktu: 20.07 WITA

import java.util.Scanner;

class Buah {
    String nama;
    int harga, stok;

    Buah(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    String getInfo() {
        return nama + " - Rp " + harga + " (stok: " + stok + "kg)";
    }

    boolean tersedia(int qty) {
        if (stok >= qty) {
            stok -= qty;
            return true;
        }
        return false;
    }

    double hitungTotal(int qty) {
        return harga * qty;
    }
}

public class TokoBuah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Buah[] katalog = new Buah[3];

        katalog[0] = new Buah("Apel   Rp", 15000, 10);
        katalog[1] = new Buah("Jeruk  Rp", 12000, 8);
        katalog[2] = new Buah("Mangga Rp", 20000, 5);

        System.out.println("=== DAFTAR BUAH ===");
        for (int i = 0; i < katalog.length; i++) {
            System.out.println((i + 1) + ". " + katalog[i].getInfo());
        }

        double total = 0;
        int pilih;

        while (true) {
            System.out.print("\nPilih (0=stop): ");
            pilih = sc.nextInt();

            if (pilih == 0) break;

            if (pilih < 1 || pilih > 3) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.print("Jumlah (kg): ");
            int qty = sc.nextInt();

            Buah b = katalog[pilih - 1];

            if (b.tersedia(qty)) {
                double subTotal = b.hitungTotal(qty);
                total += subTotal;

                System.out.println("OK +Rp" + subTotal);
            } else {
                System.out.println("Stok tidak cukup!");
            }
        }

        System.out.println("Total belanja: Rp" + total);
    }
}