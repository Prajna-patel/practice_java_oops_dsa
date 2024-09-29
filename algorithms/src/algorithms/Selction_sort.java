package algorithms;
import java.util.*;
public class Selction_sort {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int n,i,j,temp,min;
		System.out.println("enter the size of the array:");
		n=in.nextInt();
		int[] a=new int[n];
		Random random=new Random(); 
		for(i=0;i<n;i++) {
			a[i]=random.nextInt(50);
		}
		System.out.println("Array before sorting:");
		System.out.println(Arrays.toString(a));
		for(i=0;i<n;i++) {
			min=i;
			for(j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			if(min!=i) {
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
