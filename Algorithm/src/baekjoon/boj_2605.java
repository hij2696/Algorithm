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
    	
    	int studentNum = Integer.parseInt(br.readLine());
    	
    	int[] student =new int[studentNum];
    	for (int i = 0; i < student.length; i++) {
    		student[i] = i + 1;
    	}
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < student.length; i++) {
    		int number = Integer.parseInt(st.nextToken());
    		
    		if (number != 0) {
    			for (int j = 0; j < number; j++) {
    				int tmp = student[i - j];
    				student[i - j] = student[i - j - 1];
    				student[i - j - 1] = tmp;
    			}
    		}
    	}
    	
    	for (int i = 0; i < student.length; i++) {
    		bw.write(String.valueOf(student[i]) + " ");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}