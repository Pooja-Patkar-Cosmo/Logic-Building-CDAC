import java.util.Scanner;

public class SumOfElements{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int num[] = new int[5];

        System.out.println("Enter 5 integers: ");
        for(int i=0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        System.out.print("The sum of elements of the array: ");
        for (int n:num)
            sum += n;
            System.out.print(sum);
    }
}


       
        
        