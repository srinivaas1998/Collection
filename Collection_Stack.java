import java.util.*;  
public class Collection_Stack{  
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
}  
}



/Output
/*
Ayush
Garvit
*/
