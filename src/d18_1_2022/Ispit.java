package d18_1_2022;

public class Ispit {
	private String naziv;
	private double ocena;
	private String imeProfesora;

	public Ispit(String naziv, double ocena, String imeProfesora) {

		this.naziv = naziv;
		this.ocena = ocena;
		this.imeProfesora = imeProfesora;
	}

	public Ispit() {

	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

	public String getImeProfesora() {
		return imeProfesora;
	}

	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}

	public boolean polozenIspit() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println(this.naziv + " - " + this.imeProfesora + " - " + this.ocena);
	}
}
