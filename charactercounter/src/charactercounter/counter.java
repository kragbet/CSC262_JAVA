package charactercounter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Gimme a word to count: ");
		String myStr = (scanner.next().toLowerCase());
		
		//Convert the string to a char array
		char[] myArray = myStr.toCharArray();

	    List<Character> listC = new ArrayList<Character>();
	    for (char c : myArray) {
	        listC.add(c);
	}
	    Character l = listC.get(0);
	    int count = 0;
	    
	    for (int n = 0; n < listC.size(); n++) {
	    	if (listC.get(n) == l) {
	    		l = listC.get(n);
	    		++count;
	    		System.out.println(count);
	    	}
	    }
	    System.out.println(listC);
	}
}
