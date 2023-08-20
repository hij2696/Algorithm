import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<String, String> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
        	String k = st.nextToken();
        	String v = st.nextToken();
        	map.put(k, v);
        }
        
        for (int i = 0; i < M; i++) {
        	String s = br.readLine();
        	if (map.containsKey(s)) bw.write(map.get(s) + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
 
}