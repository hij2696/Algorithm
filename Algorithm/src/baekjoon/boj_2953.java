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
    	
    	int max = 0, person = 0;
    	
    	for (int i = 0; i < 5; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		int sum = 0;
    		for (int j = 0; j < 4; j++) {
    			sum += Integer.parseInt(st.nextToken());
    		}
    		
    		if (max < sum) {
    			max = sum;
    			person = i + 1;
    		}
    	}
    	
    	bw.write(String.valueOf(person) + " " + String.valueOf(max));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}