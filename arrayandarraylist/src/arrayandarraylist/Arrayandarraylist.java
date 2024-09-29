package arrayandarraylist;
import java.util.*;
import java.io.*;
public class Arrayandarraylist {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		 for(int i=1;i<=n;i++) {
			 a[i]=in.nextInt();
		 }
		int product=1;
		int max=a[0]*a[1];
		for(int i=1;i<a.length;i++) {
			product=product*(a[i]*a[i+1]);
			if((a[i]*a[i+1])>max) {
				max=a[i]*a[i+1];
			}
		
		}
		System.out.println(max);
	}
}