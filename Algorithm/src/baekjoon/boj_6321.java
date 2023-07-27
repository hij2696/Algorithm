import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < n; i++) {
    		String s = br.readLine();
    		
    		String ans = "";
    		for (char x : s.toCharArray()) {
    			if (x != 'Z') x++;
    			else x = 'A';
    			ans += String.valueOf(x);
    		}
    		
    		bw.write("String #" + String.valueOf(i + 1) + "\n" + ans + "\n");
    		bw.newLine();
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}