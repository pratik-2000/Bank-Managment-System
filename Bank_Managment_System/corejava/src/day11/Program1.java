//Super Keyword
package day11;
class PP{
	
	int a=100;
	
}
class CC extends PP{
	int a=200;
	void display() {
		
	 System.out.println(a +" "+super.a);
		
	}
	
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CC c1=new CC();
		c1.display();
		
		
		

	}

}
