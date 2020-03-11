package ykb.com.ykb.java.train.ops;

public class OpsMain {
	public static void main(String[] args) {
		int av = 100;
		av += 10;
		av -= 50;
		av <<= 1;
		av >>= 1;
		
		if (av > 10) {
			System.out.println("10 dan büyük ");
		} else {
			System.out.println("10 dan büyük değil");
		}
		if (av >= 100 && av > 10) {
			
		}
			
		if (av >= 100 || av > 10) {
			
		} else if (av > 50) {
			
		} else if (av != 9) {
			
		} else {
			
		}
		
		if (av == 100) {
			System.out.println("100 ");
		}
		Integer o = 100;
		Integer z = 100;
		if (o == z) {
			System.out.println("eşit");
		}
		MyInteger mo = new MyInteger(100);
		MyInteger mz = new MyInteger(100);
		if (mo == mz) {
			System.out.println("MyInteger eşit");
		} else {
			System.out.println("MyInteger eşit değil");
		}

		if (mo.equals(mz)) {
			System.out.println("MyInteger eşit");
		} else {
			System.out.println("MyInteger eşit değil");
		}
	}
}
