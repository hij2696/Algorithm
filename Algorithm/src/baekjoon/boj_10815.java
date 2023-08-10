import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int N, M;
	public static int[] arrN;
	
	private static boolean binarySearch(int num) {
		int leftIdx = 0;
		int rightIdx = N - 1;
		
		while (leftIdx <= rightIdx) {
			int midIdx = (leftIdx + rightIdx) / 2;
			int mid = arrN[midIdx];
			
			if (num < mid) rightIdx = midIdx - 1;
			else if (num > mid) leftIdx = midIdx + 1;
			else return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arrN = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) arrN[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arrN);
		
		M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if (binarySearch(num)) bw.write("1 ");
			else bw.write("0 ");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}