import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String s = br.readLine();
    	StringBuilder sb = new StringBuilder();
    	String[] octalNum = { "000", "001", "010", "011", "100", "101", "110", "111" };
    	
    	for (int i = 0; i < s.length(); i++) {
    		int a = s.charAt(i) - '0';
    		sb.append(octalNum[a]);
    	}
    	
    	if(s.equals("0")) bw.write(s);
    	else {
    		while(sb.charAt(0) == '0') sb = new StringBuilder(sb.substring(1));
    		bw.write(String.valueOf(sb));
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}