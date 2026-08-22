import java.util.Scanner;

public class T2_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=0 ; i < n ; i++){
            int temp = 1;
            for (int j= 0 ; j <= 2*i ; j++){
                if ( j % 2 == 0){
                    System.out.print(temp);
                    temp += 2;
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        } 
        sc.close(); 
    }
}
