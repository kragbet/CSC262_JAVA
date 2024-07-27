import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
        System.out.println("Hello, for Assignment I have to create word counters of various types. Please give me a sentence to test my methods: ");

        Scanner scanner = new Scanner(System.in);

        String myStr = (scanner.nextLine());

        scanner.close();

        int ans3 = countWords(myStr);
        int ans2 = nextNonSpacePosition(myStr, 0);
        int ans1 = nextSpacePosition(myStr, 0);

        System.out.println("Character position of the next blank character (starting from 0): " + ans1);
        System.out.println("Character position of the next non-blank character(starting from 0): " + ans2);
        System.out.println("Number of words in your phrase: " + ans3);

    }
        /**
        * Finds the position of the next blank character in a String
        * If none exists, the length of the string is returned.
        * @param str string containing characters to search
        * @param from character position where the search starts
        * @return character position of the next blank character
        */
        public static int nextSpacePosition(String str, int from)
        {
            String c = " ";

            int posA = str.indexOf(c);

            return posA;
        }

        /**
        * Finds the position of the next non-blank character in a String
        * If none exists, the length of the string is returned.
        * @param str string containing characters to search
        * @param from character position where the search starts
        * @return character position of the next non-blank character
        */
        public static int nextNonSpacePosition(String str, int from) 
        {
            String c = " ";

            int posB = str.indexOf(c) + 1;
            
            if(str.charAt(posB) != ' ')
            {
                return posB;
            } else
            {
                return str.length();
            } 
        }

        /**
        * Count the number of words in a given string
        * A word is a sequence of characters separated by any # of spaces
        * @param str string to count words in
        * @return number of words in str
        */
        public static int countWords(String str) 
        {
            int count = 1;

            for(int i=0; i < str.length()-1; i++) 
            {
                
                if ((str.charAt(i) == ' ') && (str.charAt(i+1) !=' ')) 
                {
                    count++;
                }
            }
            return count;
        }            
}
    
