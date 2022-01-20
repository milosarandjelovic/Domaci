package d17_1_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Racun a=new Racun("2343432", "Pera Peric", 10000);
		Racun b=new Racun("342545", "Mika Mikic", 15000);
		Transakcija p=new Transakcija("42423", a, b);
		
		
		a.print();
		b.print();
		
		p.izvrsiTransakciju(2000);
		
		a.print();
		b.print();
		
		
		
		
	}

}
