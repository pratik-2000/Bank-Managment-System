//Sum of entered number  1to entered number
package day6;
import java.util.Scanner;
public class Program5 {
	public static void main (String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++ )
		{
			sum+=i;
						
		}
		
		System.out.println(sum);

	}

}
