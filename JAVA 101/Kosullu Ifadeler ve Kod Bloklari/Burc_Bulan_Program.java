package Kosullar;
import java.util.Scanner;
public class Burc_Bulan_Program {
/* Kullan�c�n�n G�n ve ay�na g�re Burcu hesaplama program� */
	public static void main(String[] args) {
		
		int g�n,ay;
		Scanner input = new Scanner(System.in);
		System.out.print("Do�du�unuz Ay : ");
		ay = input.nextInt();
		System.out.print("Do�du�unuz G�n : ");
		g�n = input.nextInt();
		
		if (ay>=1 && ay<=12) {
			switch(ay) {
			case 1:
				if (g�n>=1 && g�n <=31) {
					if (g�n < 22) {
						System.out.print("Burcunuz O�lak.");
					}else
						System.out.print("Burcunuz Kova.");
				}
				break;
			case 2:
				if (g�n>=1 && g�n <=28) {
					if (g�n < 20) {
						System.out.print("Burcunuz Kova.");
					}else
						System.out.print("Burcunuz Bal�k.");
				}
				break;	
			case 3:
				if (g�n>=1 && g�n <=31) {
					if (g�n < 21) {
						System.out.print("Burcunuz Bal�k.");
					}else
						System.out.print("Burcunuz Ko�.");
				}
				break;
			case 4:
				if (g�n>=1 && g�n <=30) {
					if (g�n < 21) {
						System.out.print("Burcunuz Ko�.");
					}else
						System.out.print("Burcunuz Bo�a.");
				}
				break;
			case 5:
				if (g�n>=1 && g�n <=30) {
					if (g�n < 22) {
						System.out.print("Burcunuz Bo�a.");
					}else
						System.out.print("Burcunuz �kizler.");
				}
				break;
			case 6:
				if (g�n>=1 && g�n <=30) {
					if (g�n < 23) {
						System.out.print("Burcunuz �kizler.");
					}else
						System.out.print("Burcunuz Yenge�.");
				}
				break;
			case 7:
				if (g�n>=1 && g�n <=31) {
					if (g�n < 23) {
						System.out.print("Burcunuz Yenge�.");
					}else
						System.out.print("Burcunuz Aslan");
				}
				break;
			case 8:
				if (g�n>=1 && g�n <=31) {
					if (g�n < 23) {
						System.out.print("Burcunuz Aslan.");
					}else
						System.out.print("Burcunuz Ba�ak.");
				}
				break;
			case 9:
				if (g�n>=1 && g�n <=30) {
					if (g�n < 23) {
						System.out.print("Burcunuz Ba�ak.");
					}else
						System.out.print("Burcunuz Terazi.");
				}
				break;
			case 10:
				if (g�n>=1 && g�n <=31) {
					if (g�n < 23) {
						System.out.print("Burcunuz Terazi.");
					}else
						System.out.print("Burcunuz Akrep.");
				}
				break;
			case 11:
				if (g�n>=1 && g�n <=30) {
					if (g�n < 22) {
						System.out.print("Burcunuz Akrep.");
					}else
						System.out.print("Burcunuz Yay.");
				}
				break;
			case 12:
				if (g�n>=1 && g�n <=31) {
					if (g�n < 22) {
						System.out.print("Burcunuz Yay.");
					}else
						System.out.print("Burcunuz O�lak.");
				}
				break;
			}
		}else {
			System.out.print("Ge�ersiz Bir Ay Girdiniz.");
		}

	}

}
