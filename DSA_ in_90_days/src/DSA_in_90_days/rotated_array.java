package DSA_in_90_days;
import java.util.*;
public class rotated_array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int pivot=in.nextInt();
		for(int i=pivot;i<a.length;i++) {
			a1.add(a[i]);
		}
		for(int i=0;i<pivot;i++) {
			a1.add(a[i]);
		}
		for(int k=0;k<a1.size();k++) {
			System.out.print(a1.get(k)+" ");
		}
	

}
}
