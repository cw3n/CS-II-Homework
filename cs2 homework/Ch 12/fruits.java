import java.io.PrintWriter; 
import java.io.IOException;

public class fruits
{
	public static void main(String[] args) throws IOException
	{

		PrintWriter out = new PrintWriter("fruits.csv"); 


		out.print("Cherry, ");   
		out.print("orange, ");
		out.print("apple, ");
		out.print("banana, ");
		out.println();
		for( int j = 0;
				j < 10; 
				j ++) {
			for( int i = 0;
					i < 4;
					i ++) {
				out.print(Math.random());
				out.print(", ");
			}
			out.println();
		}
		out.close(); 
	}
}