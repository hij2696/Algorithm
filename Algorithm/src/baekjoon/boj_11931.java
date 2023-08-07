import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		
		for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		br.close();
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (Integer num : arr) bw.write(num + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}