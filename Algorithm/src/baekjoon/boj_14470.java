import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int A = Integer.parseInt(br.readLine());
    	int B = Integer.parseInt(br.readLine());
    	int C = Integer.parseInt(br.readLine());
    	int D = Integer.parseInt(br.readLine());
    	int E = Integer.parseInt(br.readLine());
    	
    	int initialValue = A;
    	int sec = 0;
    	
    	while (A != B) {
    		if (A < 0) for (int i = 0; i < C; i++) sec++;
    		else if (A == 0) for (int i = 0; i < D; i++) sec++;
    		else if (A > 0) for (int i = 0; i < E; i++) sec++;
    		A++;
    	}
    	
    	if (initialValue < 0) bw.write(String.valueOf(sec + E));
    	else if (initialValue > 0) bw.write(String.valueOf(sec));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}