package JavaPrograms;

public class PyramidPattern {

    // Method to print the pyramid
    public static void printPyramidRow(int currentRow, int totalRows) {
        if (currentRow > 0) {
            // Recursively call to print the previous rows
            printPyramidRow(currentRow - 1, totalRows);
            
            // Print leading spaces for the current row
            printCharacters(totalRows - currentRow, ' ');
            
            // Print stars for the current row
            printCharacters(2 * currentRow - 1, '*');
            
            // Move to the next line after printing one row
            System.out.println();
        }
    }

    // Method to print characters (spaces or stars)
    public static void printCharacters(int count, char character) {
        if (count > 0) {
            System.out.print(character);
            printCharacters(count - 1, character);
        }
    }

    public static void main(String[] args) {
        int totalRows = 5; // Height of the pyramid
        printPyramidRow(totalRows, totalRows);
    }
}
  
