package Donguler;
import java.util.Scanner;
public class Fibonacci_Serisi {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i,sayi;
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý Giriniz : ");
		sayi = input.nextInt();
		
		for (i=2 ; i<sayi ; i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
}
