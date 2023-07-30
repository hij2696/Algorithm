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
    	
    	int N = Integer.parseInt(br.readLine()); 
    	
    	for (int i = 0; i < N; i++) {
    		int[] cnt_A = new int[5];
    		int[] cnt_B = new int[5];
    		boolean checked = true;
    		
    		st = new StringTokenizer(br.readLine());
    		int cnt_1 = Integer.parseInt(st.nextToken());
    		for (int j = 0; j < cnt_1; j++) {
    			int numA = Integer.parseInt(st.nextToken()) - 1;
    			cnt_A[numA]++;
    		}
    		
    		st = new StringTokenizer(br.readLine());
    		int cnt_2 = Integer.parseInt(st.nextToken());
    		for (int j = 0; j < cnt_2; j++) {
    			int numB = Integer.parseInt(st.nextToken()) - 1;
    			cnt_B[numB]++;
    		}
    		
    		if (cnt_A[0] == cnt_B[0] && cnt_A[1] == cnt_B[1] && cnt_A[2] == cnt_B[2] && cnt_A[3] == cnt_B[3] && cnt_A[4] == cnt_B[4])
    			bw.write("D\n");
    		else {
    			for (int j = 0; j < 5; j++) {
    				if (cnt_A[j] == cnt_B[j]) continue;
    				else if (cnt_A[j] > cnt_B[j]) checked = true;
    				else checked = false;
    			}
    			
    			if (checked) bw.write("A\n");
    			else bw.write("B\n");
    		}
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}