package laborator3;

class ClockTime {
	int hour;
	int minute;
	
	public ClockTime (int h, int m) {
		this.hour = h;
		this.minute = m;
	}
	// metoda aceasta returneaza 1 daca primul timp (this) este mai recent 
	// si 2 daca celalalt moment de timp, primit ca parametru, este mai recent.
	public int compare (int h2, int m2) {
		if (this.hour < h2) return 1;
		else if (this.hour == h2) {
			if (this.minute > m2) return 2;
			else return 1;
		}
			 else return 2;
	}
	
}

class Schedule {
	ClockTime departure;
	ClockTime arrival;
	
	public Schedule (ClockTime d, ClockTime a) {
		this.departure = d;
		this.arrival = a;
	}
	
	int durata () {
		int timp1 = this.arrival.hour * 60; 
		int timp2 = this.departure.hour * 60;
		int timp = timp1 - timp2;
		timp -= this.departure.minute;
		timp += this.arrival.minute;
		return timp;
	}
}

class Route {
	String origin;
	String destination;
	
	public Route (String orig, String dest) {
		this.origin = orig;
		this.destination = dest;
	}
	
	public boolean turRetur (Route obj) {
		if (this.origin.equals(obj.destination) && this.destination.equals(obj.origin)) return true;
		else return false;
	}
	
}


class Train {
	Route r;
	Schedule s;
	boolean local;
	
	public Train (String orig, String dest, int horig, int morig, int hdest, int mdest, boolean isLocal) {
		Route route = new Route(orig, dest);
		this.r = route;
		Schedule sched = new Schedule(new ClockTime(horig, morig), new ClockTime(hdest, mdest));
		this.s = sched;
		this.local = isLocal;
		
	}
	
	public int pret () {
		int X;
		if (this.local == true) X = 1;
		else X = 2;
		int timp = this.s.durata();
		return X * timp;
	}
}

public class Problema7 {

	public static void main(String[] args) {
		Train bilet1 = new Train ("Bucuresti Nord" , "Constanta", 9, 35, 12, 02, true);
		Train bilet2 = new Train ("Bucuresti Nord" , "Iasi", 5, 45, 12, 49, true);
		Train bilet3 = new Train ("Bucuresti Nord" , "Sofia", 23, 45, 17, 00, false);
		System.out.println (bilet1.local + " " + bilet1.r.origin + " (" + bilet1.s.departure.hour + ":" + bilet1.s.departure.minute + ") -> " + bilet1.r.destination + " (" + bilet1.s.arrival.hour + ":" + bilet1.s.arrival.minute + ")");
		System.out.println (bilet1.local + " " + bilet1.r.origin + " (" + bilet1.s.departure.hour + ":" + bilet1.s.departure.minute + ") -> " + bilet1.r.destination + " (" + bilet1.s.arrival.hour + ":" + bilet1.s.arrival.minute + ")");
		System.out.println (bilet1.local + " " + bilet1.r.origin + " (" + bilet1.s.departure.hour + ":" + bilet1.s.departure.minute + ") -> " + bilet1.r.destination + " (" + bilet1.s.arrival.hour + ":" + bilet1.s.arrival.minute + ")");

	}

}
