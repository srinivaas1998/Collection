
import java.util.*;
class HashMapMod{
	public static void main(String [] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(1,"d");
		for(Map.Entry m:map.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }
		System.out.println("");
		map.replace(2,"bb");
		map.remove(3);
		map.put(4,"aa");
		map.put(5,"ba");
		map.put(5,"");
		map.put(1,"");
		map.putIfAbsent(6,"aa");
	
		System.out.println("");
		for(Map.Entry m:map.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }
	
	}
}

//Output
/*
Initial
1 d
2 b
3 c
After Manipulation 

1 
2 bb
4 aa
5 
6 aa
 */
