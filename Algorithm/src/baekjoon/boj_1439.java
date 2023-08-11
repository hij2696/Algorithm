import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		StringTokenizer st0 = new StringTokenizer(s, "1");
		StringTokenizer st1 = new StringTokenizer(s, "0");
		
		bw.write(String.valueOf(Math.min(st0.countTokens(), st1.countTokens())));
		
		bw.flush();
		br.close();
		bw.close();
	}
}