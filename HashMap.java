import java.util.*; 

public class HashMap { 
    public static void main(String[] args) 
    { 
    	Map<Integer,String> l=new HashMap<Integer,String>();
    	l.put(1,"Jungle Book");
        l.put(13,"Jungle Tantra");
        l.put(100,"3 Idiots");
        
        for(Map.Entry m:l.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
        }
    } 
}

//Output
/*
1 Jungle Book
13 Jungle Tantra
100 3 Idiots
 */
