import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int num[] = new int[5];

        System.out.println("Enter 5 integers: ");

        for(int i=0; i < num.length; i++){
            System.out.print("Enter num[" + i + "]  ");
            num[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("The elements of the array: ");
        for (int n:num)
            System.out.print(n + " ");
    }
}


       
        
        
