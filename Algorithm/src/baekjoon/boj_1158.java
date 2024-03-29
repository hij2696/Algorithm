import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

    	Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) q.add(i + 1);
    	
        bw.write("<");
        
        while (q.size() != 0) {
            for (int i = 0; i < K - 1; i++) {
                q.add(q.peek());
                q.poll();
            }
            if (q.size() != 1) bw.write(String.valueOf(q.poll()) + ", ");
            else bw.write(String.valueOf(q.poll()) + ">");
        }

    	bw.flush();
    	br.close();
    	bw.close();
    }
}