package algorithms;
import java.util.*;
public class Practice03 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number of items:");
		int n=in.nextInt();
		double v[]=new double[n];
		double wt[]=new double[n];
		double ratio[]=new double[n];
		double max;
		for(int i=0;i<n;i++) {
			System.out.println("enter the value:");
			v[i]=in.nextDouble();
			System.out.println("enter the weight:");
			wt[i]=in.nextDouble();
			ratio[i]=v[i]/wt[i];
		}
		System.out.println("enter the maximum value");
        max=in.nextDouble();
        qs(v,wt,ratio,0,n-1);
        System.out.println("value\t wweight\t ratio");
        for(int i=0;i<n-1;i++)
        {
        	System.out.println(v[i]+"\t"+wt[i]+"\t"+ratio[i]+"\n");
        }
        Double value=0.0;
        for(int i=0;i<n-1;i++) {
        	if(max>0 && wt[i]<max) {
        		value=value+v[i];
        		max=max-wt[i];
        	}
        	else if(max>0) {
        		value=value+((max/wt[i])*v[i]);
        		max=max-wt[i];
        	}
        }
        System.out.println(value);

	}

	public static void qs(double[] v, double[] wt, double[] ratio, int p, int r) {
		int p1;
		if(p<r) {
			p1=partion(v,wt,ratio,p,r);
			qs(v,wt,ratio,p,p1-1);
			qs(v,wt,ratio,p1+1,r);
			
			
		}
		
	}

	public static int partion(double[] v, double[] wt, double[] ratio, int p, int r) {
	int i;
	i=p-1;
	double x=ratio[r];
	double temp;
	for(int j=0;j<r;j++) {
		if(ratio[j]<=x) {
			temp=v[i];
			v[i]=v[j];
			temp=wt[i];
			wt[i]=wt[j];
			temp=wt[j];
			temp=ratio[i];
			ratio[i]=ratio[j];
			ratio[j]=i;
					
		}
	}
	temp=v[i+1];
	v[i+1]=v[r];
	temp=wt[i+1];
	wt[i+1]=wt[r];
	temp=wt[r];
	temp=ratio[i+1];
	ratio[i+1]=ratio[r];
	ratio[r]=i+1;
	
		return i+1;
	}

}
