package Donguler;
import java.util.Scanner;
public class Uslu_Sayi_Hesaplayan_Program {
/* 
Java ile kullan�c�n�n girdi�i de�erler ile �sl� say� hesaplayan program� yaz�yoruz.
 */
	public static void main(String[] args) {
		
		int x,y,toplam=1,i=1;
		Scanner input = new Scanner(System.in);
		System.out.print("�ss� Al�nacak Say� : ");
		x = input.nextInt();
		System.out.print("�s olacak Say� : ");
		y = input.nextInt();
		
		while (i <= y) {
			toplam=toplam*x;
			i++;
		}
		System.out.print("Girilen "+x+" 'in "+y+"'inci Kuvveti = "+toplam);
	}
}
