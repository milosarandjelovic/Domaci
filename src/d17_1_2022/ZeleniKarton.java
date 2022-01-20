package d17_1_2022;

public class ZeleniKarton {
	private String imeIprezimeStudenta;
	private String brojIndeksa;
	private String nazivPredmeta;
	private String imeIprezimeProfesora;
	private double ocena;

	public ZeleniKarton(String imeIprezimeStudenta, String brojIndeksa, String nazivPredmeta,
			String imeIprezimeProfesora, double ocena) {

		this.imeIprezimeStudenta = imeIprezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIprezimeProfesora = imeIprezimeProfesora;
		this.ocena = ocena;
	}

	public ZeleniKarton() {

	}

	public String getImeIprezimeStudenta() {
		return imeIprezimeStudenta;
	}

	public void setImeIprezimeStudenta(String imeIprezimeStudenta) {
		this.imeIprezimeStudenta = imeIprezimeStudenta;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIprezimeProfesora() {
		return imeIprezimeProfesora;
	}

	public void setImeIprezimeProfesora(String imeIprezimeProfesora) {
		this.imeIprezimeProfesora = imeIprezimeProfesora;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

	public boolean polozenIspit() {
		if (this.ocena > 5) {
			return true;
		}
		return false;
	}
	public void print () {
		System.out.println(this.nazivPredmeta+" - "+this.ocena);
		System.out.println("Student "+this.imeIprezimeStudenta+", "+this.brojIndeksa);
		System.out.println("Profesor "+this.imeIprezimeProfesora);
	}

	
	}
	
	
	
	
	
	
	
	
	
	
	

