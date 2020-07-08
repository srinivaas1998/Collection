import java.util.*;  
class List_to_Set{  
 public static void main(String args[]){  
   ArrayList<String> list=new ArrayList<String>();  
           list.add("Ravi");  
           list.add("Vijay");  
           list.add("Ajay");
           list.add("Ajay");//Even though list allowes duplicate once it is added to set it is not added. 
           System.out.println(list);
           HashSet<String> set=new HashSet(list);  
           set.add("Gaurav");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 } 
} 


//Output
/*
[Ravi, Vijay, Ajay, Ajay]
Vijay
Ravi
Gaurav
Ajay
 */

