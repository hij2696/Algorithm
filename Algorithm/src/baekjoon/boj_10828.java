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
        
        int N = Integer.parseInt(br.readLine());

    	Stack<Integer> s = new Stack<>();

        while (N-- > 0) {
            String ss = br.readLine();
            String[] str = ss.split(" ");

            if (str[0].equals("push")) s.push(Integer.parseInt(str[1]));
            else if (str[0].equals("pop")) {
            	if (s.isEmpty()) bw.write("-1\n");
            	else bw.write(String.valueOf(s.pop()) + "\n");
            }
            else if (str[0].equals("size")) bw.write(String.valueOf(s.size()) + "\n");
            else if (str[0].equals("empty")) {
                if (s.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            else if (str[0].equals("top")) {
            	if (s.isEmpty()) bw.write("-1\n");
            	else bw.write(String.valueOf(s.peek()) + "\n");
            }
        }
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}