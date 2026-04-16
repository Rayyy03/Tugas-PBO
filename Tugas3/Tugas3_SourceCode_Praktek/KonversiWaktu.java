// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 16 April 2026
// Waktu: 20.07 WITA

import java.util.Scanner;

public class KonversiWaktu {

	private long totalDetik;
	private long detikSekarang;
	private long totalMenit;
	private long menitSekarang;	
	private long totalJam;
	private long jamSekarang;

	public KonversiWaktu(long td) {
        this.totalDetik = td;
	}

	public long hitungDetikSekarang() {
        detikSekarang = totalDetik % 60;
        return detikSekarang;
	}

	public long hitungTotalMenit() {
        totalMenit = totalDetik / 60;
        return totalMenit;
	}

	public long hitungMenitSekarang() {
        menitSekarang = totalMenit % 60;
        return menitSekarang;
	}

	public long hitungTotalJam() {
        totalJam = totalMenit / 60;
        return totalJam;
	}

	public long hitungJamSekarang() {
        jamSekarang = totalJam % 24;
        return jamSekarang;
	}

	public void konversi() {
        hitungDetikSekarang();
        hitungTotalMenit();
        hitungMenitSekarang();
        hitungTotalJam();
        hitungJamSekarang();
	}

	public void tampilkanWaktu() {
		System.out.println("Total detik: " + totalDetik);
		System.out.println("================");
		System.out.printf("Waktu: %02d:%02d:%02d%n", jamSekarang, menitSekarang, detikSekarang);
		System.out.println("================");
		System.out.println();
		System.out.println("Total Detik   : " + totalDetik);
		System.out.println("detikSaat ini : " + detikSekarang);
		System.out.println("menitSaat ini : " + menitSekarang);
		System.out.println("jamSaat ini   : " + jamSekarang);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan total detik: ");
		long totalDetik = scanner.nextLong();

		KonversiWaktu kw = new KonversiWaktu(totalDetik);
		kw.konversi();
		kw.tampilkanWaktu();

		scanner.close();
    }
}