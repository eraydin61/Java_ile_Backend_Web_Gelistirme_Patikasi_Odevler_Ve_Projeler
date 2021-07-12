package Kosullar;
import java.util.Scanner;
public class Cin_Zodyagi_Hesaplayan_Program {
/*
4000 bin yýldýr kullanýlan bir astroloji çeþididir Çin astrolojisi 
ve insanlarý 12 deðiþik burç ve sembollerle tanýmlar. Çin Zodyaðý
bu 12 burcun eþit aralýklarla(10 derece geniþliðinde) sýralandýðý
bir hayvan halkasýdýr ve yýldýzlarla pek bir ilgisi yoktur.
Çin zodyaðý hesaplanýrken kiþinin doðum yýlýnýn 12 ile bölümünde kalana göre bulunur.*/
	public static void main(String[] args) {
		
		int dogumTarihi, kalan;
		Scanner input = new Scanner(System.in);
		System.out.print("Doðum yýlýnýzý Giriniz = ");
		dogumTarihi = input.nextInt();
		kalan = dogumTarihi % 12;
		
		switch (kalan) {
		case 0:
			System.out.print("Çin Zodyaði Burcunuz = Maymun ");
			break;
		case 1:
			System.out.print("Çin Zodyaði Burcunuz = Horoz ");
			break;
		case 2:
			System.out.print("Çin Zodyaði Burcunuz = Köpek ");
			break;
		case 3:
			System.out.print("Çin Zodyaði Burcunuz = Domuz ");
			break;
		case 4:
			System.out.print("Çin Zodyaði Burcunuz = Fare ");
			break;
		case 5:
			System.out.print("Çin Zodyaði Burcunuz = Öküz ");
			break;
		case 6:
			System.out.print("Çin Zodyaði Burcunuz = Kaplan ");
			break;
		case 7:
			System.out.print("Çin Zodyaði Burcunuz = Tavþan ");
			break;
		case 8: 
			System.out.print("Çin Zodyaði Burcunuz = Ejderha ");
			break;
		case 9:
			System.out.print("Çin Zodyaði Burcunuz = Yýlan ");
			break;
		case 10:
			System.out.print("Çin Zodyaði Burcunuz = At ");
			break;
		case 11:
			System.out.print("Çin Zodyaði Burcunuz = Koyun ");
			break;	
		}
	}
}
