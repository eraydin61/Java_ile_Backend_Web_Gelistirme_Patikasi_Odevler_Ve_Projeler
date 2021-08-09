package ögrenci;

public class Teacher {
	
	String isim;
	String telNo;
	String bolum;
	
	public Teacher(String isim, String telNo, String bolum) {
		
		this.isim = isim;
		this.telNo=telNo;
		this.bolum = bolum;
	}
	
	void print() {
		System.out.println("----------------------------");
		System.out.println("Öðretmenin Adý : " + this.isim);
		System.out.println("Öðretmenin Telefonu : " + this.telNo);
		System.out.println("Öðretmenin Bölümü : " + this.bolum);
	}

}
