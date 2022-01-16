package d14_1_2022;

public class Autor {
	private String imeIPrezime;

	public Autor (String imeIprezime) {
		this.imeIPrezime=imeIprezime;
	}
	public Autor() {
		
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getImeIPrezime() {
		return this.imeIPrezime;
	}

	public void print() {
		System.out.println(this.imeIPrezime);
	}
}
