package laborator3;

class Fractie {

	int numarator;
	int numitor;
	
	public Fractie (int n1, int n2) {
		this.numarator = n1;
		this.numitor = n2;
	}
	
	public Fractie () {
		this(3, 4);
	}

	public String toString() {
		return this.numarator + " / " + this.numitor;
	}
	

	public Fractie suma (Fractie t2) {
		int n1;
		int n2;
		n1 = numarator*t2.numitor + numitor*t2.numarator;
		n2 = numitor * t2.numitor;
		Fractie f = new Fractie(n1, n2);
		return f;
	}

	public boolean equals (Object obj) {
		Fractie f = (Fractie)obj;
		double rez1 = numarator / numitor;
		double rez2 = f.numarator / f.numitor;
		//else if (f.numitor % numitor == 0 && f.numarator % numarator == 0) return true;
		if (rez1 == rez2) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Fractie f1 = new Fractie();
		Fractie f2 = new Fractie(9, 16);
		Fractie f3 = new Fractie(9, 12);
		//f1.toString();
		if (f1.equals(f3) == true) {
			//f1.toString();
			System.out.println (f1.toString() + " este egala cu " + f3.toString());
			//f2.toString();
		}
		else {
			System.out.println (f1.toString() + " NU este egala cu " + f3.toString());
		}
		
		//Fractie sum = f1.suma(f2);
		System.out.println("Suma lui: " + f1.toString() + " cu: " + f2.toString() + " este " + f1.suma(f2).toString());
	}

}
