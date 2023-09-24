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
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	String[] str = new String[N];
    	char[] dna = new char[] {'A', 'C', 'G', 'T'};
    	
    	for (int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		str[i] = st.nextToken();
    		
    		if (str[i].length() != M) {
    			System.out.print("입력이 잘못되었습니다.");
    			System.exit(0);
    		}
    	}
    	
    	String minHammingDistanceDna = "";
    	int hammingDistance = 0;
    	
    	for (int i = 0; i < M; i++) {
    		int[] count = new int[4];
    		
    		for (int j = 0; j < N; j++) {
    			if (str[j].charAt(i) == dna[0]) count[0]++;
    			else if (str[j].charAt(i) == dna[1]) count[1]++;
    			else if (str[j].charAt(i) == dna[2]) count[2]++;
    			else count[3]++;
    		}
    		
    		int max = Integer.MIN_VALUE;
    		int maxIdx = Integer.MIN_VALUE;
    		for (int j = 0; j < count.length; j++) {
    			if (max < count[j]) {
    				max = count[j];
    				maxIdx = j;
    			}
    		}
    		
    		if (max != N) hammingDistance += N - max;
    		
    		minHammingDistanceDna += String.valueOf(dna[maxIdx]);
    	}
    	
    	bw.write(minHammingDistanceDna + "\n");
    	bw.write(String.valueOf(hammingDistance));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}