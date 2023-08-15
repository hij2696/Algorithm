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
		int[] A = new int[N];
		int[] B = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(A);
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < N; i++) B[i] = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (B[i] < B[j]) {
					int tmp = B[i];
					B[i] = B[j];
					B[j] = tmp;
				}
			}
			ans += A[i] * B[i];
		}
		
		ans += A[N - 1] * B[N - 1];
		
		bw.write(String.valueOf(ans));
		
		bw.flush();
		br.close();
		bw.close();
	}
}