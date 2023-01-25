package class11HW;

public class twoDarrayCountry {
    public static void main(String[] args) {

        //  Create 2D array of countries: north america countries, south america countries,
        //  europe countries, asian countries, african countries.
        //  Then print all values from that array using 2 different loops
        //  and calculate how many total countries been stored
        String[][] countries = {{"Mexico", "canada", "USA", "panama"},
                {"Chile", "Argentina", "venezuela"},
                {"UK", "Ukrine", "New zealand"},
                {"Afghanistan", "India", "bangladish", "chin", "iran"},
                {"nigeria", "Kenya", "Ghana", "Morocco"}};
        int num = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                num++;

            }
            System.out.println();

        }
        System.out.println("All these countries are equal to  " + num);

        System.out.println("~~~~~~~~~~~~");
        int num1 = 0;
        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
                num1++;
            }
            System.out.println();
        }
        System.out.println("All these countries are equal to  " + num);
    }}