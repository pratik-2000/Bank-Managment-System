// multilevel inheritance
package day10;
class Cp{
	
	String name="Pratik";
	
}
class PP extends Cp{
	String mname="Shrikrushna";
	
}
class Child2 extends PP{
	
	String sname="Patil";
	
	
	void show() {
		System.out.println(name+mname+sname);
		
	}
}
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Child2 c1=new Child2();
         c1.show();
        
        // String c=c1.name;
        // System.out.println(c);
	}

}
