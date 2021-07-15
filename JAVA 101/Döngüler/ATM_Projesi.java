package Donguler;
import java.util.Scanner;
public class ATM_Projesi {

	public static void main(String[] args) {
		
		String kullaniciAdi, sifre;
		int hak=3, para=1500,secim = 0;
		Scanner input = new Scanner(System.in);
		
		while (hak > 0) {
			System.out.print("Kullanýcý Adýnýzý Giriniz : ");
			kullaniciAdi = input.nextLine();
			System.out.print("Sifrenizi Giriniz :");
			sifre = input.nextLine();
			
			if (kullaniciAdi.equals("admin")&& sifre.equals("123")) {
				 System.out.println("Merhaba, Bankamýza Hoþgeldiniz!");
				 while (secim != 4) {
					 System.out.println("1-Para yatýrma\n" +
	                            "2-Para Çekme\n" +
	                            "3-Bakiye Sorgula\n" +
	                            "4-Çýkýþ Yap");
					 System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
	                 secim = input.nextInt();
	                 switch (secim) {
	                 case 1:
	                	 System.out.print("Yatýrmak Ýstediðin Para miktarý : ");
	                	 int yatýrmaPara = input.nextInt();
	                	 para = para + yatýrmaPara;
	                	 break;
	                 case 2: 
	                	 System.out.print("Çekmek Ýstediðin Para miktarý : ");
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
				 System.out.print("Tekrar görüþmek üzere.");
	             break;
			}else {
				hak--;
				System.out.println("Hatalý Girdiniz.");
				if (hak == 0 ) {
					System.out.println("Hesabýnýz Bloke Olmuþtur.");
				}else {
					System.out.println("Kalan Hakkýnýz = "+hak);
				}
			}
		}
	}
}
