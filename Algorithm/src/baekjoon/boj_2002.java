import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		int ans = 0;
		
		for (int i = 0; i < N; i++) map.put(br.readLine(), i);
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			String carName = br.readLine();
			arr[i] = map.get(carName);
		}
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					ans++;
					break;
				}
			}
		}
		
		bw.write(String.valueOf(ans));
		
		bw.flush();
		br.close();
		bw.close();
	}
}