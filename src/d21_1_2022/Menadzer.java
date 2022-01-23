package d21_1_2022;

public class Menadzer extends Radnik {

	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
		
	}

	@Override
	public double vratiPlatu() {
		int ukupnaPlata = 0;
		for (int i = 0; i < this.sektoriZaposlenog.size(); i++) {

			ukupnaPlata = ukupnaPlata + this.sektoriZaposlenog.get(i).getPlata();
		}
		return ukupnaPlata;
	}

	//@Override
	public void print() {
		
		super.print();
		System.out.println("Plata: "+this.vratiPlatu());
	}

}
