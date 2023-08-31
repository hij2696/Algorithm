import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	int A = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	
    	HashSet<Integer> aSet = new HashSet<>();
    	HashSet<Integer> bSet = new HashSet<>();
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < A; i++) aSet.add(Integer.parseInt(st.nextToken()));
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < B; i++) bSet.add(Integer.parseInt(st.nextToken()));
    	
    	int answer = 0;
    	for (int element : aSet) {
    		if (!bSet.contains(element)) answer++;
    	}
    	
    	for (int element : bSet) {
    		if (!aSet.contains(element)) answer++;
    	}
    	
    	bw.write(String.valueOf(answer));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}