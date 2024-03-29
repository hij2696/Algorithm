import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, t = sc.nextInt();
		
		while (t-- > 0) {
			int n = sc.nextInt(), m = sc.nextInt();
			long team[] = new long[n + 1], win[] = new long[n + 1], lose[] = new long[n + 1];
			long max = 0,min = 0;
			
			for (i = 1; i <= m; i++) {
				int a = sc.nextInt(), b = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt();
				win[a] += p; win[b] += q; lose[a] += q; lose[b] += p;
			}
			for (i = 1; i <= n; i++) {
				if (win[i] == 0 && lose[i] == 0) team[i] = 0;
				else team[i] = (win[i] * win[i]) * 1000 / (win[i] * win[i] + lose[i] * lose[i]);
				if (i == 1) {
					min = max = team[i];
					continue;
				}
				if (max < team[i]) max = team[i];
				if (team[i] < min) min = team[i];
			}
			System.out.println(max + "\n" + min);
		}
		sc.close();
	}
}