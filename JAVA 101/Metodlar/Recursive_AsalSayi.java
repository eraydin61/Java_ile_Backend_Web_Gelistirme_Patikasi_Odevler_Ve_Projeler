package Metodlar;
import java.util.Scanner;
public class Recursive_AsalSayi {
	
	static void asal(int sayi) {
		int sayac = 0;
		if (sayi < 1 ) {
			System.out.println("1 den buyuk sayilar, asal sayi olabilir");
		}else {
			for (int i = 1 ; i<=sayi ; i++) {
				int kalan = sayi % i ;
				if (kalan == 0) {
					sayac++;
				}
			}
			if (sayac == 2) {
				System.out.println("Sayi asaldir");
			}else {
				System.out.println("Sayi asal degildir");
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Bir sayi giriniz : ");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        asal(sayi);
	}
}
