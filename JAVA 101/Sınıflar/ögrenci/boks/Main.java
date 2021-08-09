package boks;

public class Main {

	public static void main(String[] args) {
		dovuscu berkay = new dovuscu("Berkay",15,100,90,0);
		dovuscu sena = new dovuscu("Sena",10,95,100,0);
		
		Ring r = new Ring(berkay,sena , 90 , 100);
		r.run();
	}

}
