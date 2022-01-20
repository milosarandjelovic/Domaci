package d17_1_2022;

public class Transakcija {
	private String id;
	private Racun saKog;
	private Racun naKoji;

	public Transakcija() {

	}

	public Transakcija(String id, Racun saKog, Racun naKoji) {
		super();
		this.id = id;
		this.saKog = saKog;
		this.naKoji = naKoji;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getSaKog() {
		return saKog;
	}

	public void setSaKog(Racun saKog) {
		this.saKog = saKog;
	}

	public Racun getNaKoji() {
		return naKoji;
	}

	public void setNaKoji(Racun naKoji) {
		this.naKoji = naKoji;
	}

	private double vracaProviziju(double sredstva) {
		if (sredstva < 4500) {
			return 45;
		} else {
			return sredstva / 100;
		}
	}

	public void izvrsiTransakciju(double sredstva) {
		this.saKog.promeniStanje(-sredstva + vracaProviziju(sredstva));
		this.naKoji.promeniStanje(sredstva);
	}

	public void print() {
		System.out.println("Racun sa " + this.saKog.getImeIPrezime() + " - " + this.saKog.getBroj());
		System.out.println("Racun na " + this.naKoji.getImeIPrezime() + " - " + this.naKoji.getBroj());
	}
}
