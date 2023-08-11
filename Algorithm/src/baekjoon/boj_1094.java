import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static final int len = 7;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        
        int ans = 0;
        for (int i = 0; i < len; i++) {
        	if ((X & (1 << i)) > 0) ans++;
        }
        
        bw.write(String.valueOf(ans));
        
        bw.flush();
        br.close();
        bw.close();
    }
}