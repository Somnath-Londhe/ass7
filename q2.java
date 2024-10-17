import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWordsInFile {

    // Function to reverse a word
    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        // Check if filename is provided
        if (args.length < 1) {
            System.out.println("Please provide the filename as a command line argument.");
            return;
        }

        String filename = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                // Reverse each word and print it
                for (String word : words) {
                    String reversed = reverseWord(word);
                    System.out.print(reversed + " ");
                }
                System.out.println(); // Move to the next line after printing all words in the line
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
