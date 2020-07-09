
import java.util.*;
enum days{
	Monday,Tuesday,Wednesday
}

class EnumSet1{
	public static void main(String[] args) {
		Set<days> set=EnumSet.of(days.Monday);
		System.out.println(set);
		Set<days> set1=EnumSet.allOf(days.class);
		System.out.println(set1);
		Set<days> set2=EnumSet.noneOf(days.class);
		System.out.println(set2);
	}
}



//Output
/*
[Monday]
[Monday, Tuesday, Wednesday]
[]
*/
