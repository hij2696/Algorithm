import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] arr;
	
	public static int binary_search(int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (arr[mid] == target) return mid;
			
			if (arr[mid] > target) right = mid - 1;
			else left = mid + 1;
		}
		
		return -1;
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
    		if (binary_search(Integer.parseInt(st.nextToken())) >= 0) sb.append(1).append('\n');
    		else sb.append(0).append('\n');
    	}
    	
    	bw.write(String.valueOf(sb));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}