import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] arr;
	
	public static int lower_bound(int target) {
		int left = 0;
		int right = arr.length - 1;
		int min_idx = arr.length;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (arr[mid] >= target) {
				right = mid - 1;
				min_idx = Math.min(min_idx, mid);
			}
			else left = mid + 1;
		}
		
		return min_idx;
	}
	
	public static int upper_bound(int target) {
		int left = 0;
		int right = arr.length - 1;
		int max_idx = arr.length;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (arr[mid] > target) {
				right = mid - 1;
				max_idx = Math.min(max_idx, mid);
			}
			else left = mid + 1;
		}
		
		return max_idx;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int N = Integer.parseInt(br.readLine());
    	arr = new int[N];
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
    	
    	Arrays.sort(arr);
    	
    	int M = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < M; i++) {
    		int target = Integer.parseInt(st.nextToken());
    		sb.append(upper_bound(target) - lower_bound(target)).append(' ');
    	}
    	
    	bw.write(String.valueOf(sb));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}