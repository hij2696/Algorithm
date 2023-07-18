import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static final int LEN = 4;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int[] skill_num = new int[LEN];
    	
    	for (int i = 0; i < skill_num.length; i++) {
    		skill_num[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(skill_num);
    	
    	int result = 0;
    	if ((skill_num[0] + skill_num[3]) - (skill_num[1] + skill_num[2]) >= 0)
    		result = (skill_num[0] + skill_num[3]) - (skill_num[1] + skill_num[2]);
    	else
    		result = (skill_num[1] + skill_num[2]) - (skill_num[0] + skill_num[3]);
    	
    	bw.write(String.valueOf(result));
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}