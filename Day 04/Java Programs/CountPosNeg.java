import java.util.Scanner;

public class CountPosNeg {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int num[] = new int[6];
        System.out.println("Enter 6 integers: ");
        for(int i=0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        sc.close();

        int pos = 0, neg = 0, zero = 0;
        for(int i=0; i < num.length; i++){
            if (num[i] == 0)
                zero += 1;
            else if (num[i] > 0)
                pos += 1;
            else
                neg += 1;
        }

        System.out.println("Elements which are zero: " + zero); 
        System.out.println("Positive elements: " + pos);  
        System.out.println("Negative elements: " + neg);    
    }
}
