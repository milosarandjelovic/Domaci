package d_10_1_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		FacebookPost one= new FacebookPost();
		FacebookPost two=new FacebookPost();
		
		one.imeIPrezime="Pera Peric";
		one.imeProfilaGdeJePost="Tash Sultana";
		one.tekst="You are the greatest!";
		one.lajkovi=443;
		one.deljenja=0;
		
		
		two.imeIPrezime="Mika Mikic";
		two.imeProfilaGdeJePost="Genesis";
		two.tekst="You are the best!";
		two.lajkovi=103350;
		two.deljenja=18;
		
		one.print();
		
		two.print();
		
		one.like();
		
		one.print();
		
		two.share();
		
		two.print();

	}

}
