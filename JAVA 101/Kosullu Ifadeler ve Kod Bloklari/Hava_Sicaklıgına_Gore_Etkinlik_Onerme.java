package Kosullar;
import java.util.Scanner;
public class Hava_Sicakl�g�na_Gore_Etkinlik_Onerme {
/*
Java ko�ullu ifadeler ile hava s�cakl���na g�re etkinlik �neren program yap�m�.
Ko�ullar :
S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner.
S�cakl�k 5 ve 15 aras�nda ise "Sinema" etkinli�ini �ner.
S�cakl�k 15 ve 25 aras�nda ise "Piknik" etkinli�ini �ner.
S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.*/
	public static void main(String[] args) {
		
		float sicaklik;
		Scanner input = new Scanner(System.in);
		System.out.print("Havan�n S�cakl���n� giriniz : ");
		sicaklik = input.nextFloat();
		
		if(sicaklik < 5) {
			System.out.print("Hava "+ sicaklik +" Derece. Kayak Yapabilirsiniz.");
		}else if(sicaklik >= 5 && sicaklik <15){
			System.out.print("Hava "+ sicaklik +" Derece. Sinemaya Gidebilirsiniz.");
		}else if(sicaklik >=15 && sicaklik <25) {
			System.out.print("Hava "+ sicaklik +" Derece. Piknik Yapabilirsiniz.");
		}else if(sicaklik >= 25) {
			System.out.print("Hava "+ sicaklik +" Derece. Y�zmek iyi gelebilir");
		}
	}
}
