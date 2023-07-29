import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	String[] str = new String[N];
    	
    	for (int i = 0; i < N; i++) str[i] = br.readLine();
    	
    	int len = str[0].length();
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < len; i++) {
    		boolean checked = true;
    		char c = str[0].charAt(i);
    		
    		for (int j = 1; j < N; j++) {
    			if (c != str[j].charAt(i)) {
    				checked = false;
    			}
    		}
    		if (checked) sb.append(c);
    		else sb.append('?');
    	}
    	
    	String ans = sb.toString();
    	bw.write(ans);
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}