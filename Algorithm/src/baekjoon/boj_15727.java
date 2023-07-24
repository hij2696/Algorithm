import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int L = Integer.parseInt(br.readLine());
    	
    	if (L % 5 == 0) bw.write(String.valueOf(L / 5));
    	else bw.write(String.valueOf(L / 5 + 1));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}