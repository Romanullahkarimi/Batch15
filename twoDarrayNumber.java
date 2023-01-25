package class11HW;

public class twoDarrayNumber {
    public static void main(String[] args) {
        // Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.
        int[][] sumOfNumber = {{23, 42, 24, 24,},
                {4, 7, 7, 56},
                {1, 5, 6}};
        int sum = 0;
        for (int i = 0; i < sumOfNumber.length; i++) {
            for (int j = 0; j < sumOfNumber[i].length; j++) {
                sum += sumOfNumber[i][j];

            }

        }
        System.out.println(sum);


    }}