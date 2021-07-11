import java.util.Scanner;
/*
 Java ile kullanýcýdan alýnan para deðerinin KDV'li fiyatýný 
 ve KDV tutarýný hesaplayýp ekrana bastýran programý yazýn.

(Not : KDV tutarýný 18% olarak alýn)

Ödev
Eðer girilen tutar 0 ve 1000 TL arasýnda ise KDV oraný %18 , tutar 1000 TL'den
büyük ise KDV oranýný %8 olarak KDV tutarý hesaplayan programý yazýnýz.

 */

public class kdvTutarýHesaplayanProgram {

	public static void main(String[] args) {
		double kdvliFiyat = 0, kdvTutarý2 = 0;
		Scanner deger = new Scanner(System.in);
		System.out.println("Para Birimi Giriniz (TL) :");
		double para = deger.nextInt();
		if (para >= 0 && para <= 1000 ) {
			double kdvtutarý = 0.18;
			kdvliFiyat = para + (para*kdvtutarý);
			kdvTutarý2 = kdvliFiyat - para;
		}
		else if (para > 1000) {
			double kdvtutarý = 0.08;
			kdvliFiyat = para + (para*kdvtutarý);
			kdvTutarý2 = kdvliFiyat - para;
		}
		System.out.println("KDV'siz Fiyat (TL) :"+ para);
		System.out.println("KDV'li Fiyat (TL) :"+ kdvliFiyat);
		System.out.println("KDV Tutarý :"+ kdvTutarý2);
	}
}
