// sum of even and odd numbers between 1 to 20
package day6;

public class Program7 {
	public static void main(String []args) {
		int sum=0;
		int osum=0;
		for(int i=1;i<=20;i++) {
			
			if (i%2==0)
			{
			
				 sum=(sum+i);
				
				
			}
			else if(i%2!=0) {
				osum=osum+i;
			}
			
		}
		System.out.println( "sum of even numbers:"+ sum);
		System.out.println( "sum of odd numbers:"+ osum);
	}

}
