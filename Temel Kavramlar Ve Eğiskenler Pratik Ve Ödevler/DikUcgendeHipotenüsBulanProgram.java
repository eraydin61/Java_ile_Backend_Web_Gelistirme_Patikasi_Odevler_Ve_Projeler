package odev;
import java.util.Scanner;
/*
 �dev
�� kenar uzunlu�unu kullan�c�dan ald���n�z ��genin 
alan�n� hesaplayan program� yaz�n�z.
u = (a+b+c) / 2
Alan  = u * (u - a)* (u - b) * (u - c)
 */
public class DikUcgendeHipoten�sBulanProgram {

	public static void main(String[] args) {
		double u1,u2,u3,alan,u;
		Scanner x = new Scanner(System.in);
		System.out.println("��genin 1. Uzunlu�unu Girimiz :");
		u1 = x.nextDouble();
		System.out.println("��genin 2. Uzunlu�unu Girimiz :");
		u2 = x.nextDouble();
		System.out.println("��genin 3. Uzunlu�unu Girimiz :");
		u3 = x.nextDouble();
		u = (u1+u2+u3)/2;
		alan = u*(u-u1)*(u-u2)*(u-u3);
		System.out.println("��genin Alan� :"+ alan);

	}

}
