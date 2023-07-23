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
    	int R = Integer.parseInt(st.nextToken());
    	int C = Integer.parseInt(st.nextToken());
    	int ZR = Integer.parseInt(st.nextToken());
    	int ZC = Integer.parseInt(st.nextToken());
    	
    	String[] scan = new String[R];
    	
    	for (int i = 0; i < R; i++) scan[i] = br.readLine();
    	
    	for (int i = 0; i < R; i++) {
    		for (int j = 0; j < ZR; j++) {
    			for (int k = 0; k < C; k++) {
        			for (int l = 0; l < ZC; l++) {
        				bw.write(String.valueOf(scan[i].charAt(k)));
        			}
        		}
    			bw.write("\n");
    		}
    	}
    	   	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}