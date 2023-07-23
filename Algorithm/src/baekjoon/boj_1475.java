import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] numArr = new int[9];
    	
    	while (N > 0) {
    		int mod = N % 10;
    		if (mod == 9) numArr[6]++;
    		else numArr[mod]++;
    		N /= 10;
    	}
    	
    	int ans = 0;
    	
    	for (int i = 0; i < 9; i++) {
    		if (i == 6) {
    			if (numArr[6] % 2 == 0) numArr[6] = numArr[6] / 2;
    	    	else numArr[6] = (numArr[6] / 2) + 1;
    		}
    		
    		if (ans < numArr[i]) ans = numArr[i];
    	}
    	
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}