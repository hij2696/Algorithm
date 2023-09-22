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
    	
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int[] tree = new int[N];
    	
    	int min = 0, max = 0;
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < tree.length; i++) {
    		tree[i] = Integer.parseInt(st.nextToken());
    		max = Math.max(max, tree[i]);
    	}
    	
    	while (min < max) {
    		int mid = (min + max) / 2;
    		long sum = 0;
    		for (int height : tree) {
    			if (height - mid > 0) sum += (height - mid);
    		}
    		
    		if (sum < M) max = mid;
    		else min = mid + 1;
    	}
    	
    	bw.write(String.valueOf(min - 1));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}