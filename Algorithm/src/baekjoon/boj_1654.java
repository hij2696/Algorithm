import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] arr;
	public static long min;
	public static long mid;
	public static long max;
	
	public static void binarySearch(int N) {
		while (min < max) {
			mid = (max + min) / 2;
			
			long cnt = 0;
			
			for (int i = 0; i < arr.length; i++) {
				cnt += (arr[i] / mid);
			}
			
			if (cnt < N) max = mid;
			else min = mid + 1;
		}
		
		System.out.print(min - 1);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		arr = new int[K];
		
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max < arr[i]) max = arr[i];
		}	
		max++;
		br.close();
		
		binarySearch(N);
		
	}
}