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
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) set.add(br.readLine());
		
		ArrayList<String> answer = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if (set.contains(str)) answer.add(str);
		}
		
		Collections.sort(answer);
		
		bw.write(answer.size() + "\n");
		
		for (String s : answer) bw.write(s + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}