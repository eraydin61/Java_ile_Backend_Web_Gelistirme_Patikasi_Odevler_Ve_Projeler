import java.util.Scanner;
/*
 Java ile kullan�c�dan al�nan para de�erinin KDV'li fiyat�n� 
 ve KDV tutar�n� hesaplay�p ekrana bast�ran program� yaz�n.

(Not : KDV tutar�n� 18% olarak al�n)

�dev
E�er girilen tutar 0 ve 1000 TL aras�nda ise KDV oran� %18 , tutar 1000 TL'den
b�y�k ise KDV oran�n� %8 olarak KDV tutar� hesaplayan program� yaz�n�z.

 */

public class kdvTutar�HesaplayanProgram {

	public static void main(String[] args) {
		double kdvliFiyat = 0, kdvTutar�2 = 0;
		Scanner deger = new Scanner(System.in);
		System.out.println("Para Birimi Giriniz (TL) :");
		double para = deger.nextInt();
		if (para >= 0 && para <= 1000 ) {
			double kdvtutar� = 0.18;
			kdvliFiyat = para + (para*kdvtutar�);
			kdvTutar�2 = kdvliFiyat - para;
		}
		else if (para > 1000) {
			double kdvtutar� = 0.08;
			kdvliFiyat = para + (para*kdvtutar�);
			kdvTutar�2 = kdvliFiyat - para;
		}
		System.out.println("KDV'siz Fiyat (TL) :"+ para);
		System.out.println("KDV'li Fiyat (TL) :"+ kdvliFiyat);
		System.out.println("KDV Tutar� :"+ kdvTutar�2);
	}
}
