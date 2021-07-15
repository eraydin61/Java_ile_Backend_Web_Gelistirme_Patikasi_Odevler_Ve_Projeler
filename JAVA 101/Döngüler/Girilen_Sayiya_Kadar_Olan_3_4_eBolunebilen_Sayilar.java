package Donguler;
import java.util.Scanner;
public class Girilen_Sayiya_Kadar_Olan_3_4_eBolunebilen_Sayilar {

	public static void main(String[] args) {
		
		int sayi,toplam=0,sayac3=0,sayac4=0,ortalama=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayý Giriniz : ");
		sayi = input.nextInt();
		
		for (int i = 0; i <= sayi; i++) {
			if (i%3==0) {
				toplam=toplam+i;
				sayac3++;
			}else if(i%4==0) {
				toplam=toplam+i;		
				sayac4++;
			}
		}
		ortalama = toplam / (sayac3+sayac4);
		System.out.println("3 ve 4 e Bölünen Sayýlarýn Toplamý : "+ toplam);
		System.out.println("3 ve 4 e Bölünen Sayýlarýn Toplam Adedi : "+ (sayac3+sayac4));
		System.out.println("3 ve 4 e Bölünen Sayýlarýn Ortalamasý : "+ ortalama);
	}
}
