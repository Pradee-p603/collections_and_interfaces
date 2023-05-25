package CollectionFramwork;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		
		Queue q = new LinkedList();
		q.offer("pradeep");
		q.offer(12);
		q.offer(true);
		q.offer("adesh");
		//System.out.println(q);
		//System.out.println(q.poll());
		//(remove the head of the queue)
		//System.out.println(q.element());
		//print the first value
//		q.add("patel");
//		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.peek());
	}

}
