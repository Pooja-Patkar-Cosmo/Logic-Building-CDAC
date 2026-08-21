import java.util.Scanner;

public class AgeCategory {
    public static void checkAgeCategory(int x){
        if (x <18)
            System.out.println("You are a minor");
        else if(x >= 18 && x < 60)
            System.out.println("You are an adult");
        else 
            System.out.println("You are a senior citizen");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.close();
        
        checkAgeCategory(age);
    } 
}
