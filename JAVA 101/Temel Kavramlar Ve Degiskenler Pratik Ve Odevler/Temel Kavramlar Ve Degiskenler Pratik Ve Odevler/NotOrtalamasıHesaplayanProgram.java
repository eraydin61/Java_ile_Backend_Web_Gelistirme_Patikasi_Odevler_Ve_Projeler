import java.util.Scanner;

public class NotOrtalamas�HesaplayanProgram {

	public static void main(String[] args) {
		
		Scanner deger = new Scanner(System.in);
		
		System.out.println("Matematik Notunuzu Giriniz :");
		int matNot = deger.nextInt();
		
		System.out.println("Kimya Notunuzu Giriniz :");
		int kimyaNot = deger.nextInt();
		
		System.out.println("T�rk�e Notunuzu Giriniz :");
		int turkceNot = deger.nextInt();
		
		System.out.println("Tarih Notunuzu Giriniz :");
		int tarihNot = deger.nextInt();
		
		System.out.println("M�zik Notunuzu Giriniz :");
		int muzikNot = deger.nextInt();
		
		float ortalama = (matNot+kimyaNot+turkceNot+tarihNot+muzikNot)/5;
		System.out.println("Ders Not Ortalaman�z :"+ ortalama);
		
		boolean sonuc = ortalama > 60;
		String cikti = (sonuc) ? "S�n�f� Ge�ti." : "S�n�fta Kald�.";
		System.out.println(cikti);
		
		
		
		

	}

}
