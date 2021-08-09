package �grenci;

public class Student {
	
	String isim, numara;
	int sinif;
	Course mat;
	Course fizik;
	Course kimya;
	double ortalama;
	boolean durum;
	
	Student(String isim, int sinif, String numara, Course mat, Course fizik, Course kimya){
		
		this.isim = isim;
		this.sinif = sinif;
		this.numara = numara;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		ortalama();
		this.durum = false;
	}
	
	public void sinavNot(int mat,int fizik, int kimya) {
		if (mat >= 0 && mat <= 100) {
			this.mat.note = mat;
		}if (fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
		}if (kimya >= 0 && kimya <= 100) {
			this.kimya.note = kimya;
		}
	}
	
	public void sozluNot(int mat,int fizik, int kimya) {
		if (mat >= 0 && mat <= 100) {
			this.mat.sozluNot = mat;
		}if (fizik >= 0 && fizik <= 100) {
			this.fizik.sozluNot = fizik;
		}if (kimya >= 0 && kimya <= 100) {
			this.kimya.sozluNot = kimya;
		}
	}
	
	public void durum() {
		this.durum = sinirDurum();
		infoOgrenci();
		System.out.println("Ortalama : " + this.ortalama);
		if (this.durum) {
			System.out.println("S�n�f� Ge�ti.");
		}else {
			System.out.println("S�n�fta Kald�.");
		}
	}
	
	public void ortalama() {
		this.ortalama = (((this.fizik.note*0.80)+(this.fizik.sozluNot*0.20))+((this.mat.note*0.80)+(this.mat.sozluNot*0.20))+((this.kimya.note*0.80)+(this.kimya.sozluNot*0.20))) / 3 ;
	}
	
	public boolean sinirDurum() {
		ortalama();
		return this.ortalama > 55;
	}
	
	public void infoOgrenci() {
		System.out.println("-----------------");
		System.out.println("��renci = " + this.isim);
		System.out.println("��renci Numaras� = " + this.numara);
		System.out.println("��renci S�n�f� = " + this.sinif);
		System.out.println("Matematik Notu = " + this.mat.note);
		System.out.println("Matematik S�zl� Notu = " + this.mat.sozluNot);
		System.out.println("Fizik Notu = " + this.fizik.note);
		System.out.println("Fizik S�zl� Notu = " + this.fizik.sozluNot);
		System.out.println("Kimya Notu = " + this.kimya.note);
		System.out.println("Kimya S�zl� Notu = " + this.kimya.sozluNot);
	}

}
