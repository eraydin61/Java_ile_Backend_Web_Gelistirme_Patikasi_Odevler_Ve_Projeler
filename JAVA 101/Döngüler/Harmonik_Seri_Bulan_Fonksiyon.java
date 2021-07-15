package Donguler;
import java.util.Scanner;
public class Harmonik_Seri_Bulan_Fonksiyon {

	public static void main(String[] args) {
		
		int sayi;
		double harmonik=0.0;
		Scanner input = new Scanner(System.in);
		System.out.print("Harmonik hesaplanacak Sayýyý Giriniz : ");
		sayi = input.nextInt();
		
		for (double i = 1 ; i <=sayi ;i++) {
			harmonik = harmonik + (1 / i);
		}
		System.out.print("Harmonik Sonuç = "+harmonik);
	}
}
