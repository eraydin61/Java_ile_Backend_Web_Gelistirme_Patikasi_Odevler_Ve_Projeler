package Donguler;
import java.util.Scanner;
public class Sayinin_Basamaklarý_Toplami {

	public static void main(String[] args) {
		
		int sayi,basamakSayýsý=0,yedekSayi,toplam=0,basamakDeger=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý Giriniz : ");
		sayi = input.nextInt();
		yedekSayi = sayi;
		
		while (yedekSayi != 0) {
			yedekSayi = yedekSayi /10;
			basamakSayýsý++;
		}
		yedekSayi = sayi;
		while (yedekSayi !=0) {
			basamakDeger = yedekSayi %10;
			toplam = toplam + basamakDeger;
			yedekSayi = yedekSayi /10;
		}
		System.out.println("Girilen Sayý : "+sayi);
		System.out.println("Basamak Sayýsý : "+basamakSayýsý);
		System.out.println("Basamaklarý Toplamý : "+toplam);
	}

}
