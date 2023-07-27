import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	int[] cow = new int[10];
    	int cnt = 0;
    	
    	for (int i = 0; i < cow.length; i++) cow[i] = 2;
    	
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int num = Integer.parseInt(st.nextToken()) - 1;
    		int location = Integer.parseInt(st.nextToken());
    		
    		if (cow[num] == 2) cow[num] = location;
    		else if (cow[num] != location) {
    			cow[num] = location;
    			cnt++;
    		}
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}