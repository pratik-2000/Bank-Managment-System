//wap to print entered name N number of times
package day5;
import java.util.Scanner;

public class Program8 {
	public static void main(String []args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		
		String name=s.nextLine();
		System.out.println("ENter number ");
		int num=s.nextInt();
		int i=1;
		while (i<=num)
		{
			System.out.println(name);
			i++;
		}
	}

}
