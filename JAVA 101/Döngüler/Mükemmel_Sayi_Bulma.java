package Donguler;
import java.util.Scanner;
public class M�kemmel_Sayi_Bulma {

	public static void main(String[] args) {
		
		int sayi,toplam=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Say� Giriniz : ");
		sayi = input.nextInt();
		
		for (int i=1; i<=sayi;i++) {
			if (sayi % i == 0 ) {
				toplam = toplam + i;
			}	
		}
		if (toplam == 2*sayi) {
			System.out.print("M�kemmel Bir Say�d�r. ");
		}else {
			System.out.print("M�kemmel Bir Say� De�ildir ");
		}
	}
}
