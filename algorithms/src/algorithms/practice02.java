package algorithms;
import java.util.*;
public class practice02 {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=in.nextInt();
		int a[]=new int[n];
		Random random=new Random();
		for(int i=0;i<n;i++) {
			a[i]=random.nextInt(50);
		}
		System.out.println("array before sorting:");
		System.out.println(Arrays.toString(a));
		quick_sort(a,0,n-1);
		System.out.println("array after sorting:");
		System.out.println(Arrays.toString(a));
		
	}

	public static void quick_sort(int[] a, int i, int j) {
		
	int p;
		if(i<j) {
			p=partion(a,i,j);
			quick_sort(a,i,p-1);
			quick_sort(a,p+1,j);
		}
		
	}

	public static int partion(int[] a, int i, int j) {
		int p=i-1;
		int x=a[j];
		for(int k=i;k<j;k++) {
			if(a[k]<x) {
				p=p+1;
				int temp=a[p];
				a[p]=a[k];
				a[k]=temp;
			}
		}
		int temp=a[p+1];
		a[p+1]=a[j];
		a[j]=temp;
		return p+1;
	}

}
