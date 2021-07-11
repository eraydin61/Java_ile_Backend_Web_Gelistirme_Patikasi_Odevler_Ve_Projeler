package odev;
import java.util.Scanner;
/*
 Ödev
Üç kenar uzunluðunu kullanýcýdan aldýðýnýz üçgenin 
alanýný hesaplayan programý yazýnýz.
u = (a+b+c) / 2
Alan  = u * (u - a)* (u - b) * (u - c)
 */
public class DikUcgendeHipotenüsBulanProgram {

	public static void main(String[] args) {
		double u1,u2,u3,alan,u;
		Scanner x = new Scanner(System.in);
		System.out.println("Üçgenin 1. Uzunluðunu Girimiz :");
		u1 = x.nextDouble();
		System.out.println("Üçgenin 2. Uzunluðunu Girimiz :");
		u2 = x.nextDouble();
		System.out.println("Üçgenin 3. Uzunluðunu Girimiz :");
		u3 = x.nextDouble();
		u = (u1+u2+u3)/2;
		alan = u*(u-u1)*(u-u2)*(u-u3);
		System.out.println("Üçgenin Alaný :"+ alan);

	}

}
