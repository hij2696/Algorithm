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
    	int P = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[1000];
    	
    	int ans = 0, idx = 2;
    	arr[0] = N;
    	arr[1] = (arr[0] * N) % P;
    	
    	while (true) {
    		boolean checked = false;
    		arr[idx] = (arr[idx - 1] * N) % P;
    		for (int i = 0; i < idx; i++) {
    			for (int j = i + 1; j < idx; j++) {
    				if (arr[i] == arr[j]) {
    					ans = j - i;
    					checked = true;
    					break;
    				}
    			}
    			if (checked) break;
    		}
    		if (checked) break;
    		idx++;
    	}
    	
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}