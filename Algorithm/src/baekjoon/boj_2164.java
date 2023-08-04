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
    	
    	for (int i = 0; i < N; i++) q.add(i + 1);
    	
    	while (q.size() != 1) {
    		q.poll();
    		q.add(q.peek());
    		q.poll();
    	}
    	
    	bw.write(String.valueOf(q.peek()));

    	bw.flush();
    	br.close();
    	bw.close();
    }
}