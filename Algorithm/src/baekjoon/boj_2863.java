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
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	double A = Integer.parseInt(st.nextToken());
    	double B = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	double C = Integer.parseInt(st.nextToken());
    	double D = Integer.parseInt(st.nextToken());
    	
    	double ans1 = (A / C) + (B / D);
    	double ans2 = (C / D) + (A / B);
    	double ans3 = (D / B) + (C / A);
    	double ans4 = (B / A) + (D / C);
    	
    	double max = 0;
    	int cnt = 0;
    	
    	
    	if (max < ans1) {
    		max = ans1;
    	}
    	if (max < ans2) {
    		max = ans2;
    		cnt = 1;
    	}
    	if (max < ans3) {
    		max = ans3;
    		cnt = 2;
    	}
    	if (max < ans4) {
    		max = ans4;
    		cnt = 3;
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}