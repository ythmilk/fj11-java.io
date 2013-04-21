import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class TestaScanner {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream("saida.txt");
		
		while (s.hasNextLine()){
			ps.println(s.nextLine());
		}
	}

}
