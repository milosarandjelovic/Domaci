package d20_1_2022;

public class Osoba {
	private String imeIprezime;
	private String JMBG;
	private int godRodj;

	public Osoba(String imeIprezime, String jMBG, int godRodj) {

		this.imeIprezime = imeIprezime;
		JMBG = jMBG;
		this.godRodj = godRodj;
	}

	public Osoba() {

	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public int getGodRodj() {
		return godRodj;
	}

	public void setGodRodj(int godRodj) {
		this.godRodj = godRodj;
	}

	public void print() {
		System.out.println(this.imeIprezime + ", " + this.JMBG + ", " + this.godRodj);
	}
}
