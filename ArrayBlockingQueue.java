import java.util.*;  
import java.util.concurrent.ArrayBlockingQueue;
public class ArrayBlockingQueue{  
	public static void main(String args[]){  
		
		ArrayBlockingQueue<String> q = new ArrayBlockingQueue<String>(5);
		q.offer("Ayush");  
		q.offer("Garvit");  
		q.offer("Amit");
		q.offer("Amit");
		q.offer("Amit");
		
		q.poll();
		
		q.offer("Ram");
		q.offer("Ramani");
		System.out.println(q.peek());
		System.out.println(q);  
		
}  
}

//Output
/*
Garvit
[Garvit, Amit, Amit, Amit, Ram]

*/
