package d24_1_2022;

import java.util.ArrayList;
//Kreirati klasu Korpa koja ima:
//niz ambalaza

public class Korpa {
	ArrayList<Ambalaza> listaAmbalaza = new ArrayList<Ambalaza>();

//metodu dodaj ambalazu

	public void dodajAmbalazu(Ambalaza ambalaza) {
		listaAmbalaza.add(ambalaza);
	}
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < listaAmbalaza.size(); i++) {
			if (listaAmbalaza.get(i).getBarkod() == barkod) {
				listaAmbalaza.remove(i);
			}
		}
	}
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 

//	private double cenaSaPopustom(int popust) {
//		double zbirCena = 0;
//		for (int i = 0; i < listaAmbalaza.size(); i++) {
//
//			zbirCena = zbirCena + listaAmbalaza.get(i).cenaArtikla() - popust;
//		}
//		return zbirCena;
//	}
////	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije 
////	se prima Super karticu iz koje se cita popust.
//
//	public double cenaKorpe(SuperKartica superKartica) {
//		return this.cenaSaPopustom(superKartica.getPopust());
//
//	}
	private double cenaSaPopustom(int popust, int i) {

		return listaAmbalaza.get(i).cenaArtikla() - popust;

	}
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije 
//	se prima Super karticu iz koje se cita popust.

	public double cenaKorpe(SuperKartica superKartica) {
		double zbirCena = 0;
		for (int i = 0; i < listaAmbalaza.size(); i++) {
			zbirCena = zbirCena + this.cenaSaPopustom(superKartica.getPopust(), i);
		}
		return zbirCena;

	}
}
