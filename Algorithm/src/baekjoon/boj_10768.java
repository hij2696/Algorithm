import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int year = Integer.parseInt(br.readLine());
    	int month = Integer.parseInt(br.readLine());
    	
    	if (year == 1) bw.write("Before");
    	else if (year >= 3) bw.write("After");
    	else {
    		if (month == 18) bw.write("Special");
    		else if (month < 18) bw.write("Before");
    		else bw.write("After");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}