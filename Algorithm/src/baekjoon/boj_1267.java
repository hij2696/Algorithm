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
    	int Y = 0, M = 0;
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < N; i++) {
    		int time = Integer.parseInt(st.nextToken());
    		
    		Y += (time / 30) * 10 + 10;
    		M += (time / 60) * 15 + 15;
    	}
    	
    	if (Y == M) bw.write("Y M " + String.valueOf(Y));
    	else if (Y > M) bw.write("M " + String.valueOf(M));
    	else bw.write("Y " + String.valueOf(Y));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}