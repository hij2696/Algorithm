import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] arr = new int[1000];
	
	public static void hij (int[] n) {
    	int cnt = 0, num = 1;
    	while (true) {
    		for (int i = 1; i <= num; i++) {
    			arr[cnt] = num;
    			cnt++;
    			if (cnt == 1000) break;
    		}
    		if (cnt == 1000) break;
    		num++;
    	}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int A = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	
    	hij(arr);
    	
    	int ans = 0;
    	for (int i = A; i <= B; i++) {
    		ans += arr[i - 1];
    	}
    	
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}