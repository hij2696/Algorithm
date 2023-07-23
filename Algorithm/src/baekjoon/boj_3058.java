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
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < T; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int sum = 0, min = 100;
    		for (int j = 0; j < 7; j++) {
    			int data = Integer.parseInt(st.nextToken());
    			if (data % 2 == 0) {
    				sum += data;
    				if (min > data) min = data;
    			}
    		}
    		bw.write(String.valueOf(sum) + " " + String.valueOf(min) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}