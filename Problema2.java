package laborator3;


class Produs {
	
	String nume;
	double pret;
	int cantitate;
	
	public Produs (String num, double pre, int cantitat) {
		this.nume = num;
		this.pret = pre;
		this.cantitate = cantitat;
	}
	
	public String toString () {
		return "Produs " + nume + " " + pret + " " + cantitate;
	}
	
	public double getTotalProdus () {
		return cantitate * pret;
	}
}

class Magazin {
	
	String nume;
	Produs p1;
	Produs p2;
	Produs p3;
	
	public Magazin (Produs prod1, Produs prod2, Produs prod3) {
		this.p1 = prod1;
		this.p2 = prod2;
		this.p3 = prod3;
	}
	
	public String toString () {
		return this.p1.nume + " " + this.p2.nume + " " + this.p3.nume;
	}
	
	public double getTotalMagazin () {
		return this.p1.getTotalProdus() + this.p2.getTotalProdus() + this.p3.getTotalProdus();
	}
	
}

public class Problema2 {

	public static void main(String[] args) {
		Magazin mag = new Magazin (new Produs ("rosii", 4.00, 3), new Produs ("cartofi", 5.50, 10), new Produs ("morcovi", 6.00, 5));
		System.out.println (mag.toString());
		System.out.println (mag.p1.toString());
		System.out.println (mag.p2.toString());
		System.out.println (mag.p3.toString());
	}
}

