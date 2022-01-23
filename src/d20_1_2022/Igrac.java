package d20_1_2022;

import java.util.ArrayList;

public class Igrac extends Osoba {
	private int brojDresa;
	private String pozicija;
	ArrayList<Karton> kartoni = new ArrayList<Karton>();
	private boolean kapiten;

	public Igrac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Igrac(String imeIprezime, String jMBG, int godRodj, int brojDresa, String pozicija, boolean kapiten) {
		super(imeIprezime, jMBG, godRodj);
		this.brojDresa = brojDresa;
		this.pozicija = pozicija;
		this.kapiten = kapiten;

	}

	public int getBrojDresa() {
		return brojDresa;
	}

	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public void dodajKarton(String tip) {
		Karton a = new Karton(tip);
		kartoni.add(a);
	}

	public int brojZKartona() {
		int brojac = 0;
		for (int i = 0; i < kartoni.size(); i++) {

			if (kartoni.get(i).getTip().equals("zuti")) {
				brojac++;
			}
		}
		return brojac;
	}

	public int brojCKartona() {
		int brojac = 0;
		for (int i = 0; i < kartoni.size(); i++) {

			if (kartoni.get(i).getTip().equals("crveni")) {
				brojac++;
			}
		}
		return brojac;
	}

	@Override
	public void print() {

		super.print();
		System.out.println(this.brojDresa);
		System.out.println(this.pozicija);
		if (kapiten) {
			System.out.println("Kapiten");

		}
		System.out.println("Broj crvenih kartona: " + this.brojCKartona());
		System.out.println("Broj zutih kartona: " + this.brojZKartona());
	}

}
