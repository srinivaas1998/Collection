import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("Ram");
list.add("Ramani");  
list.add("Ravi");  
list.add("Ajay");  
  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
} 
//Output
*
Ram
Ramani
Ravi
Ajay
*/
