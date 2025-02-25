import java.util.Scanner;

public class WordCounter {
    private Scanner scanner;

    public WordCounter() {
        scanner = new Scanner(System.in);
    }

    // Method to get sentence input from user
    public String getSentenceInput() {
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }

    // Method to count words in a sentence
    public int countWords(String sentence) {
        // Trim the sentence and split by whitespace
        String[] words = sentence.trim().split("\\s+");
        
        // If the sentence is empty (or only whitespace), return 0
        if (sentence.trim().isEmpty()) {
            return 0;
        }
        
        return words.length;
    }

    public static void main(String[] args) {
        WordCounter counter = new WordCounter();
        
        // Get input from user
        String sentence = counter.getSentenceInput();
        
        // Count words and display result
        int wordCount = counter.countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");
    }
}

