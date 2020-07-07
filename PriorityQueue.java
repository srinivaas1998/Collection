import java.util.*;  

public class PriorityQueue{  
	public static void main(String args[]){  
		Queue<String> q = new PriorityQueue<String>();
		
		q.add("Ayush");  
		q.add("Garvit");  
		q.add("Amita");
		q.add("Anit");
		q.add("Vinit");
		q.add("Amita Arora");
		q.poll();
		
		System.out.println(q.peek());
		System.out.println(q);  
		Iterator<String> itr=q.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		} 
}  
}

//Output
/*
Amita Arora
[Amita Arora, Anit, Ayush, Garvit, Vinit]
Amita Arora
Anit
Ayush
Garvit
Vinit

*/
