import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int L = Integer.parseInt(br.readLine());
    	String s = br.readLine();
    	int r = 31, M = 1234567891;
    	long result = 0, pow = 1;
    	
    	for (int i = 0; i < L; i++) {
    		result += ((s.charAt(i) - 96) * pow);
    		pow = (pow * r) % M;
    	}
    	
    	bw.write(String.valueOf(result % M));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}