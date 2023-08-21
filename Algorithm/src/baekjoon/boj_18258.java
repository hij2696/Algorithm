import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
 
public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
        	String command = br.readLine();
        	String[] s = command.split(" ");
        	
        	if (s[0].equals("push")) queue.offer(Integer.parseInt(s[1]));
        	else if (s[0].equals("pop")) {
        		if (queue.isEmpty()) sb.append("-1\n");
        		else sb.append(queue.poll()).append("\n");
        	}
        	else if (s[0].equals("size")) sb.append(queue.size()).append("\n");
        	else if (s[0].equals("empty")) {
        		if (queue.isEmpty()) sb.append("1\n");
        		else sb.append("0\n");
        	}
        	else if (s[0].equals("front")) {
        		if (queue.isEmpty()) sb.append("-1\n");
        		else sb.append(queue.peek()).append("\n");
        	}
        	else if (s[0].equals("back")) {
        		if (queue.isEmpty()) sb.append("-1\n");
        		else {
        			sb.append(queue.peekLast()).append("\n");
        		}
        	}
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
    }
 
}