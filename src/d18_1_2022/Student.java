package d18_1_2022;

import java.util.ArrayList;

public class Student {
	private String brojIndeksa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
		super();
		this.brojIndeksa = brojIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	}

	public Student() {
		super();
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void setIspiti(ArrayList<Ispit> ispiti) {
		this.ispiti = ispiti;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void ubaciIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public double prosek() {
		double prosek;
		double zbir = 0;
		int polozeniIspiti = 0;

		for (int j = 0; j < ispiti.size(); j++) {
			if (this.ispiti.get(j).polozenIspit()) {
				polozeniIspiti++;
				zbir = zbir + this.ispiti.get(j).getOcena();
			}
		}
		return prosek = zbir / polozeniIspiti;

	}

	public void print() {
		System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
		for (int i = 0; i < ispiti.size(); i++) {
			System.out.println(this.ispiti.get(i).getNaziv() + " - " + this.ispiti.get(i).getImeProfesora() + " - "
					+ this.ispiti.get(i).getOcena());
		}
		System.out.println(this.prosek());
	}
}
