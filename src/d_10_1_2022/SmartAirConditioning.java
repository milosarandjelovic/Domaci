package d_10_1_2022;

public class SmartAirConditioning {
	String name;
	int elZaGrejanje;
	int elZaHladjenje;
	int temp;
	boolean mod;

	public void printsAC() {
		System.out.println(this.name + " - " + this.modStatus() + " - " + this.temp);
		System.out.println("Mesecna potrosnja je " + this.mesecnaPotrosnja());
		System.out.println("Cena mesecne potrosnje je "+this.cenaMesecnePotrosnje());
	}

	public String modStatus() {
		if (this.mod) {
			return "Hladi";
		} else {
			return "Greje";
		}
	}

	public int mesecnaPotrosnja() {
		if (this.mod) {
			return 30 * 15;
		} else {
			return 30 * 15 * 2;
		}
	}

	public int cenaMesecnePotrosnje() {
		int cena = 0;
		cena = 350 * 6 + ((this.mesecnaPotrosnja() - 350) * 9);
		return cena;

	}
}
