import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] str = new String[5];
    	int[] len = new int[5];
    	int max_len = 0;
    	
    	for (int i = 0; i < str.length; i++) {
    		str[i] = br.readLine();
    		len[i] = str[i].length();
    		
    		if (max_len < len[i]) {
    			max_len = len[i];
    		}
    	}
    	
    	for (int i = 0; i < max_len; i++) {
    		for (int j = 0; j < 5; j++) {
    			if (i > len[j] - 1) continue;
    			else bw.write(String.valueOf(str[j].charAt(i)));
    		}
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}