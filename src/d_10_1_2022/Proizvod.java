package d_10_1_2022;

public class Proizvod {
	String name;
	double price;
	double weight;

	public void print() {
		System.out.println("{{" + this.name + "}}, " + "{{" + this.price + "}}, " + "{{" + this.weight + "}}");

	}

	public void povecajCenu(int poskupljenje) {
		this.price = this.price + poskupljenje;
	}

	public double cenaSaPopustom(int popust) {

		return this.price = this.price - this.price / 100 * popust;

	}
}
