import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    		
    	String str = br.readLine();
    	int joi_cnt = 0, ioi_cnt = 0;
    	
    	for (int i = 0; i < str.length() - 2; i++) {
    		if (str.substring(i, i + 3).equals("JOI")) {
    			joi_cnt++;
    		}
    		if (str.substring(i, i + 3).equals("IOI")) {
    			ioi_cnt++;
    		}
    	}
    	
    	bw.write(String.valueOf(joi_cnt) + "\n" + String.valueOf(ioi_cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}