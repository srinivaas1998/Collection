import java.util.*;  
class HashMapComparison{  
 public static void main(String args[]){  
Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(1,"A");    
      map.put(3,"B");    
      map.put(2,"C");   
         
      map.entrySet()  
        
      .stream()  
      .sorted(Map.Entry.comparingByKey())  
      .forEach(System.out::println);  
 }  
}
//Output
/*
1=A
2=C
3=B
*/
