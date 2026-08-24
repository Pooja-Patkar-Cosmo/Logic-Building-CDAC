import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        int fact = 1;

        if (n == 0 )
            System.out.println(n);
        else{
            for (int i = n; i >=1; i--)
            fact *= i;
            n--;
        }
        System.out.println("Factorial of " + " n " + " is " + fact );


    }
}
