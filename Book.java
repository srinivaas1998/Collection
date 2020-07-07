import java.util.*; 



class Book{
	String name;
	int id;
	Book(String n,int i){
		name=n;
		id=i;
		
	}
}

public class Collection_1 { 
    public static void main(String[] args) 
    { 
    	List<Book> l=new ArrayList<Book>();
    	Book b1=new Book("Jungle Book",1);
    	Book b2=new Book("Jungle Tantra",13);
    	Book b3=new Book("3 Idiots",100);
        l.add(b1);
        l.add(b2);
        l.add(b3);
        
        for(Book b:l){  
            System.out.println(b.id+" "+b.name);  
        }
    } 
}

//Output
/*
1 Jungle Book
13 Jungle Tantra
100 3 Idiots
 */
