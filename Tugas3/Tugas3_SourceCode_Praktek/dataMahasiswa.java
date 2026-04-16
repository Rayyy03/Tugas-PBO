// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 16 April 2026
// Waktu: 20.07 WITA

import java.util.Scanner;

class Mahasiswa {
	String nama, nim;
	int jumlahMK;
	int[] nilai;

	Mahasiswa(String nama, String nim, int jumlahMK) {
		this.nama = nama;
		this.nim = nim;
		this.jumlahMK = jumlahMK;
		nilai = new int[jumlahMK];
	}

	void inputNilai(Scanner sc) {
		for (int i = 0; i < jumlahMK; i++) {
			System.out.print("Nilai MK ke-" + (i+1) + " = ");
			nilai[i] = sc.nextInt();
		}

	}
	
	double hitungRataRata() {
		int total = 0;
		for (int i = 0; i < jumlahMK; i++) {
			total += nilai[i];
		}
		return (double) total / jumlahMK;
	}

	char getGrade(double avg) {
		if (avg >= 85) return 'A';
		else if (avg >= 75) return 'B';
		else if (avg >= 60) return 'C';
		else return 'D';
	}
	
	boolean isLulus(double avg) {
		return avg >= 60;
	}

	void tampilRapor() {
		double avg = hitungRataRata();
		char grade = getGrade(avg);
		boolean lulus = isLulus(avg);

		System.out.println("\n=== Rapor Mahasiswa ===");
		System.out.println("Nama = " + nama);
		System.out.println("Nim = " + nim);

		System.out.println("Nilai = ");
		for (int i = 0; i < jumlahMK; i++) {
			System.out.println("MK = " + (i+1) + " = " + nilai[i]);
		}

		System.out.printf("Rata-rata = %.2f\n", avg);
		System.out.println("Grade     = " + grade);
		System.out.println("Lulus     = " + lulus);
	}
}

public class dataMahasiswa {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.print("Jumlah MK: ");
        int jumlahMK = sc.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jumlahMK);

        mhs.inputNilai(sc);
        mhs.tampilRapor();
	}
}
