/**
 * This class demonstrates common errors in standard algorithms that utilize String traversals
 * as described in CON-2.F.1 of the AP Computer Science A curriculum.
 */
public class CON2F1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in string algorithms from CON-2.F.1:\n");
        
        // Example 1: Errors in finding if substrings have particular properties
        System.out.println("Example 1: Errors in finding substrings with particular properties");
        String text1 = "The quick brown fox jumps over the lazy dog";
        
        // Error 1: Case sensitivity issues
        System.out.println("\nError 1: Case sensitivity issues:");
        String searchTerm = "Fox"; // Note the capital F
        boolean correctResult = containsSubstringCorrect(text1, searchTerm);
        boolean incorrectResult = containsSubstringError1(text1, searchTerm);
        System.out.println("Correct check for '" + searchTerm + "': " + correctResult);
        System.out.println("Incorrect check (case-sensitive): " + incorrectResult);
        System.out.println("The error is not accounting for case differences");
        
        // Error 2: Off-by-one error in substring search
        System.out.println("\nError 2: Off-by-one error in substring search:");
        String prefix = "The";
        boolean correctPrefix = startsWithPrefixCorrect(text1, prefix);
        boolean incorrectPrefix = startsWithPrefixError2(text1, prefix);
        System.out.println("Correct check for prefix '" + prefix + "': " + correctPrefix);
        System.out.println("Incorrect check (off-by-one): " + incorrectPrefix);
        System.out.println("The error is using an incorrect loop boundary");
        
        // Example 2: Errors in determining the number of substrings that meet criteria
        System.out.println("\nExample 2: Errors in counting substrings");
        String text2 = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?";
        
        // Error 1: Overlapping occurrences
        System.out.println("\nError 1: Not handling overlapping occurrences:");
        String overlapText = "abababa"; // Contains overlapping "aba" patterns
        String overlapPattern = "aba";
        int correctOverlapCount = countOccurrencesCorrect(overlapText, overlapPattern);
        int incorrectOverlapCount = countOccurrencesError1(overlapText, overlapPattern);
        System.out.println("Correct count of '" + overlapPattern + "' in '" + overlapText + "': " + correctOverlapCount);
        System.out.println("Incorrect count (missing overlaps): " + incorrectOverlapCount);
        
        // Error 2: Incorrect word counting
        System.out.println("\nError 2: Incorrect word counting:");
        String textWithSpaces = "  Multiple   spaces   between   words  ";
        int correctWordCount = countWordsCorrect(textWithSpaces);
        int incorrectWordCount = countWordsError2(textWithSpaces);
        System.out.println("Correct word count: " + correctWordCount);
        System.out.println("Incorrect word count: " + incorrectWordCount);
        System.out.println("The error is not properly handling multiple spaces");
        
        // Example 3: Errors in creating reversed strings
        System.out.println("\nExample 3: Errors in string reversal");
        String original = "Computer Science";
        
        // Error 1: Incorrect manual reversal
        System.out.println("\nError 1: Incorrect manual string reversal:");
        String correctReversed = reverseStringCorrect(original);
        String incorrectReversed = reverseStringError1(original);
        System.out.println("Original string: " + original);
        System.out.println("Correctly reversed: " + correctReversed);
        System.out.println("Incorrectly reversed: " + incorrectReversed);
        System.out.println("The error is in the loop boundary condition");
        
        // Error 2: Incorrect word reversal in a sentence
        System.out.println("\nError 2: Incorrect word reversal in a sentence:");
        String sentence = "Java programming is fun";
        String correctReversedWords = reverseWordsCorrect(sentence);
        String incorrectReversedWords = reverseWordsError2(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Correctly reversed words: " + correctReversedWords);
        System.out.println("Incorrectly reversed words: " + incorrectReversedWords);
        System.out.println("The error is reversing the entire sentence instead of individual words");
        
        // Summary
        System.out.println("\n--- Common Errors in String Traversal Algorithms ---");
        System.out.println("1. Finding substrings with properties:");
        System.out.println("   - Not accounting for case sensitivity");
        System.out.println("   - Off-by-one errors in loop boundaries");
        System.out.println("2. Counting substrings:");
        System.out.println("   - Not handling overlapping occurrences");
        System.out.println("   - Incorrect handling of whitespace");
        System.out.println("3. Reversing strings:");
        System.out.println("   - Incorrect loop boundaries in manual reversal");
        System.out.println("   - Confusing whole-string reversal with word-by-word reversal");
    }
    
    // CORRECT IMPLEMENTATIONS
    
    /**
     * Correctly checks if a string contains a specific substring (case-insensitive)
     */
    public static boolean containsSubstringCorrect(String str, String substring) {
        return str.toLowerCase().contains(substring.toLowerCase());
    }
    
    /**
     * Correctly checks if a string starts with a specific prefix
     */
    public static boolean startsWithPrefixCorrect(String str, String prefix) {
        if (str.length() < prefix.length()) {
            return false;
        }
        
        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Correctly counts occurrences of a substring, including overlapping ones
     */
    public static int countOccurrencesCorrect(String str, String substring) {
        int count = 0;
        
        // Check for empty strings
        if (str.isEmpty() || substring.isEmpty() || substring.length() > str.length()) {
            return 0;
        }
        
        // Count overlapping occurrences by advancing only one character at a time
        for (int i = 0; i <= str.length() - substring.length(); i++) {
            if (str.substring(i, i + substring.length()).equals(substring)) {
                count++;
            }
        }
        
        return count;
    }
    
    /**
     * Correctly counts words in a string, handling multiple spaces
     */
    public static int countWordsCorrect(String str) {
        // Remove leading and trailing whitespace
        str = str.trim();
        
        // If the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }
        
        // Split the string by one or more whitespace characters
        String[] words = str.split("\\s+");
        return words.length;
    }
    
    /**
     * Correctly reverses a string
     */
    public static String reverseStringCorrect(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Move towards the center
            left++;
            right--;
        }
        
        return new String(charArray);
    }
    
    /**
     * Correctly reverses each word in a sentence while maintaining word order
     */
    public static String reverseWordsCorrect(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            // Reverse each word
            String reversedWord = reverseStringCorrect(words[i]);
            result.append(reversedWord);
            
            // Add space after each word except the last one
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    
    // ERROR IMPLEMENTATIONS
    
    /**
     * Error 1: Case-sensitive substring check when case-insensitive is needed
     */
    public static boolean containsSubstringError1(String str, String substring) {
        // ERROR: Not accounting for case differences
        return str.contains(substring); // This is case-sensitive
    }
    
    /**
     * Error 2: Off-by-one error in prefix check
     */
    public static boolean startsWithPrefixError2(String str, String prefix) {
        if (str.length() < prefix.length()) {
            return false;
        }
        
        // ERROR: Off-by-one error in the loop boundary
        // This checks one character beyond the prefix length
        for (int i = 0; i <= prefix.length(); i++) { // Should be i < prefix.length()
            if (i == prefix.length()) {
                return true;
            }
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Error 1: Not handling overlapping occurrences in substring counting
     */
    public static int countOccurrencesError1(String str, String substring) {
        int count = 0;
        int index = 0;
        
        // ERROR: This skips overlapping occurrences
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Skips potential overlapping occurrences
        }
        
        return count;
    }
    
    /**
     * Error 2: Incorrect handling of multiple spaces in word counting
     */
    public static int countWordsError2(String str) {
        // ERROR: Not properly handling multiple spaces
        // Simply splits by single space, which counts empty strings between multiple spaces
        String[] words = str.split(" ");
        
        // This will count empty strings between multiple spaces as words
        return words.length;
    }
    
    /**
     * Error 1: Incorrect loop boundary in manual string reversal
     */
    public static String reverseStringError1(String str) {
        char[] charArray = str.toCharArray();
        
        // ERROR: Incorrect loop boundary causing only partial reversal
        // This only swaps half the characters needed
        for (int i = 0; i < charArray.length / 4; i++) { // Should be length/2
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }
        
        return new String(charArray);
    }
    
    /**
     * Error 2: Reversing the entire sentence instead of individual words
     */
    public static String reverseWordsError2(String sentence) {
        // ERROR: This reverses the entire sentence, not individual words
        return reverseStringCorrect(sentence);
    }
}