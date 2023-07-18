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
    	
    	int sum = 0;
    	
    	while (str.contains("10")) {
    		str = str.replaceFirst("10", "");
    		sum += 10;
    	}
    	
    	for (int i = 0; i < str.length(); i++) {
    		sum += Integer.parseInt(str.substring(i, i+1));
    	}
    	
    	bw.write(String.valueOf(sum));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}