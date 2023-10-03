import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int j = Integer.parseInt(br.readLine());
    	
    	int left = 0;
    	int right = left + M - 1;
    	int distance = 0;
    	
    	while (j-- > 0) {
    		int appleNum = Integer.parseInt(br.readLine()) - 1;
    		
    		if (appleNum < left) {
    			int diff = left - appleNum;
    			
    			distance += diff;
    			left -= diff;
    			right -= diff;
    		}
    		else if (appleNum > right) {
    			int diff = appleNum - right;
    			
    			distance += diff;
    			right += diff;
    			left += diff;
    		}
    	}
    	
    	System.out.print(distance);
    	
    	br.close();
    }
}