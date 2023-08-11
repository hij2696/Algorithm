import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		int X = Integer.parseInt(br.readLine());
		
		int start = 0, end = N - 1, ans = 0;
		
		while (start < end) {
			int sum = arr[start] + arr[end];
			
			if (sum == X) {
				ans++;
				start++;
				end--;
			}
			else if (sum < X) start++;
			else end--;
		}
		
		bw.write(String.valueOf(ans));
		
		bw.flush();
		br.close();
		bw.close();
	}
}