package odev;
import java.util.Scanner;
/*
 Java ile kullan�c�dan boy ve kilo de�erlerini
 al�p bir de�i�kene atay�n. A�a��da ki form�le g�re
 kullan�c�n�n "V�cut Kitle �ndeks" de�erini hesaplay�p ekrana yazd�r�n.
 Kilo (kg) / Boy(m) * Boy(m)
 */
public class VucutKitleIndeksiHesaplama {

	public static void main(String[] args) {
		
		float boy;
		int kilo;
		double kitle;
		Scanner x = new Scanner(System.in);
		System.out.println("Boyunuzu Giriniz (Metre) :");
		boy= x.nextFloat();
		System.out.println("Kilonuzu Giriniz :");
		kilo = x.nextInt();
		kitle= kilo/(boy*boy);
		System.out.println("V�cut Kitle �ndeksi :"+kitle);
	}

}
