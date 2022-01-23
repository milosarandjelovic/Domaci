package d21_1_2022;

import java.util.ArrayList;

public abstract class Radnik extends Sektor{

	protected String imeIPrezime;
	protected ArrayList<Sektor> sektoriZaposlenog = new ArrayList<Sektor>();
	
	

	public ArrayList<Sektor> getSektoriZaposlenog() {
		return sektoriZaposlenog;
	}

	public abstract double vratiPlatu();

	public void zaposli(Sektor sektor) {
		sektoriZaposlenog.add(sektor);
	}

	public Radnik(String naziv) {
		
		this.imeIPrezime = naziv;
	}
	public Radnik() {
		// TODO Auto-generated constructor stub
	}

	public void print () {
		System.out.println(this.imeIPrezime);
	}
}
