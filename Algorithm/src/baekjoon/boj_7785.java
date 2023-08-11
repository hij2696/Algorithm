import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<String, String>();
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	String name = st.nextToken();
        	String state = st.nextToken();
        	
        	if (map.containsKey(name)) map.remove(name);
        	else map.put(name, state);
        	
        }
        
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (String i : list) sb.append(i + "\n");
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
    }
}