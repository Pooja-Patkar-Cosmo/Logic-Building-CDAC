import java.util.Scanner;

public class R_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=0 ; i < n ; i++){
            for(int j = 0 ; j <= 2*i ; j++){
                if (j % 2 == 0)
                    System.out.print(i+1);
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        for (int i= n ; i >= 2 ; i--){
            for ( int j = 1 ; j <= 2*i-1 ; j++){
                if (j % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print(i);
                }
            System.out.println();
        }
        sc.close();
    }
}
