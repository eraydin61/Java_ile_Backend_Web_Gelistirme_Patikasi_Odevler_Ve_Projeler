package Donguler;
import java.util.Scanner;
public class Negatif_Sayi_Girilene_Kadar_Ciftve4etam_Bolunen_Sayilar�n_Toplami {
/*
 Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden
 ve girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p ekrana 
 basan program�*/
	public static void main(String[] args) {
		
		int kosul,toplam=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Girdi�iniz Say� Negatif Oldu�unda Program Sonlanacak.");
		System.out.print("Say� Giriniz : ");
		kosul = input.nextInt();
		
		while (kosul>0) {
			if (kosul %2 == 0 && kosul %4 ==0 ) {
				toplam = toplam + kosul;
			}
			System.out.print("Say� Giriniz : ");
			kosul = input.nextInt();
		}
		System.out.print("Girilen �ift ve 4 e tam B�l�nen Say�lar�n Toplam� : "+toplam);
	}
}
