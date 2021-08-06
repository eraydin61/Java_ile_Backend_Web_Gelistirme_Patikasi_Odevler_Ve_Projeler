package Metodlar;

public class Palindrom_Sayi {

	static boolean isPalindrom(int sayi) {
		int deðer = sayi , tersSayi=0, mod;
		while (deðer !=0) {
			mod = deðer % 10 ;
			tersSayi = (tersSayi * 10)+mod;
			deðer = deðer / 10;
		}
		return sayi == tersSayi ;
	}
	public static void main(String[] args) {
	
		System.out.println(isPalindrom(343));
	}
}
