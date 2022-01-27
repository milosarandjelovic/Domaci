package d24_1_2022;

public class Tetrapak extends Ambalaza {

//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena

	private boolean reciklirajuce;
	private double osnCena;

//	konstuktori koji su vam potrebni

	public Tetrapak() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean reciklirajuce,
			double osnCena) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.reciklirajuce = reciklirajuce;
		this.osnCena = osnCena;
	}

//	gettere i setter za atribute
	public boolean isReciklirajuce() {
		return reciklirajuce;
	}

	public double getOsnCena() {
		return osnCena;
	}

	public void setReciklirajuce(boolean reciklirajuce) {
		this.reciklirajuce = reciklirajuce;
	}

	public void setOsnCena(int osnCena) {
		this.osnCena = osnCena;
	}

//	racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
	@Override
	public double cenaArtikla() {
		if (reciklirajuce) {
			return this.tezinaPakovanja() * 1.5 + this.osnCena;
		}
		return osnCena;
	}

//	metoda stampaj stampa sve podatke iz klase tetrapak.
	@Override
	public void print() {
		System.out.println(this.naziv+", "+this.barkod);
		System.out.println("Neto: "+this.netoTezina);
		System.out.println("Cena: "+this.cenaArtikla());

	}

}
