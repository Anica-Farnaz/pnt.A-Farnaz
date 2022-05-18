package datastructure;
import java.util.*;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(67);
		queue.add(90);
		queue.add(21);
		queue.add(78);
		queue.add(98);
		System.out.println(queue);
		queue.remove(98);
		System.out.println(queue);
		queue.peek();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);

	}

}
