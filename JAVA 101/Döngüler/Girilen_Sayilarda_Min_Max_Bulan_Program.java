package Donguler;
import java.util.Scanner;
public class Girilen_Sayilarda_Min_Max_Bulan_Program {

	public static void main(String[] args) {
		
		int sayiAdedi,min=0,max=10;
		Scanner input = new Scanner(System.in);
		System.out.print("Ka� Say� Gireceksiniz : ");
		sayiAdedi = input.nextInt();
		
		for(int i = 1 ; i <=4 ; i++) {
			System.out.print(i+". Say�y� Giriniz : ");
			int sayi = input.nextInt();
			if (sayi < min) {
				min = sayi;
			}else {
				max=sayi;
			}
		}
		System.out.println("En B�y�k Say� : "+max);
		System.out.println("En K���k Say� : "+min);
	}
}
