package Kosullar;
import java.util.Scanner;
public class Burc_Bulan_Program {
/* Kullanýcýnýn Gün ve ayýna göre Burcu hesaplama programý */
	public static void main(String[] args) {
		
		int gün,ay;
		Scanner input = new Scanner(System.in);
		System.out.print("Doðduðunuz Ay : ");
		ay = input.nextInt();
		System.out.print("Doðduðunuz Gün : ");
		gün = input.nextInt();
		
		if (ay>=1 && ay<=12) {
			switch(ay) {
			case 1:
				if (gün>=1 && gün <=31) {
					if (gün < 22) {
						System.out.print("Burcunuz Oðlak.");
					}else
						System.out.print("Burcunuz Kova.");
				}
				break;
			case 2:
				if (gün>=1 && gün <=28) {
					if (gün < 20) {
						System.out.print("Burcunuz Kova.");
					}else
						System.out.print("Burcunuz Balýk.");
				}
				break;	
			case 3:
				if (gün>=1 && gün <=31) {
					if (gün < 21) {
						System.out.print("Burcunuz Balýk.");
					}else
						System.out.print("Burcunuz Koç.");
				}
				break;
			case 4:
				if (gün>=1 && gün <=30) {
					if (gün < 21) {
						System.out.print("Burcunuz Koç.");
					}else
						System.out.print("Burcunuz Boða.");
				}
				break;
			case 5:
				if (gün>=1 && gün <=30) {
					if (gün < 22) {
						System.out.print("Burcunuz Boða.");
					}else
						System.out.print("Burcunuz Ýkizler.");
				}
				break;
			case 6:
				if (gün>=1 && gün <=30) {
					if (gün < 23) {
						System.out.print("Burcunuz Ýkizler.");
					}else
						System.out.print("Burcunuz Yengeç.");
				}
				break;
			case 7:
				if (gün>=1 && gün <=31) {
					if (gün < 23) {
						System.out.print("Burcunuz Yengeç.");
					}else
						System.out.print("Burcunuz Aslan");
				}
				break;
			case 8:
				if (gün>=1 && gün <=31) {
					if (gün < 23) {
						System.out.print("Burcunuz Aslan.");
					}else
						System.out.print("Burcunuz Baþak.");
				}
				break;
			case 9:
				if (gün>=1 && gün <=30) {
					if (gün < 23) {
						System.out.print("Burcunuz Baþak.");
					}else
						System.out.print("Burcunuz Terazi.");
				}
				break;
			case 10:
				if (gün>=1 && gün <=31) {
					if (gün < 23) {
						System.out.print("Burcunuz Terazi.");
					}else
						System.out.print("Burcunuz Akrep.");
				}
				break;
			case 11:
				if (gün>=1 && gün <=30) {
					if (gün < 22) {
						System.out.print("Burcunuz Akrep.");
					}else
						System.out.print("Burcunuz Yay.");
				}
				break;
			case 12:
				if (gün>=1 && gün <=31) {
					if (gün < 22) {
						System.out.print("Burcunuz Yay.");
					}else
						System.out.print("Burcunuz Oðlak.");
				}
				break;
			}
		}else {
			System.out.print("Geçersiz Bir Ay Girdiniz.");
		}

	}

}
