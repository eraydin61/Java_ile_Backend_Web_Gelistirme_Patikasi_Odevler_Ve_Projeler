package maas;

public class Employee {
	
	// Nitelik
	String name; // �al��an�n ad� ve soyad�
	double salary ; // �al��an�n maa��
	int workHours ; // Haftal�k �al��ma saati
	int hireYear ;  // i�e ba�lang�� y�l�
	double vergi,bonus,maasArtisi;
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	// Maa�a uygulanan vergiyi hesaplayacak
	public void tax() {
		if (this.salary < 1000) {
			System.out.println("Vergi uygulanmayacak.");
		}else {
			vergi = this.salary*0.03;
		}
	}
	
	public void bonus() {
		if (this.workHours >40) {
			int hesap = this.workHours - 40; // bonus �cret saati 
			bonus = 30*hesap;
		}	
	}
	// �al��an�n i�e ba�lang�� y�l�na g�re maa� art���n� hesaplayacak. 2021 y�l ba�lang��
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
		System.out.println("�al��an�n Ad� = " + this.name);
		System.out.println("�al��an�n Maa�� = " + this.salary);
		System.out.println("�al��an�n �al��ma Saati = " + this.workHours);
		System.out.println("�al��an�n Ba�lang�� Y�l� = " + this.hireYear);
		tax();
		System.out.println("Vergi = " + vergi);
		bonus();
		System.out.println("Bonus = " + bonus);
		raiseSalary();
		System.out.println("Maa� Art��� = " + maasArtisi);
		System.out.println("Veri ve Bonus ile birlikte maa� = " + (this.salary-vergi+bonus));
		System.out.println("Toplam Maa� = " + (this.salary-vergi+bonus+maasArtisi));
	}
}
