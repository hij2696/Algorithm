import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[] ans = new int[5];
    	int cnt = 0;
    	for (int i = 0; i < 5; i++) {
    		String s = br.readLine();
    		for (int j = 0; j < s.length() - 2; j++) {
    			if (s.charAt(j) == 'F' && s.charAt(j+1) == 'B' && s.charAt(j+2) == 'I') {
    				ans[i]++;
    				cnt++;
    			}
    		}
    	}
    	
    	if (cnt == 0) bw.write("HE GOT AWAY!");
    	else {
    		for (int i = 0; i < 5; i++) {
        		if (ans[i] != 0) bw.write(String.valueOf(i+1) + " ");
    		}
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}