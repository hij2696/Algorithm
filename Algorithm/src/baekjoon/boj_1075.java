import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str_N1 = br.readLine();
    	int F = Integer.parseInt(br.readLine());
    	
    	StringBuilder sb = new StringBuilder(str_N1.substring(0, str_N1.length() - 2));
    	sb.append("00");
    	String str_N2 = sb.toString();
    	
    	int N = Integer.parseInt(str_N2);
    	
    	int result = 0;
    	for (int i = N; i <= N + 99; i++) {
    		if (i % F == 0) {
    			result = (((i / 10) % 10) * 10) + (i % 10);
    			break;
    		}
    	}
    	
    	if (result == 0) bw.write("00");
    	else if (result < 10) bw.write("0" + String.valueOf(result));
    	else bw.write(String.valueOf(result));

    	bw.flush();
    	br.close();
    	bw.close();
    }
}