package d17_1_2022;

public class Racun {
	private String broj;
	private String imeIPrezime;
	private double trenutnoStanje;

	public Racun() {

	}

	public Racun(String broj, String imeIPrezime, double trenutnoStanje) {

		this.broj = broj;
		this.imeIPrezime = imeIPrezime;
		this.trenutnoStanje = trenutnoStanje;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}

	

	public void promeniStanje(double cifra) {
		if (this.trenutnoStanje - cifra > 0) {
			this.trenutnoStanje = this.trenutnoStanje - cifra;
		} else {
			System.out.println("Nemate dovoljno novca na stanju.");
		}
	}

	public void print() {
		System.out.println(this.imeIPrezime + " - " + this.broj);
		System.out.println("Stanje na racunu je " + this.trenutnoStanje + " rsd.");

	}

}
