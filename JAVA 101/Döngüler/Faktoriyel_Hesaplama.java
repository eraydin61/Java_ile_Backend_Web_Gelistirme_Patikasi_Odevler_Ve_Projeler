package Donguler;
import java.util.Scanner;
public class Faktoriyel_Hesaplama {
/* 
 N elemanl� bir k�menin elemanlar� ile olu�turulacak r elemanl�
 farkl� gruplar�n say�s� n�in r�li kombinasyonu olarak adland�r�l�r.
 N�in r�li kombinasyonu C(n,r) �eklinde g�sterilir.*/
	public static void main(String[] args) {
		
		int n,r,kombinasyon=1,f1 = 1,f2=1,f3=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Kombinasyon i�in n Say�s�n� Giriniz : ");
		n = input.nextInt();
		System.out.print("Kombinasyon i�in r Say�s�n� Giriniz : ");
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
