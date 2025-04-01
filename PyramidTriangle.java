import java.util.Scanner;  // ✅ Import Scanner

public class PyramidTriangle {  // ✅ Class name should match the filename
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // ✅ Correctly declare Scanner

        System.out.println("Enter the Number of rows: ");  
        int rows = scanner.nextInt();  // ✅ Read user input

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i; j++) {  
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();  // ✅ Scanner now exists inside the main method
    }
}

