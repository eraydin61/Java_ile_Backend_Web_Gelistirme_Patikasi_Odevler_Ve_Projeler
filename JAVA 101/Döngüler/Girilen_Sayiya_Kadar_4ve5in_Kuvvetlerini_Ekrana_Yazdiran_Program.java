package Donguler;
import java.util.Scanner;
public class Girilen_Sayiya_Kadar_4ve5in_Kuvvetlerini_Ekrana_Yazdiran_Program {
/*
 Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana 
 yazd�ran program� yaz�yoruz.
 */
	public static void main(String[] args) {
		
		int sayi;
		Scanner input = new Scanner(System.in);
		System.out.print("Sayi Giriniz : ");
		sayi = input.nextInt();
		
		for (int i=4 ; i<=sayi ; i=i*4) {
			System.out.println("Girilen Say�ya Kadar Olan 3 �n Kuvvetleri"+ i);
		}
		for (int i=5 ; i<=sayi ; i=i*5) {
			System.out.println("Girilen Say�ya Kadar Olan 5 in Kuvvetleri"+ i);
		}

	}

}
