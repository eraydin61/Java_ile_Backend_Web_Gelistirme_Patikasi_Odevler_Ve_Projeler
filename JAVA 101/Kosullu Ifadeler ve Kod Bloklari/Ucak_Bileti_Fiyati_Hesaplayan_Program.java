package Kosullar;
import java.util.Scanner;
public class Ucak_Bileti_Fiyati_Hesaplayan_Program {
/*
 Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
 Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) 
 bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
 uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
 aşağıdaki indirimleri uygulayın ;
 Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
 olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
  Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
  Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
  Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
  Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
	public static void main(String[] args) {
		
		double mesafe, yas,yolculukTipi,yasİndirimi = 0,indirimliTutar=0,normalTutar,gdİndirimi = 0,gercekTutar = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Gidilecek KM Mesafesini Giriniz : ");
		mesafe = input.nextFloat();
		System.out.print("Yaşınızı Giriniz : ");
		yas = input.nextFloat();
		System.out.print("Tek Yön için = 1 / Çift Yön için = 2 Giriniz : ");
		yolculukTipi = input.nextFloat();
		normalTutar= mesafe * 0.10;
		
		if ((mesafe > 0 && yas >0) && (yolculukTipi == 1 || yolculukTipi == 2) ) {
				if (yas<12) {
					yasİndirimi = normalTutar*0.5;
				}else if(yas>=12 && yas<=24) {
					yasİndirimi = normalTutar*0.1;
				}else if(yas>65) {
					yasİndirimi = normalTutar*0.3;
				}
				indirimliTutar = normalTutar - yasİndirimi;
				if (yolculukTipi==2) {
					gdİndirimi = indirimliTutar*0.2;
				}
				gercekTutar = (indirimliTutar-gdİndirimi)*yolculukTipi;
		
				System.out.println("İlk Tutar = "+ normalTutar );
				System.out.println("Yaş İndirimi = "+ yasİndirimi );
				System.out.println("Gidiş Dönüş Bilet İndirimi = "+ gdİndirimi );
				System.out.println("Toplam Tutar = "+ gercekTutar);
		}else {
			System.out.print("Hatalı Veri Girdiniz.!");	
		}	
	}
}
