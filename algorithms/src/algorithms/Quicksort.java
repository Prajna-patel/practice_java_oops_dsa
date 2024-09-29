package algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=in.nextInt();
		int[] a=new int[n];
		Random random=new Random(); 
		for(int i=0;i<n;i++) {
			a[i]=random.nextInt(50);
		}
		int p=0,r=a.length-1;
		System.out.println("Array before sorting:");
		System.out.println(Arrays.toString(a));
		quick(a,p,r);
		System.out.println("Array after sorting:");
		System.out.println(Arrays.toString(a));

	}

	public static void quick(int[] a, int p, int r) {
		if(p<r) {
			int p1= partition(a,p,r);
			quick(a,p,p1-1);
			quick(a,p1+1,r);
		}
		
	}

	public static int partition(int[] a, int p, int r) {
		int i=p-1;
		int x=a[r];
		for(int j=p;j<r;j++) {
			if(a[j]<x) {
				i=i+1;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		
		return i+1;
	}

}
