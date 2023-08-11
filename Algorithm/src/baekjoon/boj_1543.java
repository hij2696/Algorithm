import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		int size1 = s1.length();
		int size2 = s2.length();
		
		s1 = s1.replace(s2, "");
		bw.write(String.valueOf((size1 - s1.length()) / size2));
		
		bw.flush();
		br.close();
		bw.close();
	}
}