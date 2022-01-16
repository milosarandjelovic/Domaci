package d14_1_2022;

public class Vaga {
	private String mernaJedinica;
	private Proizvod proizvod;
	private double tezina;

	public Vaga() {

	}

	public Vaga(String mernaJedinica, Proizvod proizvod, double tezina) {
		this.mernaJedinica = mernaJedinica;
		this.proizvod = proizvod;
		this.tezina = tezina;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public String getMernaJedinica() {
		return this.mernaJedinica;
	}

	public Proizvod getProizvod() {
		return this.proizvod;
	}

	private double sracunajCenu() {
		if (this.mernaJedinica.equals("kg")) {
			return this.tezina * this.proizvod.getCenaKg();
		} else {
			return this.tezina * this.proizvod.getCenaLb();
		}
	}

	public void print() {
		this.proizvod.print();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + " din /" + this.mernaJedinica + " - " + this.tezina);
		} else {
			System.out.println(this.proizvod.getCenaLb() + " " + this.mernaJedinica + " - " + this.tezina);
		}
		System.out.println("Ukupno: " + this.sracunajCenu()+" din");
	}
}
