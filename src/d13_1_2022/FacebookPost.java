package d13_1_2022;

public class FacebookPost {
	private String imeIPrezime;
	private String vlasnikZida;
	private String post;
	private int brojLajkova;
	private int brojDeljenja;

	public FacebookPost(String imeIPrezime, String vlasnikZida, String post) {
		this.imeIPrezime = imeIPrezime;
		this.vlasnikZida = vlasnikZida;
		this.post = post;
	}

	public String getImeIPrezime() {
		return this.imeIPrezime;
	}

	public void setImeIPerzime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getVlasnikZida() {
		return this.vlasnikZida;
	}

	public void setVlasnikZida(String vlasnikZida) {
		this.vlasnikZida = vlasnikZida;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public void povecajLajk() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void smanjiLajk() {
		if (this.brojLajkova > 0) {
			this.brojLajkova = this.brojLajkova - 1;
		} else {
			this.brojLajkova = 0;
		}
	}

	public void povecajShare() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}

	public void print() {
		System.out.println(this.imeIPrezime + ">>>>" + this.vlasnikZida);
		System.out.println(this.post);
		System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
	}
}
