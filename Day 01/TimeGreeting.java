import java.util.Scanner;

public class TimeGreeting {
    public static void main(String[] args) {
        System.out.print("Enter the time (24-hour format): ");
        Scanner scan  = new Scanner(System.in);
        int t = scan.nextInt();
        scan.close();

        if (t >= 5 && t <= 12){
            System.out.print("Good Morning");
        }
    }
}
