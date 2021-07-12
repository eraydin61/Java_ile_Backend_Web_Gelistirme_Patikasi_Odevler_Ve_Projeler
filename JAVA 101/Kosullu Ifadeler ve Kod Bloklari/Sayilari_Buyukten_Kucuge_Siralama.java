package Kosullar;
import java.util.Scanner;
public class Sayilari_Buyukten_Kucuge_Siralama {
/* Java koşullu ifadeler ile girilen 3 sayıyı büyükten
   küçüğe sıralayan program yapımı.*/
	public static void main(String[] args) {
		
		float sayi1,sayi2,sayi3;
		Scanner input = new Scanner(System.in);
		System.out.print("1. Sayıyı Giriniz : ");
		sayi1 = input.nextFloat();
		System.out.print("2. Sayıyı Giriniz : ");
		sayi2 = input.nextFloat();
		System.out.print("3. Sayıyı Giriniz : ");
		sayi3 = input.nextFloat();
		
		if ((sayi1>sayi2) && (sayi1>sayi3)) {
			if (sayi2 > sayi3) {
				System.out.print("Sayıların Büyükten Küçüğe Sıralı Hali = "+ sayi1 +" > "+sayi2+ " > "+sayi3 );
			}else {
				System.out.print("Sayıların Büyükten Küçüğe Sıralı Hali = "+ sayi1 +" > "+sayi3+ " > "+sayi2 );
			}
		}else if ((sayi2>sayi1)&& (sayi2>sayi3)) {
			if (sayi1 > sayi3) {
				System.out.print("Sayıların Büyükten Küçüğe Sıralı Hali = "+ sayi2 +" > "+sayi1+ " > "+sayi3 );
			}else {
				System.out.print("Sayıların Büyükten Küçüğe Sıralı Hali = "+ sayi2 +" > "+sayi3+ " > "+sayi1 );
			}
		}else {
			if (sayi1 > sayi2 ) {
				System.out.print("Sayıların Büyükten Küçüğe Sıralı Hali = "+ sayi3 +" > "+sayi1+ " > "+sayi2 );
			}else {
				System.out.print("Sayıların Büyükten Küçüğe Sıralı Hali = "+ sayi3 +" > "+sayi2+ " > "+sayi1 );
			}
		}
	}
}
