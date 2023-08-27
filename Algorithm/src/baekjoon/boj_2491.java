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
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N + 1];
    	int increase = 0, decrease = 0, ans = 0;
    	
    	arr[0] = -1;
    	st = new StringTokenizer(br.readLine());
    	for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());
    	
    	for (int i = 1; i <= N; i++) {
    		if (arr[i - 1] <= arr[i]) increase++;
    		else increase = 1;
    		
    		ans = Math.max(increase, ans);
    		
    		if (arr[i - 1] >= arr[i]) decrease++;
    		else decrease = 1;
    		ans = Math.max(decrease, ans);
    	}
    	
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}