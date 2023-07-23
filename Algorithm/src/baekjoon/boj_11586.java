import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	String[] mirror = new String[N];
    	for (int i = 0; i < N; i++) {
    		mirror[i] = br.readLine();
    	}
    	
    	int K = Integer.parseInt(br.readLine());
    	
    	if (K == 1) {
    		for (int i = 0; i < N; i++) bw.write(String.valueOf(mirror[i] + "\n"));
    	}
    	else if (K == 3) {
    		for (int i = N - 1; i >= 0; i--) bw.write(String.valueOf(mirror[i] + "\n"));
    	}
    	else {
    		for (int i = 0; i < N; i++) {
    			for (int j = N - 1; j >= 0; j--) {
    				bw.write(String.valueOf(mirror[i].charAt(j)));
    			}
    			bw.write("\n");
    		}
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}