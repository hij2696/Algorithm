import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str1 = br.readLine();
    	String[] cur_time = str1.split(":");
    	String str2 = br.readLine();
    	String[] start_time = str2.split(":");
    	
    	int sum1 = (Integer.parseInt(cur_time[0]) * 60 * 60) + (Integer.parseInt(cur_time[1]) * 60) + Integer.parseInt(cur_time[2]);
    	int sum2 = (Integer.parseInt(start_time[0]) * 60 * 60) + (Integer.parseInt(start_time[1]) * 60) + Integer.parseInt(start_time[2]);
    	
    	int ans = 0;
    	
    	if (sum2 - sum1 > 0) ans = sum2 - sum1;
    	else ans = (60 * 60 * 24) - (sum1 - sum2);
    	
    	int hour = ((ans / 60) / 60);
    	ans -= hour * 60 * 60;
    	int	minute = ans / 60;
    	ans -= minute * 60;
    	int second = ans;
    	
    	String str_hour = String.format("%02d", hour);
    	String str_minute = String.format("%02d", minute);
    	String str_second = String.format("%02d", second);
    	
    	bw.write(str_hour + ":" + str_minute + ":" + str_second);
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}