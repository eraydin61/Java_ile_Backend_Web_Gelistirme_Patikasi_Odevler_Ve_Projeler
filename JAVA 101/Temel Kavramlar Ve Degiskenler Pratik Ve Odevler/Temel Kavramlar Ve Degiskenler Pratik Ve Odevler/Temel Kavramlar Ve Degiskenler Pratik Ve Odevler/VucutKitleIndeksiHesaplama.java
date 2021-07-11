package odev;
import java.util.Scanner;
/*
 Java ile kullanýcýdan boy ve kilo deðerlerini
 alýp bir deðiþkene atayýn. Aþaðýda ki formüle göre
 kullanýcýnýn "Vücut Kitle Ýndeks" deðerini hesaplayýp ekrana yazdýrýn.
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
		System.out.println("Vücut Kitle Ýndeksi :"+kitle);
	}

}
