import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        String status = n % 2 ==0 ? " is Even" : " is Odd";
        System.out.println( n + status);
    }
}
