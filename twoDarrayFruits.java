package class11HW;

public class twoDarrayFruits {
    public static void main(String[] args) {
        //  3) Using 2D array create a grocery list.
        //  Inside you should have an array of veggies, fruits, dairy and sweets.
        //Retrieve all values from that array using 2 different loops
        String[][] fruits = {{"onions", "lettus", "tomato"},
                {"Apple", "Watermelon", "mango"},
                {"peanut", "nuts", "Almond", "walnut"},
                {"chocolate", "cake", "candy"}
        };
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                System.out.print(fruits[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (String[] fruit : fruits) {
            for (String s : fruit) {
                System.out.print(s + " ");


            }
            System.out.println();
        }
    }}