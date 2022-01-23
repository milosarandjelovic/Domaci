package d20_1_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Igrac pera=new Igrac("Pera Peric", "233423536546", 1999, 11, "napad", false);
		pera.dodajKarton("zuti");
		pera.dodajKarton("zuti");
		pera.dodajKarton("crveni");
		pera.print();
	}

}
