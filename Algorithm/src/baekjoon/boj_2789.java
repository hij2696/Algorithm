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
    	char[] c = new char[] {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
    	String ans = "";
    	for (int i = 0; i < s.length(); i++) {
    		for (int j = 0; j < c.length; j++) {
    			if (s.charAt(i) == c[j]) {
    				s = s.substring(0, i) + s.substring(i + 1);
    				i--;
    				break;
    			}
    		}
    	}
    	
    	bw.write(s);
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}