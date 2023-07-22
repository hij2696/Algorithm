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
    	
    	int N = Integer.parseInt(br.readLine());
    	int max = 0, sum = 0;
    	
    	int[] num = new int[N];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < N; i++) {
    		num[i] = Integer.parseInt(st.nextToken());
    		
    		if (i == 0) continue;
    		else {
    			if (num[i] > num[i - 1]) sum += num[i] - num[i - 1];
    			else sum = 0;
    		}
    		
    		if (max < sum) max = sum;
    	}
    	
    	bw.write(String.valueOf(max));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}