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
    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st1.nextToken());
    	int K = Integer.parseInt(st1.nextToken());
    	int[] student = new int[N];
    	int[] woman = new int[6];
    	int[] man = new int[6];
    	int cnt = 0;
    	
    	for (int i = 0; i < student.length; i++) {
    		StringTokenizer st2 = new StringTokenizer(br.readLine());
    		int gender = Integer.parseInt(st2.nextToken());
    		student[i] = Integer.parseInt(st2.nextToken());
    		
    		if (gender == 0) {
    			woman[student[i] - 1]++;
    			if (woman[student[i] - 1] == K) {
        			cnt++;
        			woman[student[i] - 1] = 0;
        		}
    		}
    		else {
    			man[student[i] - 1]++;
    			if (man[student[i] - 1] == K) {
        			cnt++;
        			man[student[i] - 1] = 0;
        		}
    		}
    	}
    	
    	for (int i = 0; i < 6; i++) {
    		if (woman[i] != 0) cnt++;
    		if (man[i] != 0) cnt++;
    	}
    	
    	bw.write(String.valueOf(cnt));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}