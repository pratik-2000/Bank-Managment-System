//multiple inheritance 
package day11;
class Person
{
	String name ="pratik";
	int number= 788775629;
	String city="malkapur";
	
}
class Lecture extends Person
{
	String subject="java";
}
class Gestlecturer extends Lecture
{
	int hour=10;
	int renum=2000;
	int salary =renum*hour;
	
	void display()
	{
		System.out.println(name+"\s"+number+"\s"+city+"\n"+"salary :"+salary);
		
	}
}
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gestlecturer g1=new Gestlecturer();
		g1.display();
	}

}
