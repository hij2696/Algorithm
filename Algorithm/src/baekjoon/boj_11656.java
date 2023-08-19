import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
 
public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        
        String[] str = new String[s.length()];
        
        for (int i = 0; i < s.length(); i++) str[i] = s.substring(i, s.length());
        Arrays.sort(str);
        
        for (int i = 0; i < s.length(); i++) bw.write(str[i] + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
 
}
