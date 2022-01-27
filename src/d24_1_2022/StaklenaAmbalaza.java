package d24_1_2022;

public class StaklenaAmbalaza extends Ambalaza {
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
	private double kaucija;
	private boolean placaSeKaucija;
	private double osnCena;

//	konstuktori koji su vam potrebni

	public StaklenaAmbalaza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija,
			boolean placaSeKaucija, double osnCena) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.kaucija=kaucija;
		this.placaSeKaucija=placaSeKaucija;
		this.osnCena=osnCena;
	}
//	gettere i setter za atribute
	
	public double getKaucija() {
		return kaucija;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public double getOsnCena() {
		return osnCena;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public void setOsnCena(double osnCena) {
		this.osnCena = osnCena;
	}
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2

	@Override
	public double cenaArtikla() {
		if (this.placaSeKaucija) {
			return this.osnCena*1.2+this.kaucija;
		}
		return this.osnCena*1.2;
	}
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

	@Override
	public void print() {
		System.out.println(this.naziv+", "+this.barkod);
		System.out.println("Neto: "+this.netoTezina);
		System.out.println("Cena: "+this.cenaArtikla());

		
	}

}
