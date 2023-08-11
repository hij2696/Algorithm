import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) set.add(Integer.parseInt(st.nextToken()));
		
		ArrayList<Integer> arr = new ArrayList<Integer>(set);
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (int i : arr) sb.append(i).append(" ");
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}