import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Person {
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	Person[] persons = new Person[N];
    	
    	for (int i = 0; i < N; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int age = Integer.parseInt(st.nextToken());
    		String name = st.nextToken();
    		
    		persons[i] = new Person(age, name);
    	}
    	
    	Arrays.sort(persons, (a, b) -> {
    		return a.age - b.age;
    	});
    	
    	for (int i = 0; i < persons.length; i++) {
    		bw.write(String.valueOf(persons[i].age) + " " + String.valueOf(persons[i].name) + "\n");
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}