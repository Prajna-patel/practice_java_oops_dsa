package DSA_in_90_days;

import java.util.*;

public class Arrays_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		boolean ans=true;
		Arrays.sort(a);
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				ans=false;
				break;
			}
		}
		System.out.println(ans);

	}

}
