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
    	
    	String str1 = st.nextToken();
    	String str2 = st.nextToken();
    	String str3 = st.nextToken();
    	String str4 = st.nextToken();
    	
    	String str_AB = str1 + str2;
    	String str_CD = str3 + str4;
    	
    	long AB = Long.parseLong(str_AB);
    	long CD = Long.parseLong(str_CD);
    	
    	bw.write(String.valueOf(AB + CD));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}