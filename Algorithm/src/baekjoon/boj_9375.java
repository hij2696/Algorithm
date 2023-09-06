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
    	StringBuilder sb = new StringBuilder();
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	while (T-- > 0) {
    		int n = Integer.parseInt(br.readLine());
    		
    		HashMap<String, Integer> map = new HashMap<>();
    		for (int i = 0; i < n; i++) {
    			st = new StringTokenizer(br.readLine());
    			st.nextToken();
    			String kind = st.nextToken();
    			
    			if (map.containsKey(kind)) map.put(kind, map.get(kind) + 1);
    			else map.put(kind, 1);
    		}
    		
    		int res = 1;
        	for (int i : map.values()) res *= (i + 1);
        	
        	sb.append(res - 1).append("\n");
    	}
    	
    	bw.write(sb.toString());
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}