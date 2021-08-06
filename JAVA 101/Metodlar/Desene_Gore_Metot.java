package Metodlar;
import java.util.Scanner;
public class Desene_Gore_Metot {

	static void desen(int sayi) {
		int deger = sayi;
		for (int i = deger ; deger <=0 ; deger=deger-5) {
			System.out.println("Çıktısı : " + deger);
		}
		for ( int j = deger ; deger >= sayi ; deger = deger + 5) {
			System.out.println("Çıktısı : " + deger);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Bir sayi giriniz : ");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        desen(sayi);
                   
	}
}
