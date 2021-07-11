package odev;
import java.util.Scanner;
/*
 Ödev
Yarýçapý r , merkez ölçeðinin ölçüsü 
a olan dairenin alaný bulan programý.

pi = 3.14 alýnýz.
Formül : (ði * (r*r) * a) / 360
 */
public class DaireninAlanýnýVeCevresiniHesaplayanProgram {

	public static void main(String[] args) {
		
		double pi = 3.14, formül;
		int r,a;
		Scanner x = new Scanner(System.in);
		System.out.println("Yarý çapý giriniz (r) :");
		r = x.nextInt();
		System.out.println("Merkez Ölçeðinin Ölçüsüni Giriniz (a) :");
		a = x.nextInt();
		formül = (pi*(r*r)*a)/360;
		System.out.println("Dairenin Alaný :"+ formül);
	}

}
