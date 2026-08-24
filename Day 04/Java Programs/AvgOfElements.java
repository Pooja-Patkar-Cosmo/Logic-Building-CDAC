import java.util.Arrays;
import java.util.Scanner;

public class AvgOfElements {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int num[] = new int[5];

        System.out.println("Enter 5 integers: ");
        for(int i=0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        double average = Arrays.stream(num).average().orElse(0.0);
        System.out.println("The average of the elements is: " + average);         
    }
}





