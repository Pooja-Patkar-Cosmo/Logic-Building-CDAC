import java.util.Scanner;

public class Pos {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();

        if (a==0){
            System.out.print("Zero");
        }
        else{
            String result= a > 0 ? "Positive" : "Negative";
            System.out.println(result);
        }
    }
}
