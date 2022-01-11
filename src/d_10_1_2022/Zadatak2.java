package d_10_1_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartAirConditioning a=new SmartAirConditioning();
SmartAirConditioning b=new SmartAirConditioning();


a.name="LG";
a.mod="cold";
a.temperature=26;

b.name="VOX";
b.mod="heat";
b.temperature=28;

a.printsAC();
System.out.println();
b.printsAC();



	}

}
