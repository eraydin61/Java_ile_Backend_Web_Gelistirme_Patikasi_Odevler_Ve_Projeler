package odev;
import java.util.Scanner;
/*
 Java ile kullanýcýlarýn manavdan almýþ olduklarý
  ürünlerin kilogram deðerlerine göre toplam tutarýný 
  ekrana yazdýran programý yazýn.
  Meyveler ve KG Fiyatlarý
	Armut : 2,14 TL
	Elma : 3,67 TL
	Domates : 1,11 TL
	Muz: 0,95 TL
	Patlýcan : 5,00 TL
 */
public class ManavKasaProgramý {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int m1,m2,m3,m4,m5;
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlýcan=5.00,toplam;
		System.out.print("Armut Kaç Kilo :");
		m1=x.nextInt();
		System.out.print("Elma Kaç Kilo :");
		m2=x.nextInt();
		System.out.print("Domates Kaç Kilo :");
		m3= x.nextInt();
		System.out.print("Muz Kaç Kilo :");
		m4=x.nextInt();
		System.out.print("Patlýcan Kaç Kilo :");
		m5=x.nextInt();
		toplam=(armut*m1)+(elma*m2)+(domates*m3)+(muz*m4)+(patlýcan*m5);
		System.out.println("toplam Tutar"+ toplam+ " TL");
	
	}
}
