package Kosullar;
import java.util.Scanner;
public class Kullanici_Girisi {
	/*Eðer þifre yanlýþ ise kullanýcýya þifresini sýfýrlayýp sýfýrlamayacaðýný 
	 * sorun, eðer kullanýcý sýfýrlamak isterse yeni girdiði þifrenin hatalý girdiði
	ve unuttuðu þifre ile ayný olmamasý gerektiðini kontrol edip , 
	þifreler ayný ise ekrana "Þifre oluþturulamadý, lütfen baþka þifre giriniz." sorun yoksa "Þifre
	oluþturuldu" yazan programý yazýnýz.*/
	public static void main(String[] args) {
		
		String kullaniciAdi = "kullanici" , Sifre= "123" ,x1,x2,deger,yeniSifre,yedek;
		Scanner input = new Scanner(System.in);
		System.out.print("Kullanýcý Adýnýzý Giriniz :");
		x1 = input.nextLine();
		System.out.print("Þifrenizi Giriniz :");
		x2 = input.nextLine();
		
		if (x1.equals(kullaniciAdi) && x2.equals(Sifre)) {
			System.out.println("Baþarýyla Giriþ Yaptýnýz.");
			
		}else {
			System.out.println("Bilgileriniz Yanlýþ.");
			System.out.println("Þifre Deðiþtirmek Ýstermisiniz ? (E veya H)");
			deger = input.nextLine();
			if (deger.equals("E") || deger.equals("e")) {
				System.out.print("Yeni Þifrenizi Giriniz :");
				yeniSifre = input.nextLine();
				if (yeniSifre.equals(Sifre)) {
					System.out.println("Þifreniz Eski Þifre Ýle Ayný Baþka Þifre Giriniz.");
				}else {
					yedek=Sifre;
					Sifre=yeniSifre;
					System.out.println("Þifreniz Baþarýyla Deðiþtirildi.");
					System.out.println("Eski Þifreniz : "+ yedek);
					System.out.println("Yeni Þifreniz : "+ yeniSifre);
				}
			}else if (deger.equals("H") || deger.equals("h")) {
				System.out.print("Þifrenizi Deðiþtirmek Ýstemediniz. Çýkýldý.");
			}else {
				System.out.print("Farklý Harf Girdiniz Ýþlem Yapýlamadý.");
			}	
		}
	}
}
