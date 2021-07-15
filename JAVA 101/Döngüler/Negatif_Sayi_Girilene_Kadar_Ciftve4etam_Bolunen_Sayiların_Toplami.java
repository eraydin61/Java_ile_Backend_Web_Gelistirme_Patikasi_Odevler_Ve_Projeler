package Donguler;
import java.util.Scanner;
public class Negatif_Sayi_Girilene_Kadar_Ciftve4etam_Bolunen_Sayilarýn_Toplami {
/*
 Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden
 ve girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana 
 basan programý*/
	public static void main(String[] args) {
		
		int kosul,toplam=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Girdiðiniz Sayý Negatif Olduðunda Program Sonlanacak.");
		System.out.print("Sayý Giriniz : ");
		kosul = input.nextInt();
		
		while (kosul>0) {
			if (kosul %2 == 0 && kosul %4 ==0 ) {
				toplam = toplam + kosul;
			}
			System.out.print("Sayý Giriniz : ");
			kosul = input.nextInt();
		}
		System.out.print("Girilen Çift ve 4 e tam Bölünen Sayýlarýn Toplamý : "+toplam);
	}
}
