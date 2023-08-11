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
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		int M = Integer.parseInt(st.nextToken());
		int[] B = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(A);
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) B[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(B);
		
		StringBuilder sb = new StringBuilder();
		
		int i = 0, j = 0;
		
		while (i < N && j < M) {
			if (A[i] < B[j]) sb.append(A[i++]).append(" ");
			else sb.append(B[j++]).append(" ");
		}
		
		while (i < N) sb.append(A[i++]).append(" ");
		while (j < M) sb.append(B[j++]).append(" ");
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}