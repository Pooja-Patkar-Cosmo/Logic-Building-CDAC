import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=0 ; i < n ; i++){
            for (int j = 0 ; j < n-i-1 ; j++)
                System.out.print(" ");
            for (int j = 0 ; j <= 2*i ; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1 ; i < n ; i++){
            for (int j = 1 ; j <= i ; j++)
                System.out.print(" ");
            for (int j = ((2*n-1)-(2*i)) ;  j > 0 ; j--)
                System.out.print("*");
            System.out.println();         
        } 
        sc.close();
    }
}


