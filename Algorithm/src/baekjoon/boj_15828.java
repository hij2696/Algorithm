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
    	StringBuilder sb = new StringBuilder();
    	
    	int N = Integer.parseInt(br.readLine());
    	Queue<Integer> q = new LinkedList<>();
    	
    	while (true) {
    		int num = Integer.parseInt(br.readLine());
    		if (num == -1) break;
    		
    		if (num == 0) q.remove();
    		else if (N > q.size()) q.add(num);
    	}
    	
    	if (q.isEmpty()) bw.write("empty");
    	else {
    		for (int item : q) sb.append(item + " ");
    		bw.write(String.valueOf(sb));
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}