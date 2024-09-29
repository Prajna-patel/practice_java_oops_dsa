package DSA_in_90_days;

import java.util.*;

public class Arrays_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int i=0;
		int j=n-1;
		for ( i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j=j-1;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
