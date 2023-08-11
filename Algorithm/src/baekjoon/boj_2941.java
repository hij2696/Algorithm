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
        
    	if (s.contains("c=")) s = s.replace("c=", "a");
    	if (s.contains("c-")) s = s.replace("c-", "a");
    	if (s.contains("dz=")) s = s.replace("dz=", "a");
    	if (s.contains("d-")) s = s.replace("d-", "a");
    	if (s.contains("lj")) s = s.replace("lj", "a");
    	if (s.contains("nj")) s = s.replace("nj", "a");
    	if (s.contains("s=")) s = s.replace("s=", "a");
    	if (s.contains("z=")) s = s.replace("z=", "a");
    	
    	bw.write(String.valueOf(s.length()));
        
        bw.flush();
        br.close();
        bw.close();
    }
}