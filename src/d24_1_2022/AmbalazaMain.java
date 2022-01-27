package d24_1_2022;

public class AmbalazaMain {

	public static void main(String[] args) {
//		U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova 
//		i istestirati sve metode i ispisati ukupnu cenu sa popustom.

 Korpa a=new Korpa();
 
 Tetrapak mleko=new Tetrapak("425353", "Kravica", 1, 1.1, false, 100);
 Tetrapak jogurt=new Tetrapak("425353", "Jogurt", 1.50, 1.6, true, 120);
 
 Ambalaza kisela=new StaklenaAmbalaza("424255", "Kisela voda", 0.75, 0.9, 15, true, 67);
 Ambalaza pivo=new StaklenaAmbalaza("424255", "Tuborg", 0.5, 0.65, 11, true, 38);
 
 a.dodajAmbalazu(mleko);
 a.dodajAmbalazu(jogurt);
 a.dodajAmbalazu(pivo);
 a.dodajAmbalazu(kisela);
 SuperKartica pera=new SuperKartica(2314432, "Pera Peric", 150);
 
 System.out.println(a.cenaKorpe(pera));
	}

}
