package dataanalyzer;
import java.util.ArrayList;
import java.util.Scanner;

public class analyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> values = new ArrayList<>();
		
		System.out.println("Enter 5 floating-point values: ");
		
		int i = 0;
		while (i < 5) {
			values.add(scanner.nextDouble());
			i++;
		} 
		
		System.out.println("These are our numbers: " + values);
//		System.out.println(values.size());
		
		//average
		System.out.println("They Average to: ");
		
		double sum = 0;
		for (double value : values) {
		 sum += value;	
		}
		
		double totalA = sum/values.size();

	}

}
