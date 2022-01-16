package d14_1_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// Scanner s=new scanner (System.in);
		//int god.izd=s.nextInt ();
		Autor nabokov = new Autor("Vladimir Nabokov");
		Knjiga lolita = new Knjiga("Lolita", "2134-2333-2111", 2017, nabokov);
		Knjiga ocajanje = new Knjiga("Ocajanje", "2134-4553-6465", 2016, nabokov);
		Knjiga dar = new Knjiga("Dar", "3425-4434-9984", 2017, nabokov);

		Autor dostojevski = new Autor("Fjodor Mihajlovic Dostojevski");
		Knjiga ponizeni = new Knjiga("Ponizeni i uvredjeni", "2333-1234-4534", 2014, dostojevski);
		Knjiga karamazovi = new Knjiga("Braca Karamazovi", "2333-14-4534", 2014, dostojevski);
		Knjiga dusi = new Knjiga("Zli dusi", "2333-1234-4534", 2014, dostojevski);
		Knjiga kockar = new Knjiga("Kockar", "2333-1234-4534", 2014, dostojevski);
		Knjiga idiot = new Knjiga("Idiot", "2333-1234-4534", 2014, dostojevski);
		Knjiga zlocinIKazna = new Knjiga("Zlocin i kazna", "2333-1234-4534", 2014, dostojevski);

		Autor tolkin = new Autor("J.R.R. Tolkin");
		Knjiga gospodarP1 = new Knjiga("Gospodar prstenova - Druzina prstena", "3213", 2011, tolkin);
		Knjiga gospodarP2 = new Knjiga("Gospodar prstenova - Dve kule", "3245", 2011, tolkin);
		Knjiga gospodarP3 = new Knjiga("Gospodar prstenova - Povratak kralja", "5356", 2011, tolkin);
		Knjiga hobit = new Knjiga("Hobit", "5346", 2011, tolkin);
		Knjiga silmarilion = new Knjiga("Silmarilion", "7554", 2011, tolkin);
		Knjiga pismaOdDedaMraza = new Knjiga("Pisma od Deda Mraza", "4556", 2021, tolkin);

		Autor igo = new Autor("Viktor Igo");
		Knjiga jadnici = new Knjiga("Jadnici", "54576", 2020, igo);
		Knjiga crkvaUParizu = new Knjiga("Bogorodicina crkva u Parizu", "5367", 2019, igo);

		Knjiga simaKrojac = new Knjiga("Prirodnji zakoni Sime krojaca", "7973", 2014);

		Autor mekalers = new Autor();
		Knjiga usamnjeniLovac = new Knjiga("Srce je usamljeni lovac", "3145-5366-0984", 2018, mekalers);
		
		ponizeni.print();
		
		simaKrojac.print();
		
		usamnjeniLovac.print();
	}

}
