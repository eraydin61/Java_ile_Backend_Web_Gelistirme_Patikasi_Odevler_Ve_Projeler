package Donguler;
import java.util.Scanner;
public class Ters_Ucgen_Yapimi {

	public static void main(String[] args) {
		
		int sayi;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayý Giriniz : ");
		sayi = input.nextInt();
		
		for (int i = 0 ; i < sayi; i++) {
			for (int j=0; j < (i) ;j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k <= (2*sayi-1)-2*i; k++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
