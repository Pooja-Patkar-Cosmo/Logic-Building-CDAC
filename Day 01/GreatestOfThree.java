import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= scan.nextInt();
        System.out.print("Enter the value of b: ");
        int b= scan.nextInt();
        System.out.print("Enter the value of c: ");
        int c= scan.nextInt();
        scan.close();

        int result;

        if (a > b && a > c){
            result = a;
        } else if (b > a && b > c){
            result = b;
        }
        else {
            result = c;
        }

/*      int result = Math.max(a, Math.max(b, c)); */ 
        System.out.println(result + " is greatest"); 
   
    }
}
