//Exception handling

package day13;

public class Program1 {
	public static void main(String []args) {
		
		int a=10;
		int b=0;
		
		try {
			
			float c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally");
		}
		
		System.out.println("after finally");
	}

}
