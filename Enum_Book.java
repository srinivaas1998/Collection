import java.util.*;    
class Book {    
int id;    
String name;    
public Book(int id, String name) {    
    this.id = id;    
    this.name = name;    
    }    
}    
public class Enum_Book {   
 
    public enum Key{  
           One, Two, Three  
           };  
public static void main(String[] args) {    
    EnumMap<Key, Book> map = new EnumMap<Key, Book>(Key.class);  
      
    Book b1=new Book(101,"Let us C");    
    Book b2=new Book(102,"Data Communications & Networking");    
    Book b3=new Book(103,"Operating System");    
     
       map.put(Key.One, b1);  
       map.put(Key.Two, b2);  
       map.put(Key.Three, b3);  
    
       System.out.println(map.keySet());
       
       
       for(Map.Entry<Key, Book> entry:map.entrySet()){      
            Book b=entry.getValue();    
            System.out.println(b.id+" "+b.name);     
        }       
}    
}  




//Output
/*
[One, Two, Three]
101 Let us C
102 Data Communications & Networking
103 Operating System

 */
