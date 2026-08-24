import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        Integer num[] = new Integer[5];

        System.out.println("Enter 5 integers: ");
        for(int i=0; i < num.length; i++)
            num[i] = sc.nextInt();

        System.out.print("\nEnter a number to search: ");
        int target = sc.nextInt();
        sc.close();

        boolean searched = Arrays.asList(num).contains(target);

        if (searched)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}
