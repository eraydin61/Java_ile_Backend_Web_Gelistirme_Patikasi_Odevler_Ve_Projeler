package Kosullar;
import java.util.Scanner;
public class Sinif_Gecme_Durumu_Hesaplayan_Program {
	/*
	Dersler : Matematik, Fizik, T�rk�e, Kimya, M�zik
	Ge�me Notu : 55*/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mat,fiz,turk,kim,muz;
		float ortalama;
		System.out.print("Matematik Notunuzu Giriniz : ");
		mat = input.nextInt();
		System.out.print("Fizik Notunuzu Giriniz : ");
		fiz = input.nextInt();
		System.out.print("T�rk�e Notunuzu Giriniz : ");
		turk = input.nextInt();
		System.out.print("Kimya Notunuzu Giriniz : ");
		kim = input.nextInt();
		System.out.print("M�zik Notunuzu Giriniz : ");
		muz = input.nextInt();
		ortalama = (mat+fiz+turk+kim+muz)/5;
		
		if(ortalama >= 55) {
			System.out.println("S�n�f� Ge�tiniz.");
		}else {
			System.out.println("S�n�f� Ge�emediniz.");
		}
		System.out.print("Ortalaman�z = "+ortalama);	
	}
}
