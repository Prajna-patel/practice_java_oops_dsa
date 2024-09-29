package DSA_in_90_days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int m=in.nextInt();
		int i=0;
		int t=i+m-1;
		int min=0;
		for(i=0;i<a.length-m+1;i++){
			int diff=a[t]-a[i];
			if(min<diff) {
				min=diff;
			}
			t=t+1;	
			}
		
		System.out.println(min);

	}

}
