package class12;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
      /*  3) Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL*/


        Scanner scan=new Scanner(System.in);
        System.out.println("What is your mom's name?");
        String momsname=scan.next();
        System.out.println("what is your Dad's name?");
        String dadname=scan.next();
        System.out.println("are you expecting boy or girl?");
        String boy=scan.next();

        if(boy.equalsIgnoreCase("boy")){
            System.out.println(" baby name:"+((dadname.substring(0,3))+(momsname.substring(2))).toUpperCase());

        }else {
            System.out.println(" baby name:"+((momsname.substring(0,2))+dadname.substring((3))).toUpperCase());
        }


    }
}
