package laborator3;

class Punct {
	private int x;
	private int y;
	
	public Punct() {
		this.x = 0;
		this.y = 0;
	}
	
	int getX() {
		return x;
	} 
	void setX(int x) {
		this.x = x;
	}
	int getY() {
		return y;
	} 
	void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")"; 
	}
	double distance(int x2, int y2) {
		return Math.sqrt ((x - x2) * (x - x2) + (y - y2) * (y - y2));
	}
	double distance(Punct p1) {
		return Math.sqrt ((x - p1.getX()) * (x - p1.getX()) + (y - p1.getY()) * (y - p1.getY()));
	}
	
}

public class Problema5 {
	public static void main(String[] args) {
		Punct p1 = new Punct ();
		p1.setX(2);
		p1.setY(3);
		Punct p2 = new Punct ();
		p2.setX(3);
		p2.setY(4);
		System.out.println (p1.distance (p2));
		System.out.println (p1.distance (p2.getX(), p2.getY()));
		System.out.println (p1.toString() + " " + p2.toString());
	}
}
