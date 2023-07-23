import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    		
    	String str1 = br.readLine();
    	String str2 = br.readLine();
    	
    	if (str1.length() >= str2.length()) bw.write("go");
    	else bw.write("no");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}