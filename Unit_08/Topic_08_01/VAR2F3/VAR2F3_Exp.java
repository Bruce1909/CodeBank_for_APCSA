/**
 * VAR-2.F.3 Example
 * The initializer list used to create and initialize a 2D array consists of initializer
 * lists that represent 1D arrays.
 * 
 * This program demonstrates how to use initializer lists to create and initialize 2D arrays.
 */
public class VAR2F3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating initializer lists for 2D arrays:\n");
        
        // Method 1: Using initializer lists to create and initialize a 2D array
        System.out.println("Method 1: Using initializer lists to create and initialize a 2D array");
        int[][] matrix1 = {
            {1, 2, 3},    // First row (1D array)
            {4, 5, 6},    // Second row (1D array)
            {7, 8, 9}     // Third row (1D array)
        };
        
        // Print the 2D array
        System.out.println("matrix1 contents:");
        printMatrix(matrix1);
        
        // Method 2: Using initializer lists with different row lengths
        // Note: Non-rectangular arrays are outside the scope of the AP Exam
        System.out.println("\nMethod 2: Using initializer lists with different row lengths");
        System.out.println("(Note: Non-rectangular arrays are outside the scope of the AP Exam)");
        int[][] matrix2 = {
            {10, 20},           // First row has 2 elements
            {30, 40, 50},       // Second row has 3 elements
            {60, 70, 80, 90}    // Third row has 4 elements
        };
        
        // Print the 2D array with different row lengths
        System.out.println("matrix2 contents (jagged array):");
        printMatrix(matrix2);
        
        // Method 3: Using initializer lists with explicit data types
        System.out.println("\nMethod 3: Using initializer lists with explicit data types");
        double[][] matrix3 = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6}
        };
        
        // Print the double 2D array
        System.out.println("matrix3 contents (double values):");
        printDoubleMatrix(matrix3);
        
        // Method 4: Using initializer lists with String objects
        System.out.println("\nMethod 4: Using initializer lists with String objects");
        String[][] matrix4 = {
            {"Apple", "Banana", "Cherry"},
            {"Dog", "Elephant", "Fox"},
            {"Green", "Hazel", "Indigo"}
        };
        
        // Print the String 2D array
        System.out.println("matrix4 contents (String values):");
        printStringMatrix(matrix4);
        
        // Method 5: Empty initializer lists
        System.out.println("\nMethod 5: Empty initializer lists");
        int[][] emptyMatrix = {
            {},    // Empty first row
            {100},  // Second row with one element
            {}     // Empty third row
        };
        
        // Print the 2D array with empty rows
        System.out.println("emptyMatrix contents (with empty rows):");
        printMatrix(emptyMatrix);
        
        // Method 6: Nested initializer lists with expressions
        System.out.println("\nMethod 6: Nested initializer lists with expressions");
        int base = 10;
        int[][] matrix5 = {
            {base, base * 2, base * 3},
            {base * 4, base * 5, base * 6},
            {base * 7, base * 8, base * 9}
        };
        
        // Print the 2D array with calculated values
        System.out.println("matrix5 contents (calculated values):");
        printMatrix(matrix5);
    }
    
    // Helper method to print an integer 2D array
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Helper method to print a double 2D array
    public static void printDoubleMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Helper method to print a String 2D array
    public static void printStringMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}