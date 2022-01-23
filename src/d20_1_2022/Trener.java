package d20_1_2022;

public class Trener extends Osoba {
	private int godIskustva;
	private String tip;

	public Trener() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trener(String imeIprezime, String jMBG, int godRodj,int godIskustva,String tip) {
		super(imeIprezime, jMBG, godRodj);
		this.godIskustva=godIskustva;
		this.tip=tip;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(this.tip + ", " + this.godIskustva);
	}
}
