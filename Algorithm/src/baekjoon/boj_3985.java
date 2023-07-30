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
    	StringTokenizer st;
    	
    	int L = Integer.parseInt(br.readLine());
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[L];
    	
    	int max = Integer.MIN_VALUE, idx1 = 0, idx2 = 0, ans = 0;
    	for (int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		int A = Integer.parseInt(st.nextToken()) - 1;
    		int B = Integer.parseInt(st.nextToken()) - 1;
    		int cnt = 0;
    		
    		for (int j = A; j <= B; j++) {
    			if (arr[j] == 0) {
    				arr[j]++;
    				cnt++;
    			}
    		}
    		
    		if (ans < cnt) {
    			ans = cnt;
    			idx2 = i + 1;
    		}
    		
    		if (max < B - A) {
    			max = B - A;
    			idx1 = i + 1;
    		}
    	}
    	
    	bw.write(String.valueOf(idx1) + "\n" + String.valueOf(idx2));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}