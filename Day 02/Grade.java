import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter the obtained marks ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Maths: ");
        int Maths = scan.nextInt();
        System.out.print("Science: ");
        int Science = scan.nextInt();
        System.out.print("History: ");
        int History = scan.nextInt();
        scan.close();

        System.out.println("");

        int avg = CalAvg(Maths, Science, History);
        System.out.println("Average is " + avg);

        char grade;

        if (avg >= 90){
         grade ='A';
        }
        else if (avg  >= 70 && avg <= 89){
            grade = 'B';
        }
        else if (avg  >= 50 && avg <= 69){
            grade = 'C';
        }
        else if (avg   >= 30 && avg <= 49){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }

    static int CalAvg(int m, int s, int h){
        int a;
        a= (m+s+h)/3;

        return a;
    }
}
