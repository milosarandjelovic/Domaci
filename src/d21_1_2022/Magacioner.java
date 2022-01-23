package d21_1_2022;

public class Magacioner extends Radnik{
	public Magacioner(String imeIPrezime) {
		super(imeIPrezime);
		
	}

	private double prosecnaPlata() {
	double prosecnaPlata=0;
	//return prosecnaPlata=this.vratiPlatu()/this.sektoriZaposlenog.size()*0.5;
	for (int i = 0; i < this.sektoriZaposlenog.size() ; i++) {
		prosecnaPlata=prosecnaPlata+this.sektoriZaposlenog.get(i).getPlata();
	}
	return prosecnaPlata/this.sektoriZaposlenog.size()*0.5;
	}

	@Override
	public double vratiPlatu() {
	return this.prosecnaPlata()*this.sektoriZaposlenog.size();
		
	}

	//@Override
	public void print() {
		
		super.print();
		System.out.println("Plata: "+this.vratiPlatu());
	}

	
}
