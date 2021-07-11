package odev;
import java.util.Scanner;
/*
 Java ile gidilen mesafeye (KM) göre taksimetre
 tutarýný ekrana yazdýran programý yazýn.
	Taksimetre KM baþýna 2.20 TL tutmaktadýr.
	Minimum ödenecek tutar 20 TL'dir. 20 TL altýnda ki
	 ücretlerde yine 20 TL alýnacaktýr.
	Taksimetre açýlýþ ücreti 10 TL'dir.
 */
public class TaksimetreProgrami {

	public static void main(String[] args) {
		
		int km,taksimetreAcilis=10;
		double  odenecekTutar, KMBasina=2.20;
		Scanner deger = new Scanner(System.in);
		System.out.println("Kaç KM Gideceksiniz :");
		km = deger.nextInt();
		odenecekTutar = taksimetreAcilis+(km*KMBasina);
		if (odenecekTutar < 20) {
			odenecekTutar = 20;
		}
		System.out.println("Taksimetre Tutarý :"+odenecekTutar);
		
	}

}
