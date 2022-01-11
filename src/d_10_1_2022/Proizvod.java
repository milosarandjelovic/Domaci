package d_10_1_2022;

public class Proizvod {
	String name;
	double price;
	double weight;

	public void print() {
		System.out.print("{{" + this.name + "}}, ");
		System.out.print("{{" + this.price + "}}, ");
		System.out.print("{{" + this.weight + "}}");
	}
}
