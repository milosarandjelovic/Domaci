package d14_1_2022;

public class Knjiga {
	private String naslov;
	private String ISBN;
	private int godinaIzdanja;
	private Autor autor;

	public Knjiga(String naslov, String ISBN, int godinaIzdanja, Autor autor) {
		this.naslov = naslov;
		this.ISBN = ISBN;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public Knjiga(String naslov, String ISBN, int godinaIzdanja) {
		this.naslov = naslov;
		this.ISBN = ISBN;
		this.godinaIzdanja = godinaIzdanja;

	}

	public Knjiga() {

	}

	public String getNaslov() {
		return this.naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void print() {
		System.out.println("ISBN " + this.ISBN);
		System.out.println(this.naslov + " - " + this.godinaIzdanja);
		if (this.autor != null) {
			this.autor.print();
			
		}
		System.out.println();
	}
}
