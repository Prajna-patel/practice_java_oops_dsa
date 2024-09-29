package algorithms;
import java.util.*;
public class Knap_sack {
	public static int partition(double a[],double b[],double rat[],int p,int n)
	{
		double x=rat[n];
		int i=p-1;
		double temp;
		for(int j=p;j<n;j++)
		{
			if(rat[j]<=x)
			{
				i=i+1;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				temp=rat[i];
				rat[i]=rat[j];
				rat[j]=temp;
			}
		}
		temp=a[i+1];
		a[i+1]=a[n];
		a[n]=temp;
		temp=b[i+1];
		b[i+1]=b[n];
		b[n]=temp;
		temp=rat[i+1];
		rat[i+1]=rat[n];
		rat[n]=temp;
		return(i+1);
	}
	public static void qs(double a[],double b[],double rat[],int p,int n)
	{
		int q;
		if(p<n)
		{
			q=partition(a,b,rat,p,n);
			qs(a,b,rat,p,q-1);
			qs(a,b,rat,q+1,n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int i,n;
		System.out.println("enter the number of items");
		n=sc.nextInt();
        double v[]=new double[n];
        double wt[]=new double[n];
        double ratio[]=new double[n];
        double max;
        System.out.println("enter value of weight and value  of each element respectively");
        for(i=0;i<n;i++)
        {
        	v[i]=sc.nextDouble();
        	wt[i]=sc.nextDouble();
        	ratio[i]=v[i]/wt[i];
        			}
        System.out.println("enter the maximum value");
        max=sc.nextDouble();
        qs(v,wt,ratio,0,n-1);
        System.out.println("value\t wweight\t ratio");
        for(i=0;i<n;i++)
        {
        	System.out.println(v[i]+"\t"+wt[i]+"\t"+ratio[i]+"\n");
        }
        double val=0.0;
        for(i=n-1;i>0;i--)
        {
        	if(max>0 &&wt[i]<max) {
        		val=val+v[i];
        		max=max-wt[i];
        	}
        	else if(max>0)
        	{
        		val=val+((v[i]*max)/wt[i]);
        		max=max-wt[i];
        	}
        }
        System.out.println("maximum value is "+val);
	}

}

	

