package d_10_1_2022;

public class FacebookPost {
	String imeIPrezime;
	String imeProfilaGdeJePost;
	String tekst;
	int lajkovi;
	int deljenja;

	public void like() {
		this.lajkovi = this.lajkovi + 1;
	}

	public void dislike() {
		if (this.lajkovi - 1 > 0) {
			this.lajkovi = this.lajkovi - 1;
		} else {
			this.lajkovi = 0;
		}

	}

	public void share() {
		this.deljenja = this.deljenja + 1;
	}

	public void print() {
		System.out.println(this.imeIPrezime + ">>>" + this.imeProfilaGdeJePost);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.lajkovi + " | Shares " + this.deljenja);
	}
}
