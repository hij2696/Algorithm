import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        @SuppressWarnings("unchecked")
		Stack<Integer>[] stack = new Stack[7];
        for (int i = 0; i < 7; i++) stack[i] = new Stack<>();
        
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
        	int line = Integer.parseInt(st.nextToken());
        	int fret = Integer.parseInt(st.nextToken());
        	
        	while (!stack[line].isEmpty() && stack[line].peek() > fret) {
        		stack[line].pop();
        		ans++;
        	}
        	
        	if (stack[line].isEmpty() || stack[line].peek() < fret) {
        		stack[line].push(fret);
        		ans++;
        	}
        }
        
        bw.write(String.valueOf(ans));
        
        bw.flush();
        br.close();
        bw.close();
    }
 
}