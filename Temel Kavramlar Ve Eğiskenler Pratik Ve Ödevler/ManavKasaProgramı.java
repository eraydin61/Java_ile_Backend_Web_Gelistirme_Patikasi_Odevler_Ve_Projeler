package odev;
import java.util.Scanner;
/*
 Java ile kullan�c�lar�n manavdan alm�� olduklar�
  �r�nlerin kilogram de�erlerine g�re toplam tutar�n� 
  ekrana yazd�ran program� yaz�n.
  Meyveler ve KG Fiyatlar�
	Armut : 2,14 TL
	Elma : 3,67 TL
	Domates : 1,11 TL
	Muz: 0,95 TL
	Patl�can : 5,00 TL
 */
public class ManavKasaProgram� {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int m1,m2,m3,m4,m5;
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patl�can=5.00,toplam;
		System.out.print("Armut Ka� Kilo :");
		m1=x.nextInt();
		System.out.print("Elma Ka� Kilo :");
		m2=x.nextInt();
		System.out.print("Domates Ka� Kilo :");
		m3= x.nextInt();
		System.out.print("Muz Ka� Kilo :");
		m4=x.nextInt();
		System.out.print("Patl�can Ka� Kilo :");
		m5=x.nextInt();
		toplam=(armut*m1)+(elma*m2)+(domates*m3)+(muz*m4)+(patl�can*m5);
		System.out.println("toplam Tutar"+ toplam+ " TL");
	
	}
}
