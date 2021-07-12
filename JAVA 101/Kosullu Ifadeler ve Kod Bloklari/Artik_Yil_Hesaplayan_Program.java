package Kosullar;
import java.util.Scanner;
public class Artik_Yil_Hesaplayan_Program {

	public static void main(String[] args) {
		
		int yil;
		boolean artik = false;
		Scanner input = new Scanner(System.in);
		System.out.print("Yýl Giriniz : ");
		yil = input.nextInt();

		if(yil%4==0) {
			if(yil%100 ==0) {
				if(yil%400 ==0) {
					artik = true;
				}
				else {
					artik = false;
				}
			}else {
				artik = false;
			}
		}else {
			artik = false;
		}
		
		if (artik) {
			System.out.print(yil+" Yýlý Artýktýr.");
		}else {
			System.out.print(yil+" Yýlý Artýk Deðildir.");
		}
	
		
		
	}

}
