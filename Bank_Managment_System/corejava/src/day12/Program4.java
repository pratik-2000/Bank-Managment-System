//Interface method
package day12;
interface A1{
	void show1();

}
interface B1{
	
	void show2();
}
class C1 implements A1,B1 {

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
		System.out.println("method 1");
		
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
		System.out.println("Method 2");
	}
	
	
	
}


public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 c=new C1();
		c.show1();
		c.show2();
		
	}

}
