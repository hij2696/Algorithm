import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	char[] c = s.toCharArray();
    	char[] ans = new char[s.length()];
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (c[i] == ' ') ans[i] = c[i];
    		else if (c[i] >= '0' && c[i] <= '9') ans[i] = c[i];
    		else if (c[i] <= 'M') ans[i] = (char)(c[i] + 13);
    		else if (c[i] > 'M' && c[i] <= 'Z') ans[i] = (char)(c[i] - 13);
    		else if (c[i] <= 'm') ans[i] = (char)(c[i] + 13);
    		else if (c[i] > 'm') ans[i] = (char)(c[i] - 13);
    		
    		bw.write(ans[i]);
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}