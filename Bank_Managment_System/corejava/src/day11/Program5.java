// Abstract method
package day11;
abstract class Name{
	abstract void show();
		
}
class Middlename extends Name{
	void show() {
		System.out.println("Shrikrushna\n");
	}
}
class Surname extends Name{
	void show() {
		System.out.println("Patil");
	}
}
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name s1=new Surname();
		s1.show();
		
		s1=new Middlename();
		s1.show();
	
		

	}

}
