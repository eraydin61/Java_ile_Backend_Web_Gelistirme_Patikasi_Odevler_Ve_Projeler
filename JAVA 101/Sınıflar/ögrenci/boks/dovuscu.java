package boks;

public class dovuscu {
	
	String isim;
	int hasar;
	int saglik;
	int agirlik;
	double dodge;
	
	dovuscu (String isim, int hasar, int saglik, int agirlik , double dodge){
		this.isim = isim;
		this.hasar = hasar;
		this.saglik = saglik;
		this.agirlik = agirlik;
		this.dodge = dodge;
	}
	public int hit(dovuscu x) {
        System.out.println("------------");
        System.out.println(this.isim + " => " + x.isim + " " +  this.hasar + " hasar vurdu.");

        if (x.dodge()) {
            System.out.println(x.isim + " gelen hasarı savurdu.");
            return x.saglik;
        }

        if (x.saglik - this.hasar < 0)
            return 0;

        return x.saglik - this.hasar;
    }
	private boolean dodge() {
		double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
	}
	

}
