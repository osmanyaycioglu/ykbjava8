package ykb.com.ykb.java.train.loops;

public class LoopMain {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
			if (i == 8) {
				break;
			}
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println("While : " + i);
			i++;
		}
		
		int y = 0;
		do {
			System.out.println("y : " + y);
		} while (y > 0);
		
		int z = 0;
		loop1:while (true) {
			loop2:while (true) {
				System.out.println(z);
				z++;
				if (z == 130) {
					break loop1;
				}
			}
		}
	}
}
