import java.util.Scanner;

public class ReverseString{
    public static String Rev(String s){
        if (s == null) return null;

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;            
        } 
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();

        String reversed = Rev(str);
        System.out.println("\nReversed string: " + reversed);     
    }
}


   
      