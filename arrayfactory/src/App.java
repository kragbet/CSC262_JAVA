import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    	ArrayList<Double> values = new ArrayList<>();
        
        String userInput = "start";

        System.out.println("Problem 2 works with arrays please give me some numbers. (type 'exit' to quit): ");

        while (true){

            if (scanner.hasNextDouble()){
                values.add(scanner.nextDouble());
            } else {
                    userInput = scanner.nextLine();
                }

                if (userInput.equalsIgnoreCase("exit")){
                    break;
                }
            }          

        scanner.close();

        System.out.println("This is your array: " + values.toString());

        //Write another method that searches for the largest and smallest elements of an array of integer values and swaps them. 
        System.out.println("the Array swapping the largest and smallest numbers: " + swapLargestSmallest(values));

        // Write a method sumWithoutLargest that computes the sum of an array of integer values, except for the largest one, in a single loop.
        System.out.println("The sum of the Array without the largest number is: " + sumWithoutLargest(values));

    }

    public static double sumWithoutLargest(ArrayList<Double> c) 
    {
        
        //Sort the array
        Collections.sort(c);
        Collections.reverse(c);
        c.remove(0);
        
        //System.out.println("watch:" + values.toString());

        //loop the array for sum
        int sum = 0;
        int i;

        for (i = 0; i < c.size(); i++) {
            sum += c.get(i);
        }
        return sum;
    }

    public static ArrayList<Double> swapLargestSmallest(ArrayList<Double> a)
    {
        //collect largest and smallest numbers
        double smallestN, largestN;
        int smallest, largest;

        smallestN = Collections.min(a);
        largestN = Collections.max(a);

        smallest = a.indexOf(smallestN);
        
        largest = a.indexOf(largestN);
        
        // System.out.println("App.swapLargestSmallest()" + a);

        //swap numbers
        a.set(largest, smallestN);
        a.set(smallest, largestN);

        return a;
    }
}
