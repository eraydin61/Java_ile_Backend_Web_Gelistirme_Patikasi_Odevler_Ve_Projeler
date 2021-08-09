package boks;

public class Ring {
	
	dovuscu d1;
	dovuscu d2;
	int minAgirlik;
	int maxAgirlik;
	
	Ring(dovuscu d1,dovuscu d2, int minAgirlik, int maxAgirlik){
		this.d1 = d1 ;
		this.d2 = d2 ;
		this.minAgirlik =minAgirlik ;
		this.maxAgirlik =maxAgirlik;
	}
	
	 public void run() {

	        if (checkWeight()) {
	            while (d1.saglik > 0 && d2.saglik > 0) {
	                System.out.println("======== YENİ ROUND ===========");
	                d2.saglik = d1.hit(d2);
	                if (kazanan()){
	                    break;
	                }
	                d1.saglik = d2.hit(d1);
	                if (kazanan()){
	                    break;
	                }
	                printSkor();
	            }

	        } else {
	            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
	        }
	    }
	
	public boolean checkWeight() {
        return (d1.agirlik >= minAgirlik && d1.agirlik <= maxAgirlik) && (d2.agirlik >= minAgirlik && d2.agirlik <= maxAgirlik);
    }
	
	public boolean kazanan() {
        if (d1.saglik == 0) {
            System.out.println("Maçı Kazanan : " + d2.isim);
            return true;
        } else if (d2.saglik == 0){
            System.out.println("Maçı Kazanan : " + d2.isim);
            return true;
        }
		return false;
     }
	
	public void printSkor() {
        System.out.println("------------");
        System.out.println(d1.isim + " Kalan Can \t:" + d1.saglik);
        System.out.println(d2.isim + " Kalan Can \t:" + d2.saglik);
    }
}

