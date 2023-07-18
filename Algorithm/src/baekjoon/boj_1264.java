import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while (true) {
    		String str = br.readLine();
    		if (str.equals("#")) {
    			break;
    		}
    		
    		str = str.toLowerCase();
    		
    		int cnt = 0;
    		for (int i = 0; i < str.length(); i++) {
    			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
    				cnt++;
    			}
    		}
    		bw.write(cnt + "\n");
    	}
    	bw.flush();
    	br.close();
    	bw.close();
    }
}