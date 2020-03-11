package ykb.com.ykb.java.train;

public class Arac {
	private int kapiSayisi;
	private int hiz;
	protected int agirlik;
	int yukseklik;

	public Arac() {
		this.hiz = 100;
	}

	public Arac(final int kapiSayisi, final int hiz, final int agirlik, final int yukseklik) {
		super();
		this.kapiSayisi = kapiSayisi;
		this.hiz = hiz;
		this.agirlik = agirlik;
		this.yukseklik = yukseklik;
	}

	public void printArac() {
		long test = 100;
		System.out.println("Arac agirlik: " + this.agirlik + " kapiSayisi : " + this.kapiSayisi + " yukseklik : "
				+ this.yukseklik + " hiz : " + this.hiz);
		this.printArac2();
	}

	public void printArac2() {
		long abc = 120;

		System.out.println("abc : " + abc);

	}

	public int getKapiSayisi() {
		return this.kapiSayisi;
	}

	public void setKapiSayisi(final int kapiSayisi) {
		if (kapiSayisi > 8) {
			this.kapiSayisi = 8;
		} else {

			this.kapiSayisi = kapiSayisi;
		}
	}

	public int getHiz() {
		return this.hiz;
	}

	public void setHiz(final int hiz) {
		this.hiz = hiz;
	}

	@Override
	public String toString() {
		return "Arac [kapiSayisi=" + this.kapiSayisi + ", hiz=" + this.hiz + ", agirlik=" + this.agirlik
				+ ", yukseklik=" + this.yukseklik + "]";
	}

}
