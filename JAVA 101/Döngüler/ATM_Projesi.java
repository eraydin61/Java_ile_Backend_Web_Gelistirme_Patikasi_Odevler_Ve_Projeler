package Donguler;
import java.util.Scanner;
public class ATM_Projesi {

	public static void main(String[] args) {
		
		String kullaniciAdi, sifre;
		int hak=3, para=1500,secim = 0;
		Scanner input = new Scanner(System.in);
		
		while (hak > 0) {
			System.out.print("Kullan�c� Ad�n�z� Giriniz : ");
			kullaniciAdi = input.nextLine();
			System.out.print("Sifrenizi Giriniz :");
			sifre = input.nextLine();
			
			if (kullaniciAdi.equals("admin")&& sifre.equals("123")) {
				 System.out.println("Merhaba, Bankam�za Ho�geldiniz!");
				 while (secim != 4) {
					 System.out.println("1-Para yat�rma\n" +
	                            "2-Para �ekme\n" +
	                            "3-Bakiye Sorgula\n" +
	                            "4-��k�� Yap");
					 System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
	                 secim = input.nextInt();
	                 switch (secim) {
	                 case 1:
	                	 System.out.print("Yat�rmak �stedi�in Para miktar� : ");
	                	 int yat�rmaPara = input.nextInt();
	                	 para = para + yat�rmaPara;
	                	 break;
	                 case 2: 
	                	 System.out.print("�ekmek �stedi�in Para miktar� : ");
	                	 int cekilenPara = input.nextInt();
	                	 if (cekilenPara > para) {
	                		 System.out.println("Bakiye Yetersiz");
	                	 }else {
	                		 para = para - cekilenPara;
	                	 }
	                	 break;
	                 case 3:
	                	 System.out.println("Bakiyeniz : " + para);
	                	 break;
	                 }	  
				 }
				 System.out.print("Tekrar g�r��mek �zere.");
	             break;
			}else {
				hak--;
				System.out.println("Hatal� Girdiniz.");
				if (hak == 0 ) {
					System.out.println("Hesab�n�z Bloke Olmu�tur.");
				}else {
					System.out.println("Kalan Hakk�n�z = "+hak);
				}
			}
		}
	}
}
