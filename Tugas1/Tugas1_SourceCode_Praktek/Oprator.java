// NIM: 13020240101
// Nama: Abrar Raynaldo Arifuddin
// Tanggal: 03 April 2026
// Waktu: 17.04 WITA

/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* Kamus */
				boolean Bool1, Bool2, TF ;
				int i,j, hsl ;
				float x, y, res;
			/* algoritma */
				System.out.println ("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");

				Bool1 = true; Bool2 = false;
				System.out.println("\nOperator Boolean");
				TF = Bool1 && Bool2 ; /* Boolean AND */
				System.out.println("Bool1 && Bool2 = " + TF);
				TF = Bool1 || Bool2 ; /* Boolean OR */
				System.out.println("Bool1 || Bool2 = " + TF);
				TF = ! Bool1 ; /* NOT */
				System.out.println("!Bool1 = " + TF);
				TF = Bool1 ^ Bool2; /* XOR */
				System.out.println("Bool1 ^ Bool2 = " + TF + "\n");

				System.out.println("Operasi Numerik");
				i = 5; j = 2 ;
				hsl = i+j;
				System.out.println("i + j = " + (i + j));
 				hsl = i - j;
				System.out.println("i - j = " + (i - j));
				hsl = i / j;
				System.out.println("i / j = " + (i / j));	
				hsl = i * j;
				System.out.println("i * j = " + (i * j));
				hsl = i /j ; /* pembagian bulat */
				System.out.println("i / j = " + (i /j));
				hsl = i%j ; /* sisa modulo */
				System.out.println("i % j = " + (i % j) + "\n");
	
				System.out.println("Operasi Numerik");
				x = 5 ; y = 5 ;
				res = x + y;
				System.out.println("x + y = " + (x + y));
				res = x - y;
				System.out.println("x - y = " + (x - y));
				res = x / y;
				System.out.println("x / y = " + (x / y));
				res = x * y;
				System.out.println("x * y = " + (x * y) + "\n");

				System.out.println("Operasi Relasional Numerik");
				TF = (i==j);
				System.out.println("i == j = " + (i == j));
				TF = (i!=j);
				System.out.println("i != j = " + (i != j));
				TF = (i < j);
				System.out.println("i < j = " + (i < j));
				TF = (i > j);
				System.out.println("i > j = " + (i > j));
				TF = (i <= j);
				System.out.println("i <= j = " + (i <= j));
				TF = (i >= j);
				System.out.println("i >= j = " + (i >= j) + "\n");

				System.out.println("Operasi Relasional Numerik");
				TF = (x != y);
				System.out.println("x != y = " + (x != y));
				TF = (x < y);
				System.out.println("x < y = " + (x < y));
				TF = (x > y);
				System.out.println("x > y = " + (x > y));
				TF = (x <= y);
				System.out.println("x <= y = " + (x <= y));
				TF = (x >= y);
				System.out.println("x >= y = " + (x >= y) + "\n");
		}
}