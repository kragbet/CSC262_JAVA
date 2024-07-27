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

		scanner.close();
		
		System.out.println("These are our numbers: " + values);
//		System.out.println(values.size());
		
		//average
		
		double sum = 0;
		for (double value : values) {
		 sum += value;	
		}
		
		double totalA = sum/values.size();
		
		System.out.println("Average of input values: " + totalA);
		
		//smallest and largest in array
		double small = values.get(0);
		double large = values.get(0);
		//Loop through array
		for (int n = 0; n < values.size(); n++) {
			//compare numbers with array
			if(values.get(n) < small) {
			small = values.get(n);
			}
			if(values.get(n) > large) {
				large = values.get(n);
			}
		}
		System.out.println("Smallest element present in given array: " + small);
		System.out.println("Largest element present in given array: " + large);
		
		// Calculate range
		double range = large - small;
		System.out.println("Range of the values: " + range);
	}
}
