//14,28.Program to demonstrate the addition and deletion of elements in deque
import java.util.*;
import java.util.Deque;
public class dq{
	public static void main (String [] args){
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(11);
		deque.addLast(99);
		int frist = deque.removeFirst();
		int last = deque.removeLast();
		System.out.println("Frist : " +	frist + "\n"+"Last " + last);	
		}	
}
