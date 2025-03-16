/**
 * This class demonstrates standard algorithms that utilize String traversals
 * as described in CON-2.F.1 of the AP Computer Science A curriculum.
 */
public class CON2F1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating standard algorithms from CON-2.F.1:\n");
        
        // Example 1: Finding if one or more substrings has a particular property
        System.out.println("Example 1: Finding substrings with particular properties");
        String text1 = "The quick brown fox jumps over the lazy dog";
        
        // Check if the string contains a specific substring
        String searchTerm = "fox";
        boolean containsSubstring = containsSubstring(text1, searchTerm);
        System.out.println("Does the text contain '" + searchTerm + "'? " + containsSubstring);
        
        // Check if the string contains any uppercase letters
        boolean hasUppercase = hasUppercaseLetters(text1);
        System.out.println("Does the text contain uppercase letters? " + hasUppercase);
        
        // Check if the string starts with a specific prefix
        String prefix = "The";
        boolean startsWithPrefix = startsWithPrefix(text1, prefix);
        System.out.println("Does the text start with '" + prefix + "'? " + startsWithPrefix);
        System.out.println();
        
        // Example 2: Determining the number of substrings that meet specific criteria
        System.out.println("Example 2: Counting substrings meeting specific criteria");
        String text2 = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?";
        
        // Count occurrences of a specific substring
        String targetWord = "wood";
        int occurrences = countOccurrences(text2, targetWord);
        System.out.println("Number of occurrences of '" + targetWord + "': " + occurrences);
        
        // Count words in a string
        int wordCount = countWords(text2);
        System.out.println("Number of words: " + wordCount);
        
        // Count vowels in a string
        int vowelCount = countVowels(text2);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println();
        
        // Example 3: Creating a new string with the characters reversed
        System.out.println("Example 3: Reversing strings");
        String original = "Computer Science";
        String reversed = reverseString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
        
        // Reverse only the words in a sentence
        String sentence = "Java programming is fun";
        String reversedWords = reverseWords(sentence);
        System.out.println("\nOriginal sentence: " + sentence);
        System.out.println("Sentence with reversed words: " + reversedWords);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about String Traversal Algorithms in CON-2.F.1 ---");
        System.out.println("1. Finding substrings with properties: Use loops or built-in methods to check characters");
        System.out.println("2. Counting substrings: Use counters and string traversal to count occurrences");
        System.out.println("3. Reversing strings: Traverse the string in reverse order or use StringBuilder");
    }
    
    /**
     * Checks if a string contains a specific substring
     * @param str The string to check
     * @param substring The substring to search for
     * @return true if the substring is found, false otherwise
     */
    public static boolean containsSubstring(String str, String substring) {
        // Method 1: Using built-in method
        return str.contains(substring);
        
        /* Method 2: Manual implementation (commented out)
        for (int i = 0; i <= str.length() - substring.length(); i++) {
            boolean found = true;
            for (int j = 0; j < substring.length(); j++) {
                if (str.charAt(i + j) != substring.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
        */
    }
    
    /**
     * Checks if a string contains any uppercase letters
     * @param str The string to check
     * @return true if the string contains uppercase letters, false otherwise
     */
    public static boolean hasUppercaseLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks if a string starts with a specific prefix
     * @param str The string to check
     * @param prefix The prefix to check for
     * @return true if the string starts with the prefix, false otherwise
     */
    public static boolean startsWithPrefix(String str, String prefix) {
        // Method 1: Using built-in method
        return str.startsWith(prefix);
        
        /* Method 2: Manual implementation (commented out)
        if (str.length() < prefix.length()) {
            return false;
        }
        
        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
        */
    }
    
    /**
     * Counts the number of occurrences of a substring in a string
     * @param str The string to search in
     * @param substring The substring to count
     * @return The number of occurrences
     */
    public static int countOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;
        
        // Find each occurrence of the substring
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move past the current occurrence
        }
        
        return count;
    }
    
    /**
     * Counts the number of words in a string
     * @param str The string to count words in
     * @return The number of words
     */
    public static int countWords(String str) {
        // Remove leading and trailing whitespace
        str = str.trim();
        
        // If the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }
        
        // Split the string by whitespace and count the resulting array length
        String[] words = str.split("\\s+");
        return words.length;
    }
    
    /**
     * Counts the number of vowels in a string
     * @param str The string to count vowels in
     * @return The number of vowels
     */
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase for easier comparison
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        
        return count;
    }
    
    /**
     * Reverses a string
     * @param str The string to reverse
     * @return The reversed string
     */
    public static String reverseString(String str) {
        // Method 1: Using StringBuilder
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
        
        /* Method 2: Manual implementation (commented out)
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
        */
    }
    
    /**
     * Reverses each word in a sentence while maintaining word order
     * @param sentence The sentence to process
     * @return The sentence with each word reversed
     */
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            // Reverse each word
            String reversedWord = reverseString(words[i]);
            result.append(reversedWord);
            
            // Add space after each word except the last one
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}