import java.util.*;
import static java.lang.System.out;

public class ExampleQueues {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		out.println(queue.offer(10));	// true
		out.println(queue.offer(4));	// true
		out.println(queue.peek());	// 10
		out.println(queue.poll());	// 10
		out.println(queue.poll());	// 4
		out.println(queue.peek());	// null
	}
}
