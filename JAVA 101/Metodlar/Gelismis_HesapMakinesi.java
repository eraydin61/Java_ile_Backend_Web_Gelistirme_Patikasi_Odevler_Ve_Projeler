package Metodlar;
import java.util.Scanner;
public class Gelismis_HesapMakinesi {
	
	static void faktoriyel() {
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen Faktoriyel Al�nacak Say�y� Giriniz : ");
		int sayi = input.nextInt();
		int deger = 1;
		for (int i = 1 ; i <= sayi ; i++) {
			deger = deger * i ;
		}
		System.out.println("Girdi�iniz Say�n�n Faktoriyeli = "+ deger);
	}
	
	static void toplama() {
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen 1. Say�y� Giriniz : ");
		float sayi1 = input.nextFloat();
		System.out.print("L�tfen 2. Say�y� Giriniz : ");
		float sayi2 = input.nextFloat();
		System.out.println("Say�lar�n toplam� = " + (sayi1 + sayi2));
	}
	
	static void cikarma(){
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen 1. Say�y� Giriniz : ");
		float sayi1 = input.nextFloat();
		System.out.print("L�tfen 2. Say�y� Giriniz : ");
		float sayi2 = input.nextFloat();
		System.out.println("Say�lar�n ��karmas� Sonucu = " + (sayi1 - sayi2));
	}
	
	static void carpma(){
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen 1. Say�y� Giriniz : ");
		float sayi1 = input.nextFloat();
		System.out.print("L�tfen 2. Say�y� Giriniz : ");
		float sayi2 = input.nextFloat();
		System.out.println("Say�lar�n �arp�m� = " + (sayi1 * sayi2));
	}
	
	static void b�lme(){
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen 1. Say�y� Giriniz : ");
		float sayi1 = input.nextFloat();
		System.out.print("L�tfen 2. Say�y� Giriniz : ");
		float sayi2 = input.nextFloat();
		System.out.print("Say�lar�n B�l�m� = " + (sayi1 / sayi2));
	}
	
	static void �stAl() {
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen Say�y� Giriniz : ");
		int sayi1 = input.nextInt();
		System.out.print("L�tfen Say�y�n�n �ss�n� Giriniz : ");
		int sayi2 = input.nextInt();
		int yedekSayi1 = sayi1;
		for ( int i = 1 ; i<sayi2 ; i++ ) {
			yedekSayi1 = yedekSayi1*sayi1;
			}
		System.out.print(sayi1 + "' in "+ sayi2 + " 'inci �ss� = "+ yedekSayi1);
	}
	
	static void mod() {
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen Say�y� Giriniz : ");
		int sayi = input.nextInt();
		System.out.print("Mod Ka� Olaca��n� Giriniz  : ");
		int mod = input.nextInt();
		System.out.println(sayi + " say�s�n�n "+ mod + " 'e g�re modu = "+ (sayi % mod));	
	}
	
	static void dikd�rtgen() {
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen Uzun Kenar� Giriniz : ");
		int uzun = input.nextInt();
		System.out.print("L�tfen K�sa Kenar� Giriniz : ");
		int k�sa = input.nextInt();
		System.out.println("Dikd�rtgenin Alan� = " + (uzun*k�sa));
		System.out.println("Dikd�rtgenin �evresi = " + 2*(uzun+k�sa));
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int secim;
		String menu = "1 - Toplama i�lemi\n"
				+ "2 - ��karma ��lemi\n"
				+ "3 - �arpma ��lemi\n"
				+ "4 - B�lme ��lemi\n"
				+ "5 - �sl� Say� Hesaplama\n"
				+ "6 - Faktoriyel Hesaplama \n"
				+ "7 - Mod Alma\n"
				+ "8 - Dikd�rtgen Alan ve �evre Hesab�\n"
				+ "0 - ��k�� yap";
		
		do {
			System.out.println(menu);
			System.out.print("L�tfen bir i�lem se�iniz : ");
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
				b�lme();
				break;
			case 5:
				�stAl();
				break;
			case 6:
				faktoriyel();
				break;
			case 7:
				mod();
				break;
			case 8:
				dikd�rtgen();
				break;
			case 0:
				break;
				default:
					System.out.println("Yanl�� bir de�er girdiniz.");
			}
		}while (secim !=0);
	}

	private static void cikar() {
		// TODO Auto-generated method stub
		
	}
}
