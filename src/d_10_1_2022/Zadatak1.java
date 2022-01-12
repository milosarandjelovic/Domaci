package d_10_1_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proizvod a = new Proizvod();
		Proizvod b = new Proizvod();
		a.name = "jabuke";
		a.price = 78;
		a.weight = 1000;

		b.name = "banane";
		b.price = 120;
		b.weight = 1000;

		a.print();
		
		b.print();
		
		int poskupljenje=40;
		
		a.povecajCenu(poskupljenje);
		a.print();
		
		b.cenaSaPopustom(20);
		b.print();
		
	}

}
