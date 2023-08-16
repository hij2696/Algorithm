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
		
		String str = br.readLine();
		int M = Integer.parseInt(br.readLine());

		Stack<String> stack = new Stack<String>();
		Stack<String> tmp = new Stack<String>();
        
		String[] arr = str.split("");
		for(String s : arr) stack.push(s); 
		
		for (int i = 0; i < M; i++) {
			String command = br.readLine();
			char c = command.charAt(0);
			
			switch (c) {
				case 'L':
					if (!stack.isEmpty()) tmp.push(stack.pop());
					break;
				case 'D':
					if (!tmp.isEmpty()) stack.push(tmp.pop());
					break;
				case 'B':
					if (!stack.isEmpty()) stack.pop();
					break;
				case 'P':
					char temp = command.charAt(2);
					stack.push(String.valueOf(temp));
					break;
				default:
					break;
			}
		}
		
		while (!stack.isEmpty()) tmp.push(stack.pop());
		while (!tmp.isEmpty()) bw.write(tmp.pop());
		
		bw.flush();
		br.close();
		bw.close();
	}
}