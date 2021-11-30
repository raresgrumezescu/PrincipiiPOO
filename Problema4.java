package laborator3;

class Numar {
	int nr;
	
	public Numar (int a) {
		this.nr = a;
	}
	
	//returneaza suma dintre nr (membrul clasei) si a
	public int suma(int a) {
		return nr + a;
	}
	//returneaza suma dintre nr, a si b
	public int suma(int a, int b) {
		return suma(a) + b;
	}
	//returneaza suma dintre nr, a, b si c
	public int suma(int a, int b, int c) {
		return suma (a, b) + c;
	}
	
	//returneaza suma dintre nr, a, b, c si d
	public int suma(int a, int b, int c, int d) {
		return suma (a, b, c) + d;
	}
	
}

public class Problema4 {

	public static void main(String[] args) {
		Numar num = new Numar(1);
		System.out.println (num.suma(2));
		System.out.println (num.suma(2, 3));
		System.out.println (num.suma(2, 3, 4));
	}

}
