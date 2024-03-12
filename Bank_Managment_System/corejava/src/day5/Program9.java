//Entered number table
package day5;
import java.util.Scanner;
public class Program9 {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int i=1;
		
		
		while(i<=10)
		{
		
			
			System.out.println(num + "*" + i +"="+ num*i);
			i++;
		
		}
	
		
	
}
}