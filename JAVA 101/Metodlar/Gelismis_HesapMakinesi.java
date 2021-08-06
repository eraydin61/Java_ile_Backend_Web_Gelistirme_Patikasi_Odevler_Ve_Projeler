package Metodlar;
import java.util.Scanner;
public class Gelismis_HesapMakinesi {
	
	static void faktoriyel() {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Faktoriyel Alýnacak Sayýyý Giriniz : ");
		int sayi = input.nextInt();
		int deger = 1;
		for (int i = 1 ; i <= sayi ; i++) {
			deger = deger * i ;
		}
		System.out.println("Girdiðiniz Sayýnýn Faktoriyeli = "+ deger);
	}
	
	static void toplama() {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen 1. Sayýyý Giriniz : ");
		float sayi1 = input.nextFloat();
		System.out.print("Lütfen 2. Sayýyý Giriniz : ");
		float sayi2 = input.nextFloat();
		System.out.println("Sayýlarýn toplamý = " + (sayi1 + sayi2));
	}
	
	static void cikarma(){
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen 1. Sayýyý Giriniz : ");
		float sayi1 = input.nextFloat();
		System.out.print("Lütfen 2. Sayýyý Giriniz : ");
		float sayi2 = input.nextFloat();
		System.out.println("Sayýlarýn Çýkarmasý Sonucu = " + (sayi1 - sayi2));
	}
	
	static void carpma(){
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen 1. Sayýyý Giriniz : ");
		float sayi1 = input.nextFloat();
		System.out.print("Lütfen 2. Sayýyý Giriniz : ");
		float sayi2 = input.nextFloat();
		System.out.println("Sayýlarýn Çarpýmý = " + (sayi1 * sayi2));
	}
	
	static void bölme(){
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen 1. Sayýyý Giriniz : ");
		float sayi1 = input.nextFloat();
		System.out.print("Lütfen 2. Sayýyý Giriniz : ");
		float sayi2 = input.nextFloat();
		System.out.print("Sayýlarýn Bölümü = " + (sayi1 / sayi2));
	}
	
	static void üstAl() {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Sayýyý Giriniz : ");
		int sayi1 = input.nextInt();
		System.out.print("Lütfen Sayýyýnýn Üssünü Giriniz : ");
		int sayi2 = input.nextInt();
		int yedekSayi1 = sayi1;
		for ( int i = 1 ; i<sayi2 ; i++ ) {
			yedekSayi1 = yedekSayi1*sayi1;
			}
		System.out.print(sayi1 + "' in "+ sayi2 + " 'inci üssü = "+ yedekSayi1);
	}
	
	static void mod() {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Sayýyý Giriniz : ");
		int sayi = input.nextInt();
		System.out.print("Mod Kaç Olacaðýný Giriniz  : ");
		int mod = input.nextInt();
		System.out.println(sayi + " sayýsýnýn "+ mod + " 'e göre modu = "+ (sayi % mod));	
	}
	
	static void dikdörtgen() {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Uzun Kenarý Giriniz : ");
		int uzun = input.nextInt();
		System.out.print("Lütfen Kýsa Kenarý Giriniz : ");
		int kýsa = input.nextInt();
		System.out.println("Dikdörtgenin Alaný = " + (uzun*kýsa));
		System.out.println("Dikdörtgenin Çevresi = " + 2*(uzun+kýsa));
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int secim;
		String menu = "1 - Toplama iþlemi\n"
				+ "2 - Çýkarma Ýþlemi\n"
				+ "3 - Çarpma Ýþlemi\n"
				+ "4 - Bölme Ýþlemi\n"
				+ "5 - Üslü Sayý Hesaplama\n"
				+ "6 - Faktoriyel Hesaplama \n"
				+ "7 - Mod Alma\n"
				+ "8 - Dikdörtgen Alan ve Çevre Hesabý\n"
				+ "0 - Çýkýþ yap";
		
		do {
			System.out.println(menu);
			System.out.print("Lütfen bir iþlem seçiniz : ");
			secim = input.nextInt();
			switch(secim) {
			case 1:
				toplama();
				break;
			case 2:
				cikarma();
				break;
			case 3:
				carpma();
				break;
			case 4:
				bölme();
				break;
			case 5:
				üstAl();
				break;
			case 6:
				faktoriyel();
				break;
			case 7:
				mod();
				break;
			case 8:
				dikdörtgen();
				break;
			case 0:
				break;
				default:
					System.out.println("Yanlýþ bir deðer girdiniz.");
			}
		}while (secim !=0);
	}

	private static void cikar() {
		// TODO Auto-generated method stub
		
	}
}
