package class11HW;

public class twoDarrayCar {
    public static void main(String[] args) {
        // 2) Create 2D array of cars : american, german, korean, italian.
        //  Then retrieve all values from that array using 2 different loops
        String[][] car = {{"american", "german", "korean", "italian"},
                {"BMW", "Honda", "Audi"}
        };
        for (int i = 0; i < car.length; i++) {
            for (int j = 0; j < car[i].length; j++) {
                System.out.print(car[i][j] + " ");

            }
            System.out.println();

            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        }
        for (String[] strings : car) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }}