package �grenci;

public class Course {
	
	// Nitelikler
	Teacher kursOgretmen;
	String kursIsmi;
	String dersKod;
	String prefix;
	int note;
	int sozluNot;
	
	// Davran��lar
	public Course(String kursIsmi,String dersKod,String prefix) {
		
		this.kursIsmi = kursIsmi;
		this.dersKod = dersKod;
		this.prefix = prefix;
		this.note = 0;
	}
	
	public void ogretmenEkle(Teacher t) {
		if (this.prefix == t.bolum ) {
			this.kursOgretmen = t;
			System.out.println("��lem Ba�ar�l�");
		}else {
			System.out.println(t.isim + "Akademisyen bu dersi veremez.");
		}
	}
	
	public void ogretmenYazd�r() {
		if (kursOgretmen != null) {
			System.out.println(this.kursIsmi + " dersinin akademisyeni " + this.kursOgretmen);
		}else {
			System.out.println(this.kursIsmi + " dersine akademisyen atanmam��t�r.");
		}	
	}
	
	
	

}
