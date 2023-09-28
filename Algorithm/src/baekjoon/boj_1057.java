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
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int kimRank = Integer.parseInt(st.nextToken());
    	int limRank = Integer.parseInt(st.nextToken());
    	int cnt = 0;
    	
    	while (kimRank != limRank) {
    		kimRank = (kimRank / 2) + (kimRank % 2);
    		limRank = (limRank / 2) + (limRank % 2);
    		cnt++;
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}