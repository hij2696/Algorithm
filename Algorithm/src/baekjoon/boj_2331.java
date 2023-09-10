import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	int A = Integer.parseInt(st.nextToken());
    	int P = Integer.parseInt(st.nextToken());
    	
    	List<Integer> list = new ArrayList<>();
    	list.add(A);
    	
    	while (true) {
    		int tmp = list.get(list.size() - 1);
    		
    		int res = 0;
    		while (tmp != 0) {
    			res += (int) Math.pow((tmp % 10), (double) P);
    			tmp /= 10;
    		}
    		
    		if (list.contains(res)) {
    			int ans = list.indexOf(res);
    			bw.write(String.valueOf(ans));
    			break;
    		}
    		
    		list.add(res);
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}