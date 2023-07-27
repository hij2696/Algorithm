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
    	int[] student = new int[N];
    	
    	int ans = 0;
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < student.length; i++) {
    		student[i] = Integer.parseInt(st.nextToken());
    		if (i + 1 != student[i]) ans++;
    	}
    	   	
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}