import java.util.Scanner;

public class SumOfTwo{
    public static int sumOfTwoNumbers(int x, int y){
        return x+y ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        sc.close();

        int result = sumOfTwoNumbers(a,b);
        System.out.println("The sum of " + a + " and " + b + " is " + result);


    }

    
}
