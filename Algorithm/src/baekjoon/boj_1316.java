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
    	int num = 0;
    	
    	while (N-- > 0) {
    		String str = br.readLine();
    		char[] c = str.toCharArray();
    		int[] arr = new int[26];
    		boolean chk = true;
    		
    		for (int i = 0; i < str.length(); i++) {
    			if (arr[c[i] - 'a'] == 0) arr[c[i] - 'a']++;
    			else if (arr[c[i] - 'a'] != 0 && c[i] == c[i - 1]) arr[c[i] - 'a']++;
    			else {
    				chk = false;
    				break;
    			}
    		}
    		if (chk) num++;
    	}
    	
    	bw.write(String.valueOf(num));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}