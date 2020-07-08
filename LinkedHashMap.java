
import java.util.*;
class Book{
	String name;
	int id;
	Book(String name,int id){
		this.name=name;
		this.id=id;
	}
}
class LinkedHashMap{
	public static void main(String[] args) {
		LinkedHashMap<Integer,Book> m=new LinkedHashMap<>();
		Book b1=new Book("Jungle Book",1);
		Book b2=new Book("Jungle Life",2);
		m.put(1,b1);
		m.put(2,b2);
	
		  for(Map.Entry<Integer, Book> entry:m.entrySet()){    
		        int key=entry.getKey();  
		        Book b=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name);   
		    } 
		
		
		
	}	
}
//Output
/*
1 Details:
1 Jungle Book
2 Details:
2 Jungle Life
 
 */

