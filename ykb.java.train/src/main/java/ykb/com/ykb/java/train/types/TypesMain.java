package ykb.com.ykb.java.train.types;

public class TypesMain {
	public static void main(String[] args) {
		int iVAl = 1000000;
		
		Integer io1 = new Integer(1000000);
		Integer io2 = 1000000;
		int imaxVAl = Integer.MAX_VALUE;
		System.out.println("MAX Integer : " + imaxVAl + " MIN : " + Integer.MIN_VALUE) ;
		
		int imaxVAl1 = Integer.MAX_VALUE + 18;
		System.out.println("After MAX : " + imaxVAl1 ) ;
		
		long lVal = 1_000_000_000_000L;
		System.out.println("MAX Integer : " + Long.MAX_VALUE + " MIN : " + + Long.MIN_VALUE) ;
		
		short sval = 10;
		Short so = 10;
		Short so2 = new Short((short)20);
		
		byte bval = 20;
		Byte bo = 20;
		
		float fval = 10.2F;
		Float float1 = new Float(10.3);
		
		double dval = 10.5;
		Double double1 = new Double(10.5);
		
		char c = 'C';
		Character character = new Character('C');
		
		String str = "osman";
		// Yanlış
		String str1 = new String ("osman");
		
		String str2 = "osman" + lVal + " test";
		for (int i = 0; i < 10; i++) {
			str2 += " devam";
		}
		
		StringBuilder builder = new StringBuilder(100);
		builder.append("osman");
		builder.append(lVal);
		builder.append(" test");
		for (int i = 0; i < 10; i++) {
			builder.append(" devam");
		}
		
		
	}
}
