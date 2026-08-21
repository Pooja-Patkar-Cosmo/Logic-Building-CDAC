import java.util.Scanner;

public class LeapYear {
    public static void main (String[]args){
        System.out.print("year: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        scan.close();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println (year + " is a Leap Year");
        else
            System.out.println (year + " is not a Leap Year");
       }
} 
    