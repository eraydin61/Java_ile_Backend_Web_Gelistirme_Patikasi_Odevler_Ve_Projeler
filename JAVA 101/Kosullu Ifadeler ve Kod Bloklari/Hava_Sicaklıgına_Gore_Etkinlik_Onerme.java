package Kosullar;
import java.util.Scanner;
public class Hava_Sicaklýgýna_Gore_Etkinlik_Onerme {
/*
Java koþullu ifadeler ile hava sýcaklýðýna göre etkinlik öneren program yapýmý.
Koþullar :
Sýcaklýk 5'dan küçük ise "Kayak" yapmayý öner.
Sýcaklýk 5 ve 15 arasýnda ise "Sinema" etkinliðini öner.
Sýcaklýk 15 ve 25 arasýnda ise "Piknik" etkinliðini öner.
Sýcaklýk 25'ten büyük ise "Yüzme" etkinliðini öner.*/
	public static void main(String[] args) {
		
		float sicaklik;
		Scanner input = new Scanner(System.in);
		System.out.print("Havanýn Sýcaklýðýný giriniz : ");
		sicaklik = input.nextFloat();
		
		if(sicaklik < 5) {
			System.out.print("Hava "+ sicaklik +" Derece. Kayak Yapabilirsiniz.");
		}else if(sicaklik >= 5 && sicaklik <15){
			System.out.print("Hava "+ sicaklik +" Derece. Sinemaya Gidebilirsiniz.");
		}else if(sicaklik >=15 && sicaklik <25) {
			System.out.print("Hava "+ sicaklik +" Derece. Piknik Yapabilirsiniz.");
		}else if(sicaklik >= 25) {
			System.out.print("Hava "+ sicaklik +" Derece. Yüzmek iyi gelebilir");
		}
	}
}
