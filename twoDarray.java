package class11HW;

public class twoDarray {
    public static void main(String[] args) {
       // 1) Create a 2D array(shorter way) in which first array will consist of 4 names
        // and second array will contain grades. Then your program should print name of the students
        // that has A and B grade

        String[][]name={{"Roman","karimi","Afghan","jan"},
                        {"A","B","C","D"}};
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                if(name[i][j].equalsIgnoreCase("A")|| name[i][j].equalsIgnoreCase("B")){
                    System.out.println(name[0][j]);
                }

            }
            System.out.println();

        }

    }
}
