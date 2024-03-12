//method with return value
package day7;

class Add{
	
	int add(int x,int y) {
		
		int z=x+y;
		return(z);
		
	}
	
}
public class Program1 {
	public static void main(String []args) {
		int a=10,b=30;
		
		Add d1=new Add();
		
		int c= d1.add(a, b);
		System.out.println("Addition is :"+c);
		
		
		
	}

}
