package Donguler;
import java.util.Scanner;
public class Uslu_Sayi_Hesaplayan_Program {
/* 
Java ile kullanýcýnýn girdiði deðerler ile üslü sayý hesaplayan programý yazýyoruz.
 */
	public static void main(String[] args) {
		
		int x,y,toplam=1,i=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Üssü Alýnacak Sayý : ");
		x = input.nextInt();
		System.out.print("Üs olacak Sayý : ");
		y = input.nextInt();
		
		while (i <= y) {
			toplam=toplam*x;
			i++;
		}
		System.out.print("Girilen "+x+" 'in "+y+"'inci Kuvveti = "+toplam);
	}
}
