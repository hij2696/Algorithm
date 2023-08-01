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
    	
    	int[] jmns = new int[9];
    	int[] glbs = new int[9];
    	boolean checked = false;
    	int chk = 0;
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < jmns.length; i++) jmns[i] = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < glbs.length; i++) glbs[i] = Integer.parseInt(st.nextToken());
    	
    	int jmnsSum = 0;
    	int glbsSum = 0;
    	
    	for (int i = 0; i < glbs.length; i++) {
    		jmnsSum += jmns[i];
    		if (jmnsSum > glbsSum && checked == false) {
    			checked = true;
    			chk++;
    		}
    		
    		glbsSum += glbs[i];
    		if (jmnsSum < glbsSum && checked == true) {
    			checked = false;
    			chk++;
    		}
    	}
    	
    	if (checked == false && chk >= 2) bw.write("Yes");
    	else bw.write("No");
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}