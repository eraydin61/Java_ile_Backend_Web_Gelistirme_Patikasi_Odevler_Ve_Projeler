package Donguler;
import java.util.Scanner;
public class Sayinin_Basamaklar�_Toplami {

	public static void main(String[] args) {
		
		int sayi,basamakSay�s�=0,yedekSayi,toplam=0,basamakDeger=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Say� Giriniz : ");
		sayi = input.nextInt();
		yedekSayi = sayi;
		
		while (yedekSayi != 0) {
			yedekSayi = yedekSayi /10;
			basamakSay�s�++;
		}
		yedekSayi = sayi;
		while (yedekSayi !=0) {
			basamakDeger = yedekSayi %10;
			toplam = toplam + basamakDeger;
			yedekSayi = yedekSayi /10;
		}
		System.out.println("Girilen Say� : "+sayi);
		System.out.println("Basamak Say�s� : "+basamakSay�s�);
		System.out.println("Basamaklar� Toplam� : "+toplam);
	}

}
