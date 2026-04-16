// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 16 April 2026
// Waktu: 20.07 WITA

import java.util.Scanner;

class kalkulator {
	double angka1, angka2;
	
	kalkulator(double a, double b) {
		angka1 = a;
		angka2 = b;
	}

	double tambah() {
		return angka1 + angka2;
	}
	
	double kurang() {
		return angka1 - angka2;
	}

	double kali() {
		return angka1 * angka2;
	}
	

	double bagi() {
		return angka1 / angka2;
	}

}



public class kalkulatorSederhana {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double angka1, angka2, hasil = 0;
		char operator, lagi = 'y';
	
		do {
			System.out.print("Angka1: ");
			angka1 = input.nextDouble();

			System.out.print("Angka2: ");
			angka2 = input.nextDouble();		

			System.out.print("Operator (+, -, *, /): ");
			operator = input.next().charAt(0);

			kalkulator k = new kalkulator(angka1, angka2);

			switch(operator) {
				case '+':
					System.out.print("Hasil : ");
					hasil = k.tambah();
					break;
				
				case '-':
					System.out.print("Hasil : ");
					hasil = k.kurang();
					break;

				case '*':
					System.out.print("Hasil : ");
					hasil = k.kali();
					break;

				case '/':
					if (angka2 == 0) {
						System.out.println("Error: pembagian dengan nol");
						continue;
					} else {
						System.out.print("Hasil : ");
						hasil = k.bagi();
					}
					break;
					default:
						System.out.println("Operator tidak dikenali");
						continue;
			}
			System.out.printf("%.2f %c %.2f = %.2f\n", angka1, operator, angka2, hasil);

			System.out.print("Hitung lagi? (y/n): ");
			lagi = input.next().charAt(0);

		} while (lagi == 'y' || lagi == 'Y');

		System.out.println("Program Selesai");
	}

}