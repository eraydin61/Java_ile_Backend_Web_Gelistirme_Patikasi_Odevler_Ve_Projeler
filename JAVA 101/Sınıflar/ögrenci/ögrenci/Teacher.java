package �grenci;

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
		System.out.println("��retmenin Ad� : " + this.isim);
		System.out.println("��retmenin Telefonu : " + this.telNo);
		System.out.println("��retmenin B�l�m� : " + this.bolum);
	}

}
