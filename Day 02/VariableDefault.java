public class VariableDefault {
    // Declaring variables as instance variables to show Java's default values
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;

    public void printValues(){
        System.out.println("Default value of byte a: " + a);
        System.out.println("Default value of short b: " + b);
        System.out.println("Default value of int c: " + c);
        System.out.println("Default value of long d: " + d);
        System.out.println("Default value of float e: " + e);
        System.out.println("Default value of double f: " + f);
        System.out.println("Default value of char g: [" + g + "]");
        System.out.println("Default value of boolean h: " + h);
    }
    public static void main(String[] args) {
        VariableDemo demo = new VariableDemo();
        demo.printValues();        
        }
      
}

