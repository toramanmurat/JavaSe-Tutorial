package _68.queue;

import java.util.PriorityQueue;

public class PqTest {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(100);
		pq.add(10);
		pq.offer(50);
		pq.add(1000);

		pq.remove(1);

		Integer firstElement = pq.peek();
		// peek metodu PQ ten ilk elemani dondurur fakat bu elemani silmez.

		System.out.println(firstElement);
		pq.peek();
		pq.peek();
		pq.peek();
		pq.peek();
		
		System.out.println(firstElement);

		Integer firstElementPoll = pq.poll();
		// poll ise elemani siler!
		System.out.println("after poll");
		System.out.println(firstElementPoll);

		System.out.println(pq.peek());

		int size = pq.size();

		for (int i = 0; i < size; i++) {
			System.out.println(pq.poll());
		}

		System.out.println();

		System.out.println(pq.peek());
	}

}
