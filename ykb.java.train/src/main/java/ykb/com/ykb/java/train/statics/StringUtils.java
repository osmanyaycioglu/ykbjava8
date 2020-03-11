package ykb.com.ykb.java.train.statics;

public class StringUtils {
	
	public static boolean isEmpty(String str) {
		return str == null || str.isEmpty();
	}
	
	public static String[] split(String str,String spStr) {
		String[] split = str.split(spStr);
		return split;
	}
	
}
