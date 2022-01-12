package d_10_1_2022;

public class Proizvod {
	String name;
	double price;
	double weight;

	public void print() {
		System.out.println(this.name + ", "+ this.price + ", " + this.weight);
System.out.println("Cena postarina je "+this.cenaPostarine());
	}

	public void povecajCenu(int poskupljenje) {
		this.price = this.price + poskupljenje;
	}

	public double cenaSaPopustom(int popust) {

		return this.price = this.price - this.price / 100 * popust;

	}

	public double cenaPostarine() {
		if (this.weight < 100) {
			return 200;
		} else if (this.weight > 100 && this.weight < 500) {
			return 400;
		} else {
			return 1000;
		}
	}
}
