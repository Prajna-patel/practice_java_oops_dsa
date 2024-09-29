package arrayandarraylist;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter");
		 for(int i=0;i<n;i++) {
			 a[i]=in.nextInt();
		 }
		 for(int i=0;i<a.length-1;i++) {
			 for(int j=i+1;j>0;j--) {
				 if(a[j-1]>a[j]) {
					 int temp=a[j];
					 a[j]=a[j-1];
					 a[j-1]=temp;
				 }
				 else {
					 break;
				 }
			 }
		 }
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i]+" ");
		 }
			 

	}

}
