import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static final int NUM = 6;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr1 = {1, 1, 2, 2, 2, 8};
		int[] arr2 = new int[NUM];
		
		for(int i = 0; i < NUM; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
			
			int num = arr1[i] - arr2[i];
			
			System.out.print(num + " ");
		}
	}
}