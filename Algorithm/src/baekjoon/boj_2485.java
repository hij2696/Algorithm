import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int N;
	public static int[] arr, gap;
	
	public static int gcd(int a, int b) {
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
    	
    	N  = Integer.parseInt(br.readLine());
    	arr = new int[N];
    	gap = new int[N - 1];
    	
    	for (int i = 0; i < N; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    		
    		if (i > 0) gap[i - 1] = arr[i] - arr[i - 1];
    	}
    	
    	for (int i = 0; i < gap.length - 1; i++) {
    		gap[i + 1] = gcd(gap[i], gap[i + 1]);
    	}
    	
    	int ans = ((arr[N - 1] - arr[0]) / gap[gap.length - 1]) + 1 - N;
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}