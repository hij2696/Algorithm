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
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for (int j = 0; j < M; j++) {
    			int[] arr = new int[3];
    			
    			for (int k = 0; k < 3; k++) {
    				arr[k] = Integer.parseInt(st.nextToken());
    			}
    			
    			int intensity = (2126 * arr[0]) + (7152 * arr[1]) + (722 * arr[2]);
    			
    			if (0 <= intensity && intensity < 510000) sb.append('#');
    			else if (510000 <= intensity && intensity < 1020000) sb.append('o');
    			else if (1020000 <= intensity && intensity < 1530000) sb.append('+');
    			else if (1530000 <= intensity && intensity < 2040000) sb.append('-');
    			else sb.append('.');
    		}
    		if (i != N - 1) sb.append('\n');
    	}
    	
    	String str = sb.toString();
    	bw.write(str);
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}