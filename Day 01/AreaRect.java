import java.util.Scanner;

public class AreaRect {
    public static void main(String[] args) {
        System.out.print("Enter length: ");
        Scanner scan  = new Scanner(System.in);
        int l = scan.nextInt();
        System.out.print("Enter breadth: ");
        int b = scan.nextInt();
        scan.close();

        int area = l * b;
        System.out.print("Area of rectangle: " + area);
    }
}
