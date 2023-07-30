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
    	
    	int cnt = 1;
    	while (true) {
    		st = new StringTokenizer(br.readLine());
    		int num1 = Integer.parseInt(st.nextToken());
    		String compare = st.nextToken();
    		int num2 = Integer.parseInt(st.nextToken());
    		
    		boolean chk = false;
    		
    		if (compare.equals("E")) break;
    		
    		if (compare.equals("!=")) {
    			if (num1 != num2) chk = true; 
    		}
    		else if (compare.equals("==")) {
    			if (num1 == num2) chk = true;
    		}
    		else if (compare.equals(">")) {
    			if (num1 > num2) chk = true;
    		}
    		else if (compare.equals(">=")) {
    			if (num1 >= num2) chk = true;
    		}
    		else if (compare.equals("<")) {
    			if (num1 < num2) chk = true;
    		}
    		else if (compare.equals("<=")) {
    			if (num1 <= num2) chk = true;
    		}
    		
    		if (chk) bw.write("Case " + cnt + ": true\n");
    		else bw.write("Case " + cnt + ": false\n");
    		
    		cnt++;
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}