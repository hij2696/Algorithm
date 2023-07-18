import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int MAX = 0;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int idx1 = 0, idx2 = 0;
    	
    	for (int i = 0; i < 9; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		for (int j = 0; j < 9; j++) {
    			int num = Integer.parseInt(st.nextToken());
    			
    			if (num >= MAX) {
    				MAX = num;
    				idx1 = i + 1;
    				idx2 = j + 1;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(MAX) + "\n" + idx1 + " " + idx2);
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}