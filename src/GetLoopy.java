public class GetLoopy {
    public static void main(String[] args) {
        final int row = 5;  // Number of row

        // Outer loop for rows
        for (int i = row; i >= 1; i--) {  // Start from 5 rows and decrease
            // Inner loop for columns (print stars in each row)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Print a star followed by a space
            }
            System.out.println();
        }
    }
}