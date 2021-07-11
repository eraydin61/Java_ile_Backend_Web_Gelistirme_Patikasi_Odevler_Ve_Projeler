import java.util.Scanner

/*
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı
yazın.
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...*/
public class NotOrtalamasıHesaplayanProgram {

	public static void main(String[] args) {
		
		Scanner deger = new Scanner(System.in);
		
		System.out.println("Matematik Notunuzu Giriniz :");
		int matNot = deger.nextInt();
		
		System.out.println("Kimya Notunuzu Giriniz :");
		int kimyaNot = deger.nextInt();
		
		System.out.println("Türkçe Notunuzu Giriniz :");
		int turkceNot = deger.nextInt();
		
		System.out.println("Tarih Notunuzu Giriniz :");
		int tarihNot = deger.nextInt();
		
		System.out.println("Müzik Notunuzu Giriniz :");
		int muzikNot = deger.nextInt();
		
		float ortalama = (matNot+kimyaNot+turkceNot+tarihNot+muzikNot)/5;
		System.out.println("Ders Not Ortalamanız :"+ ortalama);
		
		boolean sonuc = ortalama > 60;
		String cikti = (sonuc) ? "Sınıfı Geçti." : "Sınıfta Kaldı.";
		System.out.println(cikti);
		
	}

}
