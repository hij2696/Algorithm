import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Team {
	String university, teamName;
	int clearProblem, penalty;
	
	public Team (String university, String teamName, int clearProblem, int penalty) {
		this.university = university;
		this.teamName = teamName;
		this.clearProblem= clearProblem;
		this.penalty = penalty;
	}
}

public class Main {
	
	public static int N, K;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		Set<String> universities = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		Team[] teams = new Team[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String university = st.nextToken();
			String teamName = st.nextToken();
			int clearProblem = Integer.parseInt(st.nextToken());
			int penalty = Integer.parseInt(st.nextToken());
			
			teams[i] = new Team(university, teamName, clearProblem, penalty);
		}
		
		Arrays.sort(teams, (a, b) -> {
			if (a.clearProblem != b.clearProblem) {
				return b.clearProblem - a.clearProblem;
			}
			return a.penalty - b.penalty;
		});
		
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < teams.length; i++) {
			if (universities.contains(teams[i].university)) continue;
			else {
				universities.add(teams[i].university);
				sb.append(teams[i].teamName).append('\n');
				cnt++;
				if (cnt == K) break;
			}
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}