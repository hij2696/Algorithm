import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String X = br.readLine();
    	int len = X.length(), cnt = 0, answer = 0;
    	
    	while (true) {
    		if (len == 1) {
    			answer = Integer.valueOf(X);
    			break;
    		}
    		
    		int sum = 0;
    		for (int i = 0; i < len; i++) sum += X.charAt(i) - '0';
    		
    		X = String.valueOf(sum);
    		len = X.length();
    		cnt++;
    	}
    	
    	bw.write(String.valueOf(cnt));
    	bw.newLine();
    	bw.write((answer % 3 == 0) ? "YES" : "NO");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}