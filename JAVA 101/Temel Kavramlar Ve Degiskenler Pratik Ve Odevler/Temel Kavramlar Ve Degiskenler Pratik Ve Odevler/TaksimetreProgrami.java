package odev;
import java.util.Scanner;
/*
 Java ile gidilen mesafeye (KM) g�re taksimetre
 tutar�n� ekrana yazd�ran program� yaz�n.
	Taksimetre KM ba��na 2.20 TL tutmaktad�r.
	Minimum �denecek tutar 20 TL'dir. 20 TL alt�nda ki
	 �cretlerde yine 20 TL al�nacakt�r.
	Taksimetre a��l�� �creti 10 TL'dir.
 */
public class TaksimetreProgrami {

	public static void main(String[] args) {
		
		int km,taksimetreAcilis=10;
		double  odenecekTutar, KMBasina=2.20;
		Scanner deger = new Scanner(System.in);
		System.out.println("Ka� KM Gideceksiniz :");
		km = deger.nextInt();
		odenecekTutar = taksimetreAcilis+(km*KMBasina);
		if (odenecekTutar < 20) {
			odenecekTutar = 20;
		}
		System.out.println("Taksimetre Tutar� :"+odenecekTutar);
		
	}

}
