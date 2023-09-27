import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	long[] cards = new long[N];
    	
    	for (int i = 0; i < N; i++) cards[i] = Long.parseLong(br.readLine());
    	Arrays.sort(cards);
    	
    	int max = Integer.MIN_VALUE, cnt = 0;
    	long answer = -1;
    	for (int i = 0; i < N; i++) {
    		if (i == 0 || cards[i] == cards[i - 1]) {
    			cnt++;
    			if (max < cnt) answer = cards[i];
    			max = Math.max(max, cnt);
    		}
    		else cnt = 1;
    	}
    	
    	bw.write(String.valueOf(answer));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}