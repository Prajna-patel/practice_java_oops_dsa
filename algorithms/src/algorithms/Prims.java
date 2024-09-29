package algorithms;
import java.util.*;
public class Prims {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number of vertices:");
		int n=in.nextInt();
		int[][] cost=new int[10][10];
		int mincost=0;
		System.out.println("enter the cost matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				cost[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(cost[i][j]+" ");
			}
			System.out.println();
		}
		mincost=prims(cost,n,mincost);
		System.out.println("The minimum spanning tree cost is");
		System.out.println (+mincost);

	}

	private static int prims(int[][] cost, int n, int mincost) {
		int[] nearV=new int[10];
		int[][] t=new int[10][3];
		int u=0,i,j,k;
		for(i=2;i<n;i++) 
			nearV[i]=0;
			nearV[0]=1;
		
		
		for(i=0;i<n;i++) {
			int min=999;
			for(j=0;j<n;j++) {
				if(nearV[j]!=0 && cost[j][nearV[j]]<min) {
					min=cost[j][nearV[j]];
					u=j;
				}
			}
			t[i][1]=u;
			t[i][2]=nearV[u];
			mincost+=min;
			nearV[u]=0;
			for(k=1;k<=n;k++) {
				if(nearV[k]!=0 && cost[k][nearV[k]]>cost[k][u]) {
					nearV[k]=u;
				}
			}
			System.out.println(i+") Minimum edge is ("+t[i][1]);
			System.out.println(","+t[i][2]+") and its cost is :"+min);
		}
		
		
		
		return mincost;
	}

}
