package odev;
import java.util.Scanner;
/*
 �dev
Yar��ap� r , merkez �l�e�inin �l��s� 
a olan dairenin alan� bulan program�.

pi = 3.14 al�n�z.
Form�l : (�i * (r*r) * a) / 360
 */
public class DaireninAlan�n�VeCevresiniHesaplayanProgram {

	public static void main(String[] args) {
		
		double pi = 3.14, form�l;
		int r,a;
		Scanner x = new Scanner(System.in);
		System.out.println("Yar� �ap� giriniz (r) :");
		r = x.nextInt();
		System.out.println("Merkez �l�e�inin �l��s�ni Giriniz (a) :");
		a = x.nextInt();
		form�l = (pi*(r*r)*a)/360;
		System.out.println("Dairenin Alan� :"+ form�l);
	}

}
