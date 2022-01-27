package d24_1_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )

	private int broj;
	private String imeIPrezime;
	private int popust;

//	konstuktore (default-ni i sa parametrima)

	public SuperKartica(int broj, String imeIPrezime, int popust) {
		super();
		this.broj = broj;
		this.imeIPrezime = imeIPrezime;
		this.popust = popust;
	}

	public SuperKartica() {
		super();
	}
//gettere i settere 

	public int getBroj() {
		return broj;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
//	metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)

	
	public void printSK() {
		System.out.println(this.imeIPrezime + ", " + this.broj);
	}
	
}
