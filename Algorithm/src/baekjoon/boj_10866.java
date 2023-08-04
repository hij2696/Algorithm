import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

    	Deque<Integer> dq = new ArrayDeque<>();

        while (N-- > 0) {
            String ss = br.readLine();
            String[] str = ss.split(" ");

            if (str[0].equals("push_front")) dq.addFirst(Integer.parseInt(str[1]));
            else if (str[0].equals("push_back")) dq.addLast(Integer.parseInt(str[1]));
            else if (str[0].equals("pop_front")) {
            	if (dq.isEmpty()) bw.write("-1\n");
            	else bw.write(String.valueOf(dq.pollFirst()) + "\n");
            }
            else if (str[0].equals("pop_back")) {
            	if (dq.isEmpty()) bw.write("-1\n");
            	else bw.write(String.valueOf(dq.pollLast()) + "\n");
            }
            else if (str[0].equals("size")) bw.write(String.valueOf(dq.size()) + "\n");
            else if (str[0].equals("empty")) {
                if (dq.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            else if (str[0].equals("front")) {
            	if (dq.isEmpty()) bw.write("-1\n");
            	else bw.write(String.valueOf(dq.peekFirst()) + "\n");
            }
            else if (str[0].equals("back")) {
            	if (dq.isEmpty()) bw.write("-1\n");
            	else bw.write(String.valueOf(dq.peekLast()) + "\n");
            }
        }
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}