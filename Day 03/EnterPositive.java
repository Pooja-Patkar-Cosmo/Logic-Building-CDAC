import java.util.Scanner;

public class EnterPositive {
    public static void askForPositiveNumber(){
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a positive number: ");
            n = sc.nextInt();
        } while( n <= 0);

        System.out.println();
        System.out.println("You entered a positive number: " + n);
        sc.close();
    }

    public static void main(String[] args) {
        askForPositiveNumber();
    }
}


    
    

