import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int V = Integer.parseInt(br.readLine());
    	String str = br.readLine();
    	
    	br.close();
    	
    	int cnt_A = 0, cnt_B = 0;
    	for (int i = 0; i < V; i++) {
    		if (str.charAt(i) == 'A') cnt_A++;
    		else cnt_B++;
    	}
    	
    	if (cnt_A == cnt_B) bw.write("Tie");
    	else if (cnt_A > cnt_B) bw.write("A");
    	else bw.write("B");
    	
    	bw.flush();
    	bw.close();
    }
}