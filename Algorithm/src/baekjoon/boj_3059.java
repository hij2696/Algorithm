import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		int sum = 0;
        	for (int j = 65; j <= 90; j++) sum += j;
        	
    		String s = br.readLine();
    		
    		String answer = "";
    		for (char x : s.toCharArray()) {
    			if (!answer.contains(String.valueOf(x))) answer += String.valueOf(x);
    		}
    		
    		for (int j = 0; j < answer.length(); j++) sum -= answer.charAt(j);
    		
    		bw.write(sum + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}