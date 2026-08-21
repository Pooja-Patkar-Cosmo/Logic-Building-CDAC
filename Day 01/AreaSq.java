import java.util.Scanner;

public class AreaSq {
    public static void main(String[] args) {
        System.out.print("Enter the side of a square: ");
        Scanner scan  = new Scanner(System.in);
        int s = scan.nextInt();
        scan.close();

        int area = s * s;
        System.out.print("Area of square: " + area);
    }
}
