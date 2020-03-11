package ykb.com.ykb.java.train.collections;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

public class QueueMain {
	public static void main(final String[] args) {
		Queue<String> strQueue = new ArrayBlockingQueue<>(1_000);
		BlockingQueue<String> strBlockingQueue = new ArrayBlockingQueue<>(1_000);
		Deque<String> strDequeue = new ConcurrentLinkedDeque<>();

		boolean offer = strQueue.offer("osman1");

		strQueue.add("osman");
		strQueue.peek();

		String poll = strQueue.poll();
		try {
			strBlockingQueue.offer("osman2", 1, TimeUnit.MINUTES);
			strBlockingQueue.put("osman3");
			String poll2 = strBlockingQueue.poll(100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		try {
			String take = strBlockingQueue.take();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		strDequeue.addFirst("osman1");
		strDequeue.pollLast();

	}
}
