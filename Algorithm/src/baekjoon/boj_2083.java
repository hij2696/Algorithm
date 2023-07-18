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
    	
    	while (true) {
    		String str = br.readLine();
    		if (str.equals("# 0 0")) break;
    		
    		StringTokenizer st = new StringTokenizer(str);
    		String name = st.nextToken();
    		int age = Integer.parseInt(st.nextToken());
    		int weight = Integer.parseInt(st.nextToken());
    		
    		if (age > 17 || weight >= 80) bw.write(name + " Senior" + "\n");
    		else bw.write(name + " Junior" + "\n");
    	}
    	bw.flush();
    	br.close();
    	bw.close();
    }
}