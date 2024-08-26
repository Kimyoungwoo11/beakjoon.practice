
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder re = new StringBuilder(input);
		if (input.equals(re.reverse().toString())) {
			System.out.print(1);
		} else {
			System.out.println(0);
		}
	}
}
