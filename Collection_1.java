import java.util.*;  
class Collection_1{  
public static void main(String args[]){  
LinkedList<String> list=new LinkedList<String>();  
list.add("Ravi");  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
} 
/Output
/*
Ravi
Vijay
Ravi
Ajay
*/
