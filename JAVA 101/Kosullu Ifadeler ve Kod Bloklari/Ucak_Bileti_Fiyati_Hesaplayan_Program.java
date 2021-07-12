package Kosullar;
import java.util.Scanner;
public class Ucak_Bileti_Fiyati_Hesaplayan_Program {
/*
 Java ile mesafeye ve �artlara g�re u�ak bileti fiyat� hesaplayan program� yap�n.
 Kullan�c�dan Mesafe (KM), ya�� ve yolculuk tipi (Tek Y�n, Gidi�-D�n��) 
 bilgilerini al�n. Mesafe ba��na �cret 0,10 TL / km olarak al�n. �lk olarak
 u�u�un toplam fiyat�n� hesaplay�n ve sonras�nda ki ko�ullara g�re m��teriye
 a�a��daki indirimleri uygulay�n ;
 Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�, yolculuk tipi ise 1 veya 2)
 olmal�d�r. Aksi takdirde kullan�c�ya "Hatal� Veri Girdiniz !" �eklinde bir uyar� verilmelidir.
  Ki�i 12 ya��ndan k���kse bilet fiyat� �zerinden %50 indirim uygulan�r.
  Ki�i 12-24 ya�lar� aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r.
  Ki�i 65 ya��ndan b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r.
  Ki�i "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20 indirim uygulan�r.*/
	public static void main(String[] args) {
		
		double mesafe, yas,yolculukTipi,yas�ndirimi = 0,indirimliTutar=0,normalTutar,gd�ndirimi = 0,gercekTutar = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Gidilecek KM Mesafesini Giriniz : ");
		mesafe = input.nextFloat();
		System.out.print("Ya��n�z� Giriniz : ");
		yas = input.nextFloat();
		System.out.print("Tek Y�n i�in = 1 / �ift Y�n i�in = 2 Giriniz : ");
		yolculukTipi = input.nextFloat();
		normalTutar= mesafe * 0.10;
		
		if ((mesafe > 0 && yas >0) && (yolculukTipi == 1 || yolculukTipi == 2) ) {
				if (yas<12) {
					yas�ndirimi = normalTutar*0.5;
				}else if(yas>=12 && yas<=24) {
					yas�ndirimi = normalTutar*0.1;
				}else if(yas>65) {
					yas�ndirimi = normalTutar*0.3;
				}
				indirimliTutar = normalTutar - yas�ndirimi;
				if (yolculukTipi==2) {
					gd�ndirimi = indirimliTutar*0.2;
				}
				gercekTutar = (indirimliTutar-gd�ndirimi)*yolculukTipi;
		
				System.out.println("�lk Tutar = "+ normalTutar );
				System.out.println("Ya� �ndirimi = "+ yas�ndirimi );
				System.out.println("Gidi� D�n�� Bilet �ndirimi = "+ gd�ndirimi );
				System.out.println("Toplam Tutar = "+ gercekTutar);
		}else {
			System.out.print("Hatal� Veri Girdiniz.!");	
		}	
	}
}
