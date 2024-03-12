// call by value
package day9;

class Abc{
	
	void change(int x) {
		
		x++;
		System.out.println(x);
	}
	
	
}
public class Program1 {
	public static void main(String []args){
		int a=10;
		Abc a1=new Abc();
		a1.change(a);
		System.out.println(a);
		
		
	}

}
