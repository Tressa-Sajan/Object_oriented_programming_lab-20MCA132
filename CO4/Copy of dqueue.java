// p to d the addition and deletion of elements in dequeue

import java.util.ArrayDeque;
import java.util.Deque;

public class dqueue{
		public static void main(String[] jai)
		{
			Deque<Integer> deque=new ArrayDeque<>();
			deque.addFirst(1);
			deque.addLast(2);
			int first = deque.removeFirst();
			int last = deque.removeLast();
			System.out.println("First: "+first +" last: "+last);
		}
}





