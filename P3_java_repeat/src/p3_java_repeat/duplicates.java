package p3_java_repeat;
import java.util.*;
public class duplicates {

	public static void main(String[] args) {
		int a[]= {3,3,2,2,4,4,5};
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
		if(!set.add(a[i])) {
			System.out.println(a[i]);
		}
		
	}

}
}
