package algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice04 {

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
		Practice04 ob=new Practice04();
		ob.mergeSort(a,0,a.length-1);
		System.out.println("array after sorting:");
		System.out.println(Arrays.toString(a));
	}
void mergeSort(int[] a,int l,int r) {
		if(l<r) {
			
		int mid=(l+r)/2;
		mergeSort(a,l,mid);
		mergeSort(a,mid+1,r);
		merge(a,l,mid,r);
		
		}
	}
void merge(int[] a, int l, int mid, int r) {
		int n1=l-mid+1;
		int n2=r-mid;
		 
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=a[l+i];
		}
		for(int i=0;i<n1;i++) {
			R[i]=a[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				a[k]=L[i];
				i++;
			}
			else {
				
					a[k]=R[i];
					j++;
				}
			}
		while(i<n1) {
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=R[i];
			j++;
			k++;
		}
		}
		
		
	}


