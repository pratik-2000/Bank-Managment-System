//Multiple catch
package day13;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=1;
		String name=null;
		
		/*String s="fwff";
		System.out.println(Integer.parseInt(s) );*/
		
		try {
			float c=a/b;
			System.out.println(name.length());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
			
			System.out.println("Finally");
		}
		System.out.println("After finally");

	}

}
