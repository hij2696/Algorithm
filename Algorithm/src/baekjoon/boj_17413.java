import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	Stack<Character> stack = new Stack<>();
    	String s = br.readLine();
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == '<') {
    			while (!stack.isEmpty()) sb.append(stack.pop());
    			
    			while (true) {
    				if (s.charAt(i) == '>') {
    					sb.append(s.charAt(i));
    					break;
    				}
    				sb.append(s.charAt(i));
    				i++;
    			}
    		}
    		else if (s.charAt(i) == ' ') {
    			while (!stack.isEmpty()) sb.append(stack.pop());
    			sb.append(' ');
    		}
    		else {
    			stack.push(s.charAt(i));
    		}
    	}
    	
    	while (!stack.isEmpty()) sb.append(stack.pop());
    	
    	bw.write(sb.toString());
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}