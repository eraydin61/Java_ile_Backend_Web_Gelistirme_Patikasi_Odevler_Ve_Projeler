package ögrenci;

public class Main {

	public static void main(String[] args) {
		
		Course mat = new Course("Matematik","MAT101","MAT");
		Course fizik = new Course("Fizik","FIZ101","FIZ");
		Course kimya = new Course("Kimya","KIM101","KIM");
		
		Teacher ogretmen1 = new Teacher("Berkay ERAYDIN","05439752210","MAT");
		Teacher ogretmen2 = new Teacher("Sena ERAYDIN","05439752210","FIZ");
		Teacher ogretmen3 = new Teacher("Serkan ERAYDIN","05439752210","KIM");
		
		ogretmen1.print();
		ogretmen2.print();
		ogretmen3.print();
		
		mat.ogretmenEkle(ogretmen1);
		fizik.ogretmenEkle(ogretmen2);
		kimya.ogretmenEkle(ogretmen3);

		mat.ogretmenYazdýr();
		Student s1 = new Student("Fatih KOLAY",4,"1700002887",mat,fizik, kimya);
		s1.sinavNot(50,20,40);
		s1.sozluNot(70, 70, 70);
		s1.durum();
		
		Student s2 = new Student("Gizem Bozyel",4,"1700002210",mat,fizik, kimya);
		s2.sinavNot(100,50,40);
		s2.sozluNot(70, 70, 70);
		s2.durum();
		
		Student s3 = new Student("Veysel Demirel",4,"1700002887",mat,fizik, kimya);
		s3.sinavNot(50,60,40);
		s3.sozluNot(100, 100, 100);
		s3.durum();
	}
}
