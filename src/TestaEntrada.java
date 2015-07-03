import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TestaEntrada {

	

	public static void main(String[] args) throws IOException{
		InputStream is = new FileInputStream("saida.txt");
		//InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		
		while (s != -1) {
			System.out.println(s);
			s = br.readLine();
		}
		//关闭BufferedReader
		br.close();

	}

}
