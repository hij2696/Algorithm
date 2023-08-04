import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

    	Queue<Integer> q = new LinkedList<>();

        while (N-- > 0) {
            String ss = br.readLine();
            String[] str = ss.split(" ");

            if (str[0].equals("push")) q.add(Integer.parseInt(str[1]));
            else if (str[0].equals("pop")) {
            	if (q.isEmpty()) bw.write("-1\n");
            	else bw.write(String.valueOf(q.poll()) + "\n");
            }
            else if (str[0].equals("size")) bw.write(String.valueOf(q.size()) + "\n");
            else if (str[0].equals("empty")) {
                if (q.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            else if (str[0].equals("front")) {
            	if (q.isEmpty()) bw.write("-1\n");
            	else bw.write(String.valueOf(q.peek()) + "\n");
            }
            else if (str[0].equals("back")) {
            	if (q.isEmpty()) bw.write("-1\n");
            	else  {
            		for (int i = 0; i < q.size() - 1; i++) {
            			q.add(q.peek());
            			q.poll();
            		}
            		bw.write(String.valueOf(q.peek()) + "\n");
            		q.add(q.peek());
            		q.poll();
            	}
            }
        }
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}