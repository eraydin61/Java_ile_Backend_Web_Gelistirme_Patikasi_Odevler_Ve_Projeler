package Donguler;
import java.util.Scanner;
public class Yildizlar_ile_Ucgen_Yapimi {

	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Basamak Sayýsý Giriniz : ");
		n = input.nextInt();
		
		for (int i = 0 ; i < n; i++) {
			for (int j=0; j < (n-i) ;j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k <= (2*i+1); k++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i =0 ; i < n-1 ;i++) {
			for(int j = 0 ; j < i+2 ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k <= (2*n)-(2*i+3) ; k++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
