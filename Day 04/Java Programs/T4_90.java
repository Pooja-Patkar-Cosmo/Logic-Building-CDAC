import java.util.Scanner;

public class T4_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=0 ; i < n ; i++){
            int temp = 1;
            for (int j= 0 ; j <= i ; j++)
                System.out.print(temp++);
                
            System.out.println();
        } 
        sc.close(); 
    }
}




