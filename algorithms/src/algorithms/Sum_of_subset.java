package algorithms;
import java.util.*;
public class Sum_of_subset {
static int c=0;
	public static void main(String[] args) {
		int w[]=new int[10];
		int n, d, i, sum=0;
		int x[]=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no.of elements:");
		 n=in.nextInt();
		 System.out.println("enter the elements in increasing order:");
		 for(i=0;i<n;i++)
		 w[i]=in.nextInt();
		 System.out.println("enter the value of d:");
		 d=in.nextInt();
		 for(i=0;i<n;i++) {
			 sum=sum+w[i];
		 }
		 System.out.println("Sum="+sum);
		 if(sum<d||w[0]>d) {
			 System.out.println("subset is not possible!");
			 
		 }
		 subset(0,0,sum,x,w,d);
		 if (c==0) {
			 System.out.println("subset not possible");
		 }
		 
		
	}
	static void subset(int cs,int k,int sum,int x[],int w[],int d) {
		if(cs+w[k]==d) {
			c++;
			System.out.print("\n Solution"+c+"is {");
			for(int i=0;i<=k;i++) {
				if(x[i]==1) {
					System.out.print(w[i]+" ");

				System.out.print("}");
				
			}

			else if((cs + w[k]+w[k+1]<=d))
				subset(cs+w[k],k+1,sum-w[k],x,w,d);
				if((cs+sum-w[k])>=d &&(cs+w[k+1])<=d) {
					x[k]=0;
					subset(cs,k+1,sum-w[k],x,w,d);
				}
		}
		
	}

}
}
