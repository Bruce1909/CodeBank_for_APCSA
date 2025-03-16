/**
 * VAR-2.F.3 Error Example
 * The initializer list used to create and initialize a 2D array consists of initializer
 * lists that represent 1D arrays.
 * 
 * This program demonstrates common errors when using initializer lists with 2D arrays.
 */
public class VAR2F3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with initializer lists for 2D arrays:\n");
        
        // ERROR 1: Mixing data types in initializer lists
        System.out.println("ERROR 1: Mixing data types in initializer lists");
        try {
            System.out.println("Attempting to create a 2D array with mixed data types:");
            // This will cause a compile-time error, commented out for demonstration
            // int[][] mixedTypes = {
            //     {1, 2, 3},
            //     {4, 5.5, 6},    // Error: 5.5 is a double, not an int
            //     {7, 8, 9}
            // };
            
            System.out.println("The above code would cause a compile-time error");
            System.out.println("All elements in an int[][] must be integers");
            
            // Correct way with consistent types:
            int[][] correctTypes = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("Correct initializer with consistent types created successfully");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 2: Inconsistent row lengths in initializer lists
        // Note: This is not actually an error in Java, but it's outside the scope of the AP Exam
        System.out.println("\nERROR 2: Inconsistent row lengths in initializer lists");
        System.out.println("(Note: Non-rectangular arrays are outside the scope of the AP Exam)");
        try {
            System.out.println("Creating a 2D array with inconsistent row lengths:");
            int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},        // Only 2 elements
                {6, 7, 8, 9}    // 4 elements
            };
            
            System.out.println("Java allows jagged arrays, but they're outside the AP Exam scope");
            System.out.println("Row 0 length: " + jaggedArray[0].length);
            System.out.println("Row 1 length: " + jaggedArray[1].length);
            System.out.println("Row 2 length: " + jaggedArray[2].length);
            
            // This can lead to logical errors if you assume all rows have the same length
            System.out.println("\nAttempting to access all elements assuming equal row lengths:");
            for (int i = 0; i < jaggedArray.length; i++) {
                for (int j = 0; j < 3; j++) { // Assuming all rows have 3 elements
                    try {
                        System.out.println("jaggedArray[" + i + "][" + j + "] = " + jaggedArray[i][j]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error accessing jaggedArray[" + i + "][" + j + "]: Index out of bounds");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 3: Missing inner braces in initializer lists
        System.out.println("\nERROR 3: Missing inner braces in initializer lists");
        try {
            System.out.println("Attempting to create a 2D array with missing inner braces:");
            // This will cause a compile-time error, commented out for demonstration
            // int[][] missingBraces = {
            //     1, 2, 3,    // Missing inner braces
            //     4, 5, 6,    // Missing inner braces
            //     7, 8, 9     // Missing inner braces
            // };
            
            System.out.println("The above code would cause a compile-time error");
            System.out.println("Each row in a 2D array initializer must be enclosed in its own braces");
            
            // Correct way with proper braces:
            int[][] correctBraces = {
                {1, 2, 3},    // Proper inner braces
                {4, 5, 6},    // Proper inner braces
                {7, 8, 9}     // Proper inner braces
            };
            System.out.println("Correct initializer with proper braces created successfully");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 4: Trying to initialize a 2D array with a 1D initializer
        System.out.println("\nERROR 4: Trying to initialize a 2D array with a 1D initializer");
        try {
            System.out.println("Attempting to initialize a 2D array with a 1D initializer:");
            // This will cause a compile-time error, commented out for demonstration
            // int[][] oneDimInitializer = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Missing nested braces
            
            System.out.println("The above code would cause a compile-time error");
            System.out.println("A 2D array initializer must contain nested initializers for each row");
            
            // Correct way to convert a 1D array to a 2D array with one row:
            int[] oneDArray = {1, 2, 3, 4, 5};
            int[][] twoDArray = {oneDArray}; // Wrapping the 1D array in braces makes it a 2D array with one row
            
            System.out.println("Correct way to create a 2D array with one row:");
            System.out.println("Number of rows: " + twoDArray.length);
            System.out.println("Number of columns in row 0: " + twoDArray[0].length);
            System.out.print("Contents: ");
            for (int j = 0; j < twoDArray[0].length; j++) {
                System.out.print(twoDArray[0][j] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 5: Confusing array creation with array initialization
        System.out.println("\nERROR 5: Confusing array creation with array initialization");
        try {
            System.out.println("Attempting to mix array creation syntax with initializer lists:");
            // This will cause a compile-time error, commented out for demonstration
            // int[][] mixedSyntax = new int[][] {
            //     new int[] {1, 2, 3},
            //     new int[] {4, 5, 6},
            //     new int[] {7, 8, 9}
            // };
            
            // The above is unnecessarily verbose. The correct, concise way is:
            int[][] conciseSyntax = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            
            System.out.println("Correct, concise initializer syntax used successfully");
            
            // However, this verbose syntax is valid, just not recommended:
            int[][] verboseSyntax = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            
            System.out.println("The verbose syntax also works, but is not recommended");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}