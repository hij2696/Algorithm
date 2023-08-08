import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int idx = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int classNum = Integer.parseInt(st.nextToken());
			
			int[] score = new int[classNum];
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, largest = 0;
			
			for (int j = 0; j < classNum; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				
				max = (max < score[j]) ? score[j] : max;
				min = (min > score[j]) ? score[j] : min;
			}
			
			Arrays.sort(score);
			
			for (int j = 1; j < score.length; j++) {
				largest = (score[j] - score[j - 1] > largest) ? score[j] - score[j - 1] : largest;
			}
			
			bw.write("Class " + String.valueOf(++idx) + "\n");
			bw.write("Max " + String.valueOf(max) + ", Min " + String.valueOf(min) + ", Largest gap " + String.valueOf(largest) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}