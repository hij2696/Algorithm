import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int score = 0, result = 0;
    	
    	for (int i = 0; i < 10; i++) {
    		int num = Integer.parseInt(br.readLine());
    		if (score < 100) {
    			score += num;
    			
    			if (Math.abs(result - 100) > Math.abs(score - 100)) result = score;
    			else if (Math.abs(result - 100) == Math.abs(score - 100)) result = result > score ? result : score;
    		}
    	}
    	
    	bw.write(String.valueOf(result));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}