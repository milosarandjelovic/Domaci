package d17_1_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {

		ArrayList<ZeleniKarton> zeleniKartonStudenta = new ArrayList<ZeleniKarton>();

		zeleniKartonStudenta.add(new ZeleniKarton("Pera Peric", "1234", "Nautika", "Mika Mikic", 7));
		zeleniKartonStudenta.add(new ZeleniKarton("Laza", "4345", "Nautica", "Mika Mikic", 8));
		zeleniKartonStudenta.add(new ZeleniKarton("Ljuba", "4245", "Nautica", "Mika Mikic", 5));
		zeleniKartonStudenta.add(new ZeleniKarton("Mara", "5646", "Nautica", "Mika Mikic", 9));
		zeleniKartonStudenta.add(new ZeleniKarton("Ana", "6456", "Nautica", "Mika Mikic", 10));
		zeleniKartonStudenta.add(new ZeleniKarton("Juca", "3244", "Nautica", "Mika Mikic", 7));

		
		double brojSvihOcena = 0;
		double brojPolozenih = 0;
		double zbirSvih = 0;
		double zbirPolozenih = 0;

		for (int i = 0; i < zeleniKartonStudenta.size(); i++) {
			zeleniKartonStudenta.get(i).print();
			System.out.println();
			zbirSvih = zbirSvih + zeleniKartonStudenta.get(i).getOcena();
			brojSvihOcena++;
			if (zeleniKartonStudenta.get(i).polozenIspit()) {
				zbirPolozenih = zbirPolozenih + zeleniKartonStudenta.get(i).getOcena();
				brojPolozenih++;
			}
		}System.out.println("Prosecna ocena svih polozenih ispita je "+zbirSvih/brojSvihOcena);
		System.out.println("Prosecna ocena svih ispita je "+zbirPolozenih/brojPolozenih);
	}
}