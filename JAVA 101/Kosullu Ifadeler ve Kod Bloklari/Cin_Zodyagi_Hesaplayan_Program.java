package Kosullar;
import java.util.Scanner;
public class Cin_Zodyagi_Hesaplayan_Program {
/*
4000 bin y�ld�r kullan�lan bir astroloji �e�ididir �in astrolojisi 
ve insanlar� 12 de�i�ik bur� ve sembollerle tan�mlar. �in Zodya��
bu 12 burcun e�it aral�klarla(10 derece geni�li�inde) s�raland���
bir hayvan halkas�d�r ve y�ld�zlarla pek bir ilgisi yoktur.
�in zodya�� hesaplan�rken ki�inin do�um y�l�n�n 12 ile b�l�m�nde kalana g�re bulunur.*/
	public static void main(String[] args) {
		
		int dogumTarihi, kalan;
		Scanner input = new Scanner(System.in);
		System.out.print("Do�um y�l�n�z� Giriniz = ");
		dogumTarihi = input.nextInt();
		kalan = dogumTarihi % 12;
		
		switch (kalan) {
		case 0:
			System.out.print("�in Zodya�i Burcunuz = Maymun ");
			break;
		case 1:
			System.out.print("�in Zodya�i Burcunuz = Horoz ");
			break;
		case 2:
			System.out.print("�in Zodya�i Burcunuz = K�pek ");
			break;
		case 3:
			System.out.print("�in Zodya�i Burcunuz = Domuz ");
			break;
		case 4:
			System.out.print("�in Zodya�i Burcunuz = Fare ");
			break;
		case 5:
			System.out.print("�in Zodya�i Burcunuz = �k�z ");
			break;
		case 6:
			System.out.print("�in Zodya�i Burcunuz = Kaplan ");
			break;
		case 7:
			System.out.print("�in Zodya�i Burcunuz = Tav�an ");
			break;
		case 8: 
			System.out.print("�in Zodya�i Burcunuz = Ejderha ");
			break;
		case 9:
			System.out.print("�in Zodya�i Burcunuz = Y�lan ");
			break;
		case 10:
			System.out.print("�in Zodya�i Burcunuz = At ");
			break;
		case 11:
			System.out.print("�in Zodya�i Burcunuz = Koyun ");
			break;	
		}
	}
}
