package Kosullar;
import java.util.Scanner;
public class Kullanici_Girisi {
	/*E�er �ifre yanl�� ise kullan�c�ya �ifresini s�f�rlay�p s�f�rlamayaca��n� 
	 * sorun, e�er kullan�c� s�f�rlamak isterse yeni girdi�i �ifrenin hatal� girdi�i
	ve unuttu�u �ifre ile ayn� olmamas� gerekti�ini kontrol edip , 
	�ifreler ayn� ise ekrana "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz." sorun yoksa "�ifre
	olu�turuldu" yazan program� yaz�n�z.*/
	public static void main(String[] args) {
		
		String kullaniciAdi = "kullanici" , Sifre= "123" ,x1,x2,deger,yeniSifre,yedek;
		Scanner input = new Scanner(System.in);
		System.out.print("Kullan�c� Ad�n�z� Giriniz :");
		x1 = input.nextLine();
		System.out.print("�ifrenizi Giriniz :");
		x2 = input.nextLine();
		
		if (x1.equals(kullaniciAdi) && x2.equals(Sifre)) {
			System.out.println("Ba�ar�yla Giri� Yapt�n�z.");
			
		}else {
			System.out.println("Bilgileriniz Yanl��.");
			System.out.println("�ifre De�i�tirmek �stermisiniz ? (E veya H)");
			deger = input.nextLine();
			if (deger.equals("E") || deger.equals("e")) {
				System.out.print("Yeni �ifrenizi Giriniz :");
				yeniSifre = input.nextLine();
				if (yeniSifre.equals(Sifre)) {
					System.out.println("�ifreniz Eski �ifre �le Ayn� Ba�ka �ifre Giriniz.");
				}else {
					yedek=Sifre;
					Sifre=yeniSifre;
					System.out.println("�ifreniz Ba�ar�yla De�i�tirildi.");
					System.out.println("Eski �ifreniz : "+ yedek);
					System.out.println("Yeni �ifreniz : "+ yeniSifre);
				}
			}else if (deger.equals("H") || deger.equals("h")) {
				System.out.print("�ifrenizi De�i�tirmek �stemediniz. ��k�ld�.");
			}else {
				System.out.print("Farkl� Harf Girdiniz ��lem Yap�lamad�.");
			}	
		}
	}
}
