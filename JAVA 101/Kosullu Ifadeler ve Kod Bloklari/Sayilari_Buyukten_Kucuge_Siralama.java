package Kosullar;
import java.util.Scanner;
public class Sayilari_Buyukten_Kucuge_Siralama {
/* Java ko�ullu ifadeler ile girilen 3 say�y� b�y�kten
   k����e s�ralayan program yap�m�.*/
	public static void main(String[] args) {
		
		float sayi1,sayi2,sayi3;
		Scanner input = new Scanner(System.in);
		System.out.print("1. Say�y� Giriniz : ");
		sayi1 = input.nextFloat();
		System.out.print("2. Say�y� Giriniz : ");
		sayi2 = input.nextFloat();
		System.out.print("3. Say�y� Giriniz : ");
		sayi3 = input.nextFloat();
		
		if ((sayi1>sayi2) && (sayi1>sayi3)) {
			if (sayi2 > sayi3) {
				System.out.print("Say�lar�n B�y�kten K����e S�ral� Hali = "+ sayi1 +" > "+sayi2+ " > "+sayi3 );
			}else {
				System.out.print("Say�lar�n B�y�kten K����e S�ral� Hali = "+ sayi1 +" > "+sayi3+ " > "+sayi2 );
			}
		}else if ((sayi2>sayi1)&& (sayi2>sayi3)) {
			if (sayi1 > sayi3) {
				System.out.print("Say�lar�n B�y�kten K����e S�ral� Hali = "+ sayi2 +" > "+sayi1+ " > "+sayi3 );
			}else {
				System.out.print("Say�lar�n B�y�kten K����e S�ral� Hali = "+ sayi2 +" > "+sayi3+ " > "+sayi1 );
			}
		}else {
			if (sayi1 > sayi2 ) {
				System.out.print("Say�lar�n B�y�kten K����e S�ral� Hali = "+ sayi3 +" > "+sayi1+ " > "+sayi2 );
			}else {
				System.out.print("Say�lar�n B�y�kten K����e S�ral� Hali = "+ sayi3 +" > "+sayi2+ " > "+sayi1 );
			}
		}
	}
}
