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
    	
    	int ans = 0;
    	for (int i = 4; i <= N; i++) {
    		String s = String.valueOf(i);
    		int cnt = 0;
    		
    		for (int j = 0; j < s.length(); j++) {
    			if (s.charAt(j) != '4' && s.charAt(j) != '7') cnt++;
    		}
    		
    		if (cnt == 0) ans = i;
    	}
    	
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}