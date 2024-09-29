package p3_java_repeat;

import java.util.*;

public class amstrong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int num=n;
        int rev=0;
        while(n>0) {
        	int temp=n%10;
        	rev=rev*10+temp;
        	n=n/10;
        	}
        if(rev==num) {
        	System.out.println("Yes!");
        	
        }
        else {
        	System.out.println("No!");
        }

	}

}
