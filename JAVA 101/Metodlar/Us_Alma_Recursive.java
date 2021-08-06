package Kosullar;
import java.util.Scanner;
public class Us_Alma_Recursive {
	
	static double üsAlma(int a,int b) {
		double sonuc;
		sonuc = Math.pow(a, b);
		return sonuc;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = input.nextInt();

        double sonuc = üsAlma(sayi1,sayi2);
        System.out.println(sayi1 + "^" + sayi2 + " = " + sonuc);
	}
}
