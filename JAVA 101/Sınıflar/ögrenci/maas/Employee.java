package maas;

public class Employee {
	
	// Nitelik
	String name; // Çalýþanýn adý ve soyadý
	double salary ; // Çalýþanýn maaþý
	int workHours ; // Haftalýk çalýþma saati
	int hireYear ;  // iþe baþlangýç yýlý
	double vergi,bonus,maasArtisi;
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	// Maaþa uygulanan vergiyi hesaplayacak
	public void tax() {
		if (this.salary < 1000) {
			System.out.println("Vergi uygulanmayacak.");
		}else {
			vergi = this.salary*0.03;
		}
	}
	
	public void bonus() {
		if (this.workHours >40) {
			int hesap = this.workHours - 40; // bonus ücret saati 
			bonus = 30*hesap;
		}	
	}
	// çalýþanýn iþe baþlangýç yýlýna göre maaþ artýþýný hesaplayacak. 2021 yýl baþlangýç
	public void raiseSalary() {
		if (2021 - this.hireYear < 10) {
			maasArtisi =  (this.salary*0.05);
		}else if (2021 - this.hireYear >=10 && 2021 - this.hireYear <20) {
			maasArtisi =  (this.salary*0.10);
		}else {
			maasArtisi = (this.salary*0.15);
		}
	}
	
	public void info() {
		System.out.println("Çalýþanýn Adý = " + this.name);
		System.out.println("Çalýþanýn Maaþý = " + this.salary);
		System.out.println("Çalýþanýn Çalýþma Saati = " + this.workHours);
		System.out.println("Çalýþanýn Baþlangýç Yýlý = " + this.hireYear);
		tax();
		System.out.println("Vergi = " + vergi);
		bonus();
		System.out.println("Bonus = " + bonus);
		raiseSalary();
		System.out.println("Maaþ Artýþý = " + maasArtisi);
		System.out.println("Veri ve Bonus ile birlikte maaþ = " + (this.salary-vergi+bonus));
		System.out.println("Toplam Maaþ = " + (this.salary-vergi+bonus+maasArtisi));
	}
}
