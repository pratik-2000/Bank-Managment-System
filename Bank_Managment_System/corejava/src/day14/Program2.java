package day14;
import java.util.*;


public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> al=new ArrayList<>();
		
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(30);
		
		  Iterator<Integer> ir=al.iterator();
		  while(ir.hasNext()) {
		  
		  
		  System.out.println(ir.next()); }
		 
		
		System.out.println("List Iterator ");
		
		ListIterator lr=al.listIterator();
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		System.out.println("Reverse");
		
		while(lr.hasPrevious())
		{
			System.out.println(lr.previous());
		}
	}

}
