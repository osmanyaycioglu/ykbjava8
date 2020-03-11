package ykb.com.ykb.java.train.exceptions;

import org.omg.CosNaming.NamingContextPackage.AlreadyBound;

public class MyExceptionTest {
	
	public String method1(String str) throws MyException,AlreadyBound {
		char charAt = str.charAt(0);
		if (charAt == 'a') {
			throw new AlreadyBound("deneme");
		}
		if ("osman".equals(str)) {
			throw new MyException("Osman girilemez");
		}
		return "Hello " + str;
	}
	
	public String method2(String str)  {
		if ("osman".equals(str)) {
			throw new MyRuntimeException("Osman girilemez");
		}
		return "Hello " + str;
	}
	
	public void test() {
		try {
			method1("ali");
			System.out.println("ali");
			return;
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}
	}

}
