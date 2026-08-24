import java.util.Arrays;
import java.util.Scanner;

public class SortAsc {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int num[] = new int[5];

        System.out.println("Enter 5 integers: ");
        for(int i=0; i < num.length; i++)
            num[i] = sc.nextInt();
        sc.close();

        Arrays.sort(num);
        System.out.println("Sorted Array: ");
        for (int n : num)
            System.out.print(n + " ");      
    }
}
