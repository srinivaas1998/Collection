import java.util.*; 
public class ArrayDeque { 
    public static void main(String[] args) 
    { 
        
        Deque<String> dq  = new ArrayDeque<String>();  
        dq.add("And"); 
        dq.addFirst("Dare"); 
        dq.addLast("Do");
        dq.add("is");
        dq.add("our");
        dq.addLast("Motto");
        System.out.println(dq); 
        System.out.println(dq.pop()); 
        System.out.println(dq);
        System.out.println(dq.poll()); 
        System.out.println(dq);
        System.out.println(dq.pollFirst()); 
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);
    } 
}

//Output
/*
[Dare, And, Do, is, our, Motto]
Dare
[And, Do, is, our, Motto]
And
[Do, is, our, Motto]
Do
[is, our, Motto]
Motto
[is, our]
*/
