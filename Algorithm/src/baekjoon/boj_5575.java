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
    	
    	for (int i = 0; i < 3; i++) {
    		int[] arr = new int[6];
    		
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for (int j = 0; j < arr.length; j++) {
    			arr[j] = Integer.parseInt(st.nextToken());
    		}
    		
    		int start = (arr[0] * 3600) + (arr[1] * 60) + arr[2];
    		int end = (arr[3] * 3600) + (arr[4] * 60) + arr[5];
    		int time = end - start;
    		int h = time / 3600;
    		int m = (time % 3600) / 60;
    		int s = (time % 3600) % 60;
    		
    		bw.write(h + " " + m + " " + s + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}