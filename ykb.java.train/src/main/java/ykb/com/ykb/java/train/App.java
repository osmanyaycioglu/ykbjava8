package ykb.com.ykb.java.train;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("test");
		int a = 100;
		System.out.println("my value : " + a);
		
		Arac arac = new Arac(); 
		
		System.out.println(
				"Arac agirlik: " + arac.agirlik + 
				" kapiSayisi : " + arac.getKapiSayisi() + 
				" yukseklik : " + arac.yukseklik)
		;
		
		arac.printArac();
		

	}
}
