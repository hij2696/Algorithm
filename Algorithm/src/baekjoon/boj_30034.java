import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;

    	ArrayList<Character> charList = new ArrayList<>();
    	charList.add(' ');
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine(), " ");
    	for (int i = 0; i < N; i++) charList.add(st.nextToken().charAt(0));
    	
    	int M = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine(), " ");
    	for (int i = 0; i < M; i++) charList.add(st.nextToken().charAt(0));
    	
    	int K = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine(), " ");
    	for (int i = 0; i < K; i++) {
    		char c = st.nextToken().charAt(0);
    		if (charList.contains(c)) charList.removeIf(item -> item == c);
    	}
    	
    	int strLength = Integer.parseInt(br.readLine());
    	String str = br.readLine();
    	
    	StringBuilder sb = new StringBuilder();
    	
    	if (!(charList.contains(str.charAt(0)))) sb.append(str.charAt(0));
    	
    	for (int i = 1; i < strLength; i++) {
    		if (charList.contains(str.charAt(i))) {
    			if (charList.contains(str.charAt(i - 1))) continue;
    			else sb.append("\n");
    		}
    		else sb.append(str.charAt(i));
    	}
    	
    	if (sb.charAt(sb.length() - 1) == '\n') sb.deleteCharAt(sb.length() - 1);
    	
    	bw.write(sb.toString());

    	bw.flush();
    	br.close();
    	bw.close();
    }
}