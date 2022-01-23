package d20_1_2022;

public class Igrac extends Osoba {
	private int brojDresa;
	private String pozicija;
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

	@Override
	public void print() {

		super.print();
		System.out.println(this.brojDresa);
		System.out.println(this.pozicija);
		if (kapiten) {
			System.out.println("Kapiten");
		}
	}

}
