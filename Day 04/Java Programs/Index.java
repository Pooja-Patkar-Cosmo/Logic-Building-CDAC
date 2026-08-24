import java.util.Arrays;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        Integer num[] = new Integer[5];

        System.out.println("Enter 5 integers: ");
        for(int i=0; i < num.length; i++)
            num[i] = sc.nextInt();

        System.out.print("Enter a number to find its index: ");
        int target = sc.nextInt();
        sc.close();

        int index = Arrays.asList(num).indexOf(target);

        if (index != -1)
            System.out.println("The number " + target + " is found at index " + index);
        else
            System.out.println("Not found (-1)");
    }            
}

