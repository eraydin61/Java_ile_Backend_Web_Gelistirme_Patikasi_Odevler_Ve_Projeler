package Kosullar;
import java.util.Scanner;
public class Hesap_Makinesi {
/*
 Hesap makinesini switch-case kullanarak yap�n�z.
*/
	public static void main(String[] args) {
		
		float sayi1,sayi2;
		int hangisi;
		Scanner iste = new Scanner(System.in);
		System.out.print("1. Say�y� Giriniz :");
		sayi1 = iste.nextFloat();
		System.out.print("2. Say�y� Giriniz :");
		sayi2 = iste.nextFloat();
		System.out.println(" 1 - Toplama \n 2 - ��karma \n 3 - �arpma \n 4 - B�lme");
		System.out.print("Se�iniz :");
		hangisi = iste.nextInt();
		
		switch (hangisi) {
		case 1:
			System.out.print("Toplama sonucu = "+ (sayi1+sayi2));
			break;
		case 2:
			System.out.print("��karma sonucu = "+ (sayi1-sayi2));
			break;
		case 3:
			System.out.print("�arpma sonucu = "+ (sayi1*sayi2));
			break;
		case 4:
			System.out.print("B�lme sonucu = "+ (sayi1/sayi2));
			break;
		}
	}
}
