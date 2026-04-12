// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 012 April 2026
// Waktu: 12.15 WITA

import java.util.Scanner;
/* Baca N, Print 1 s/d N dengan FOR */

public class PriFor {
		/**
		* @param args
		*/
public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int i,N;
		Scanner masukan=new Scanner(System.in);

		/* program */
		System.out.print ("Baca N, print 1 s/d N ");
		System.out.print ("N = ");

		N=masukan.nextInt();
		for (i = 1; i <= N; i++){
		System.out.println (i); };
		System.out.println ("Akhir program \n");
	}
}