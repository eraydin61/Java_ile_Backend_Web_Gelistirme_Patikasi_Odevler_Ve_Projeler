package Kosullar;
import java.util.Scanner;
public class Hesap_Makinesi {
/*
 Hesap makinesini switch-case kullanarak yapýnýz.
*/
	public static void main(String[] args) {
		
		float sayi1,sayi2;
		int hangisi;
		Scanner iste = new Scanner(System.in);
		System.out.print("1. Sayýyý Giriniz :");
		sayi1 = iste.nextFloat();
		System.out.print("2. Sayýyý Giriniz :");
		sayi2 = iste.nextFloat();
		System.out.println(" 1 - Toplama \n 2 - Çýkarma \n 3 - Çarpma \n 4 - Bölme");
		System.out.print("Seçiniz :");
		hangisi = iste.nextInt();
		
		switch (hangisi) {
		case 1:
			System.out.print("Toplama sonucu = "+ (sayi1+sayi2));
			break;
		case 2:
			System.out.print("Çýkarma sonucu = "+ (sayi1-sayi2));
			break;
		case 3:
			System.out.print("Çarpma sonucu = "+ (sayi1*sayi2));
			break;
		case 4:
			System.out.print("Bölme sonucu = "+ (sayi1/sayi2));
			break;
		}
	}
}
