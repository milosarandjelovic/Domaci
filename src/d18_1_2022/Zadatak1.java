package d18_1_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student pera=new Student("23445", "Pera Peric", "Nautika");
pera.ubaciIspit(new Ispit("aaa", 7, "Zika"));
pera.ubaciIspit(new Ispit("bbb", 8, "Juca"));
pera.ubaciIspit(new Ispit("ccc", 5, "Dubravka"));

pera.print();
	}

}
