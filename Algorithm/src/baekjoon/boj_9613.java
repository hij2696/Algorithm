import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int gcd(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < t; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		int n = Integer.parseInt(st.nextToken());
    		int[] arr = new int[n];
    		
    		for (int j = 0; j < n; j++) {
    			arr[j] = Integer.parseInt(st.nextToken());
    		}
    		
    		long ans = 0;
    		for (int j = 0; j < n - 1; j++) {
    			for (int k = j + 1; k < n; k++) {
    				ans += gcd(arr[j], arr[k]);
    			}
    		}
    		
    		bw.write(String.valueOf(ans) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}