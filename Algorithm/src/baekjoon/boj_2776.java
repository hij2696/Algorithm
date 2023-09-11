import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int N, M;
	public static int[] nArr;
	public static StringBuilder sb;
	
	public static void binarySearch(int key) {
		int left = 0;
		int right = N - 1;
			
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (nArr[mid] == key) {
				sb.append('1').append("\n");
				return;
			}
			if (nArr[mid] < key) left = mid + 1;
			else right = mid - 1;
		}
		
		sb.append('0').append("\n");
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	while (T-- > 0) {
    		sb = new StringBuilder();
    		
	    	N = Integer.parseInt(br.readLine());
	    	nArr = new int[N];
	    	
	    	st = new StringTokenizer(br.readLine());
	    	for (int i = 0; i < N; i++) nArr[i] = Integer.parseInt(st.nextToken());
	    	
	    	Arrays.sort(nArr);
	    	
	    	M = Integer.parseInt(br.readLine());
	    	
	    	st = new StringTokenizer(br.readLine());
	    	for (int i = 0; i < M; i++) binarySearch(Integer.parseInt(st.nextToken()));
	    	
	    	bw.write(sb.toString());
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}