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
    	
    	int M = Integer.parseInt(br.readLine());
    	int num = 1;
    	
    	for (int i = 0; i < M; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		int num1 = Integer.parseInt(st.nextToken());
    		int num2 = Integer.parseInt(st.nextToken());
    		
    		if (num1 == num) num = num2;
    		else if (num2 == num) num = num1;
    	}
    	
    	bw.write(String.valueOf(num));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}