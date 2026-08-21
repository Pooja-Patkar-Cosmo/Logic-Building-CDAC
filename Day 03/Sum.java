import java.util.Scanner;

public class Sum {
    void calculateSum(int n){
        int sum = 0;

        for (int i=0; i<=n; i++)
            sum += i;
        System.out.println("The sum of numbers from 1 to " + n + " is " + sum);
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int num = sc.nextInt();
        sc.close();
        
        // Creating object for the non-static method here
        Sum obj = new Sum();
        obj.calculateSum(num);
    } 
}


