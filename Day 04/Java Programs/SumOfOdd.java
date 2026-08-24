import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        int sum = 0;

        for (int i=0; i<=n; i++){
            if (i % 2 !=0)
                sum += i;
        }
        System.out.println("The sum of odd numbers from 1 to " + n + " is " + sum);
        
    }
}

