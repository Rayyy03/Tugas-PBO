// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 03 April 2026
// Waktu: 17.04 WITA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

//import javax.swing.*;
public class Bacakar {
		/**
		* @param args
		* @throws IOException
		*/
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			/* Kamus */
			char cc; int bil;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader dataIn = new BufferedReader(isr);

		// atau
		BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

		/* Algoritma */
		System.out.print ("hello\n");
		System.out.print("baca 1 karakter : ");

		//perintah baca karakter cc
		cc =dataIn.readLine().charAt(0);
		System.out.print("baca 1 bilangan : ");

		//perintah baca bil
		bil =Integer.parseInt(datAIn.readLine());

		/*String kar = JOptionPane.showInputDialog("Karakter 1 : "); 
		System.out.println(kar); */

		//JOptionPane.showMessageDialog(null,"hello");

		System.out.print (cc +"\n" +bil+"\n");
		System.out.print ("bye \n");

		/* Tambahkan program membaca/input data
		menggunakan Class Scanner, Class Console dan Class
		JOptionPane */

		/* Scanner */
		System.out.println("\n=== Scanner ===");
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Baca karakter: ");
        	char c2 = sc.next().charAt(0);

        	System.out.print("Baca bilangan: ");
        	int b2 = sc.nextInt();

        	System.out.println("Karakter: " + c2);
        	System.out.println("Bilangan: " + b2);

		
		/* Console */
        	System.out.println("\n=== Console ===");
        	java.io.Console console = System.console();

       	String inputChar = console.readLine("Baca karakter: ");
       	String inputBil = console.readLine("Baca bilangan: ");

        	System.out.println("Karakter: " + inputChar);
        	System.out.println("Bilangan: " + inputBil);

		/* JOptionPane */
        	System.out.println("\n=== JOptionPane ===");

        	String kar = JOptionPane.showInputDialog("Masukkan karakter:");
        	String bilangan = JOptionPane.showInputDialog("Masukkan bilangan:");

        	JOptionPane.showMessageDialog(null, "Karakter: " + kar + "\nBilangan: " + bilangan);

       	System.out.println("Program selesai");
	}
}