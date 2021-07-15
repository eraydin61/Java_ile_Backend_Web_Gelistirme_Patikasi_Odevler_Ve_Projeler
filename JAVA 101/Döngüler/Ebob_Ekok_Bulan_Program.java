package Donguler;
import java.util.Scanner;
public class Ebob_Ekok_Bulan_Program {

	public static void main(String[] args) {
		
		int sayi1,sayi2,ebob = 0,ekok;
		Scanner input = new Scanner(System.in);
		System.out.print("1. Sayýyý Giriniz : ");
		sayi1 = input.nextInt();
		System.out.print("2. Sayýyý Giriniz : ");
		sayi2 = input.nextInt();
		int i=1;
		while (i <=sayi1 ) {
			if (sayi1 % i == 0 && sayi2 % i == 0) {
				System.out.println("Ortak Bölenler Sýrasýyla : "+i);
				ebob=i;
			}
			i++;
		}
		System.out.println("EBOB = "+ebob);
		
		ekok = (sayi1*sayi2)/ebob;
		System.out.println("EKOK = "+ekok);
	}
}
