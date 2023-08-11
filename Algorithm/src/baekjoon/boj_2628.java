import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		List<Integer> row = new ArrayList<>();
		List<Integer> column = new ArrayList<>();
		
		row.add(0);
		column.add(0);
		
		st = new StringTokenizer(br.readLine());
		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int type = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			
			if (type == 0) row.add(idx);
			else column.add(idx);
		}
		
		row.add(height);
		column.add(width);
		
		Collections.sort(row);
		Collections.sort(column);
		
		int ans = 0;
		
		for (int i = row.size() - 1; i > 0; i--) {
			int r = row.get(i) - row.get(i - 1);
			for (int j = column.size() - 1; j > 0; j--) {
				int c = column.get(j) - column.get(j - 1);
				int tmp = r * c;
				ans = Math.max(ans, tmp);
			}
		}
		
		bw.write(String.valueOf(ans));
		
		bw.flush();
		br.close();
		bw.close();
	}
}