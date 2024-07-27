package charactercounter;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class countercopy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Gimme a word to count: ");
		String myStr = (scanner.next().toLowerCase());
		
		scanner.close();
		int count = 0;
		int c = 0;
		//System.out.println("c" + c);
		char chStore = myStr.charAt(c);
		for (int i = 0; i < myStr.length(); i++) {
			char ch = myStr.charAt(i);
			if (ch == chStore) {
				count++;
				c++;
				//System.out.println("ch" + ch);
			}
			// c++;
			//System.out.println(ch + count);
		}
		System.out.println(count);
	}
}
