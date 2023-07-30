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
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	while (T-- > 0) {
    		st = new StringTokenizer(br.readLine());
        	int M = Integer.parseInt(st.nextToken());
        	char c = st.nextToken().charAt(0);
        	
        	if (c == 'C') {
        		st = new StringTokenizer(br.readLine());
        		char[] charArr = new char[M];
        		for (int i = 0; i < M; i++) {
        			charArr[i] = st.nextToken().charAt(0);
        			bw.write(String.valueOf((int)(charArr[i] - 'A' + 1)) + " ");
        		}
        	}
        	else {
        		st = new StringTokenizer(br.readLine());
        		int[] numArr = new int[M];
        		for (int i = 0; i < M; i++) {
        			numArr[i] = Integer.parseInt(st.nextToken());
        			bw.write(String.valueOf((char)(numArr[i] + 'A' - 1)) + " ");
        		}
        	}
        	bw.newLine();
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}