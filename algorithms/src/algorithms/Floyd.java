package algorithms;

import java.util.*;

public class Floyd {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number of vertices:");
		int n=in.nextInt();
		int[][] a=new int[n][n];
		int mincost=0;
		System.out.println("enter the cost matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		floyd(a,n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();

	}
	}

	private static void floyd(int[][] a, int n) {
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=min(a[i][j],a[i][k]+a[k][j]);
				}
			}
		}
		
	}

	private static int min(int i, int j) {
		if(i>j)
			return j;
		else
			return i;
	}

}
