package horseBetting;

public class Speler {
	private int cash;
	String name;
	
	Speler(String naam) {
		name = naam;
		cash = 100;
	}
	Speler(String naam, int geld) {
		this(naam);
		cash = geld;
	}
	
	int getCash() {
		return cash;
	}
	void useCash(int geld) {
		cash -= geld;
	}
	void gainCash(int geld) {
		cash += geld;
	}
}
