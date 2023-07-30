import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	int N = Integer.parseInt(br.readLine());
    	int[][] num = new int[N][5];
    	int maxStudent = 0, ans = 0;
    	
    	for (int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		for (int j = 0; j < 5; j++) {
    			num[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		Set<Integer> sameClass = new HashSet<>();
    		for (int j = 0; j < 5; j++) {
    			for (int k = 0; k < N; k++) {
    				if (num[i][j] == num[k][j]) {
    					sameClass.add(k);
    				}
    			}
    		}
    		
    		if (maxStudent < sameClass.size()) {
    			maxStudent = sameClass.size();
    			ans = i;
    		}
    	}
    	
    	bw.write(String.valueOf(ans + 1));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}