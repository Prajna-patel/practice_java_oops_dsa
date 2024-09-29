package algorithms;

import java.util.Scanner;
public class Bubble_sort {

	public static void main(String[] args) {
		String bookname;
		float price=0;
		Scanner in = new Scanner(System.in);
		int n1=in.nextInt();
		Bookfair[] b=new Bookfair[n1];
		for (int i=0;i<b.length;i++) {
			b[i]=new Bookfair();
			System.out.println("enter the details of "+i+1+"record");
			System.out.println("enter the bookname:");
			bookname=in.next();
			System.out.println("enter the price:");
			price=in.nextFloat();
 
			b[i].read_data(bookname,price);
		}
		
		for(int i=0;i<b.length;i++) {
			b[i].caluclate(price);
			System.out.println("BOOKPRICE\tPrice\tdiscount\t");
			b[i].display_data();
		}

}
}
class Bookfair{
	String bookname;
	float price;
	float discount;
	Bookfair(){
		bookname="no value";
		price=0;
		discount=1;
	}
	public void read_data(String n,float p) {
		bookname=n;
		price=p;
	}
	
	public void caluclate(float price2) {
		float d;
		if(price2<=1000) {
			discount=(2/100)*price2;
			System.out.println(discount);
		}
		else if(price2>1000 && price2<=3000) {
			discount=(10/100)*price2;
			System.out.println(discount);
		}
		else {
			discount=(15/100)*price2;
			System.out.println(discount);
		}
		
	}
	public void display_data() {
		System.out.println(bookname+"\t"+price+"\t"+discount+"\t");
}

	}
