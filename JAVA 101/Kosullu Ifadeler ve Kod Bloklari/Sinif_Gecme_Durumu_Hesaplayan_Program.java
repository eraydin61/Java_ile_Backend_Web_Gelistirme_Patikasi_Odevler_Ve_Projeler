package Kosullar;
import java.util.Scanner;
public class Sinif_Gecme_Durumu_Hesaplayan_Program {
	/*
	Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
	Geçme Notu : 55*/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mat,fiz,turk,kim,muz;
		float ortalama;
		System.out.print("Matematik Notunuzu Giriniz : ");
		mat = input.nextInt();
		System.out.print("Fizik Notunuzu Giriniz : ");
		fiz = input.nextInt();
		System.out.print("Türkçe Notunuzu Giriniz : ");
		turk = input.nextInt();
		System.out.print("Kimya Notunuzu Giriniz : ");
		kim = input.nextInt();
		System.out.print("Müzik Notunuzu Giriniz : ");
		muz = input.nextInt();
		ortalama = (mat+fiz+turk+kim+muz)/5;
		
		if(ortalama >= 55) {
			System.out.println("Sýnýfý Geçtiniz.");
		}else {
			System.out.println("Sýnýfý Geçemediniz.");
		}
		System.out.print("Ortalamanýz = "+ortalama);	
	}
}
