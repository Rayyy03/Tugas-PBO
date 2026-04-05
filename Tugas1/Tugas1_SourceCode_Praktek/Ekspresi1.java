// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 03 April 2026
// Waktu: 17.04 WITA

/* pembagian integer, casting */
public class Ekspresi1 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* KAMUS */
		int x = 1; int y = 2; float fx; float fy;
		/* ALGORITMA */
		System.out.print ("x/y (format integer) = "+ x/y);
		System.out.print ("\n x/y (format float) = "+ x/y);
		/* supaya hasilnya tidak nol */
		fx=x;
		fy=y;
		System.out.print ("\n x/y (format integer) = "+ fx /fy);
		System.out.print ("\n x/y (format float) = "+ fx /fy);
		/* casting */
		System.out.print("\n float(x)/float(y) (format integer)= "+ (float)x/(float)y);
		System.out.print("\n float(x)/float(y) (format float) = "+ (float)x/(float)y);
		x = 10; y = 3;
		System.out.print ("\n x/y (format integer) = "+ x/y);
		System.out.print ("\n x/y (format float = "+ x/y);
	}
}