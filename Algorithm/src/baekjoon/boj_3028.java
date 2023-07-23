import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str = br.readLine();
    	
    	int ball = 1;
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == 'A') {
    			if (ball == 1) ball = 2;
    			else if (ball == 2) ball = 1;
    			else continue;
    		}
    		else if (str.charAt(i) == 'B') {
    			if (ball == 2) ball = 3;
    			else if (ball == 3) ball = 2;
    			else continue;
    		}
    		else {
    			if (ball == 3) ball = 1;
    			else if (ball == 1) ball = 3;
    			else continue;
    		}
    	}
    	
    	bw.write(String.valueOf(ball));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}