package DSA_in_90_days;
import java.util.*;
public class Arrays_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int m=in.nextInt();
		int t=m-1;
		int i=0;
		for(i=0;i<a.length-m+1;i++){
			int diff=a[t]-a[i];
			System.out.println(diff +" "+i+" "+t);
			a1.add(diff);
			t=t+1;	
			}
		int min=0;
		for(int k=0;k<a1.size();i++) {
			int ele=a1.get(i);
			if (ele<min) {
				min=ele;
			}
			
		}
		System.out.println(min);
		}

	}


