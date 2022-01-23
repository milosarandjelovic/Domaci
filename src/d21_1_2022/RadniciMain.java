package d21_1_2022;

public class RadniciMain {

	public static void main(String[] args) {
		Radnik pera=new Magacioner("Pera Peric");
		Radnik mika=new Menadzer("Mika Mikic");
		Sektor a=new Sektor("dsds", 42000);
		Sektor b=new Sektor("csff", 36000);
		pera.zaposli(a);
		pera.zaposli(b);
		 pera.print();
		mika.zaposli(a);
		mika.zaposli(b);
		mika.print();
	}

}
