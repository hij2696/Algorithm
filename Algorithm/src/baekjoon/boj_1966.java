import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> queue = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < N; j++) {
				queue.offer(new int[] { j, Integer.parseInt(st.nextToken()) });
			}
			
			int cnt = 0;
			while (!queue.isEmpty()) {
				int[] front = queue.poll();
				boolean checked = true;
				
				for (int k = 0; k < queue.size(); k++) {
					if (front[1] < queue.get(k)[1]) {
						queue.offer(front);
						for (int l = 0; l < k; l++) {
							queue.offer(queue.poll());
						}
						checked = false;
						break;
					}
				}				
				if (!checked) continue;
				
				cnt++;
				if (front[0] == M) break;
			}
			sb.append(cnt + "\n");
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}