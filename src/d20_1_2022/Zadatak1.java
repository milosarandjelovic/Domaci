package d20_1_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Igrac> listaIgraca = new ArrayList<Igrac>();
		ArrayList<Trener> listaTrenera = new ArrayList<Trener>();
		String x = "hello";

		while (!x.equals("stop")) {

			System.out.println("Zelite da unesete igraca ili trenera?");
			System.out.println("Unsetite `stop` da prekinete sa unosom.");
			x = s.next();

			if (x.equals("igrac")) {
				System.out.print("Unesite ime i prezime: ");
				String ime = s.nextLine();
				System.out.print("Unesite JMBG: ");
				String jmbg = s.next();
				System.out.print("Unesite godinu rodjenja: ");
				int god = s.nextInt();
				System.out.print("Unesite broj dresa: ");
				int broj = s.nextInt();
				System.out.print("Unesite poziciju igraca: ");
				String pozicija = s.nextLine();
				System.out.print("Da li je igrac kapiten?(da/ne): ");
				String kapiten = s.next();
				boolean kap;
				if (kapiten.equals("da")) {
					kap = true;
				} else {
					kap = false;
				}

				Igrac a = new Igrac(ime, jmbg, god, broj, pozicija, kap);
				listaIgraca.add(a);
			} else if (x.equals("trener")) {
				System.out.print("Unesite ime i prezime: ");
				String ime = s.nextLine();
				System.out.print("Unesite JMBG: ");
				String jmbg = s.next();
				System.out.print("Unesite godinu rodjenja: ");
				int god = s.nextInt();
				System.out.print("Unesite godine iskustva: ");
				int godIskustva = s.nextInt();
				System.out.print("Unesite tip tenera: ");
				String tip = s.nextLine();

				Trener b = new Trener(ime, jmbg, god, godIskustva, tip);
				listaTrenera.add(b);
			} else {
				System.out.println("Pogresan unos.");
			}
			for (int i = 0; i < listaIgraca.size(); i++) {
				listaIgraca.get(i).print();
			}
			for (int i = 0; i < listaTrenera.size(); i++) {
				listaTrenera.get(i).print();
			}
		}

	}
}
