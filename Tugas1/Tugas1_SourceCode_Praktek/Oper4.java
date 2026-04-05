// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 03 April 2026
// Waktu: 17.04 WITA

/* Operator terner */
public class Oper4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* KAMUS */

		int i = 0; /* perhatikan int i,j=0 bukan seperti ini */
		int j = 0;

		char c = 8; char d = 10;
		int e = (((int)c > (int)d) ? c: d);
		int k = ((i>j) ? i: j);
		/* ALGORITMA */

		System.out.print ("Nilai e = "+ e);
		System.out.print ("\nNilai k = "+ k);
		i = 2;
		j = 3;
		k = ((i++>j++) ? i: j) ;
		System.out.print ("\nNilai k = "+ k);
	}
}