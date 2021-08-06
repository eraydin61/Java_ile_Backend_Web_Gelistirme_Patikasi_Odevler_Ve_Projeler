package Metodlar;

public class Palindrom_Sayi {

	static boolean isPalindrom(int sayi) {
		int de�er = sayi , tersSayi=0, mod;
		while (de�er !=0) {
			mod = de�er % 10 ;
			tersSayi = (tersSayi * 10)+mod;
			de�er = de�er / 10;
		}
		return sayi == tersSayi ;
	}
	public static void main(String[] args) {
	
		System.out.println(isPalindrom(343));
	}
}
