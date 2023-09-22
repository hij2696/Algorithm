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
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] arr1 = new int[N];
    	int[] arr2 = new int[N];
    	int answer = 0;
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < arr1.length; i++) arr1[i] = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < arr2.length; i++) arr2[i] = Integer.parseInt(st.nextToken());
    	
    	for (int i = 0; i < arr1.length; i++) if (arr1[i] <= arr2[i]) answer++;
    	
    	bw.write(String.valueOf(answer));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}