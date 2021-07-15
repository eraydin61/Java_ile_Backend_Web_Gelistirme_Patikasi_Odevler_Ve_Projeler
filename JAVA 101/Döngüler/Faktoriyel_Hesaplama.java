package Donguler;
import java.util.Scanner;
public class Faktoriyel_Hesaplama {
/* 
 N elemanlý bir kümenin elemanlarý ile oluþturulacak r elemanlý
 farklý gruplarýn sayýsý n’in r’li kombinasyonu olarak adlandýrýlýr.
 N’in r’li kombinasyonu C(n,r) þeklinde gösterilir.*/
	public static void main(String[] args) {
		
		int n,r,kombinasyon=1,f1 = 1,f2=1,f3=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Kombinasyon için n Sayýsýný Giriniz : ");
		n = input.nextInt();
		System.out.print("Kombinasyon için r Sayýsýný Giriniz : ");
		r = input.nextInt();
		for(int i =1 ; i<=	n; i++) {
			f1 = f1*i;
		}
		for(int i =1 ; i<=	r; i++) {
			f2 = f2*i;
		}
		for(int i =1 ; i<=	(n-r); i++) {
			f3 = f3*i;
		}
		kombinasyon = f1/(f2*f3);
		System.out.print("Kombinasyon C("+n+","+r+") = "+kombinasyon);
	}
}
