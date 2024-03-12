//File reading and writing
package day13;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Program3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter writer=new FileWriter("abc.txt");
		writer.write("Hello Java");
		writer.close();
		FileReader fr=new FileReader("abc.txt");
		
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
			/*
			 * 
			 */
			
		}
		fr.close();
	}

}
