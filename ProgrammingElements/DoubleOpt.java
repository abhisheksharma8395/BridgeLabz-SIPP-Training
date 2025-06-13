import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking Input of a,b,c from user
        System.out.print("Enter a (double): ");
        double a = scanner.nextDouble();
        System.out.print("Enter b (double): ");
        double b = scanner.nextDouble();
        System.out.print("Enter c (double): ");
        double c = scanner.nextDouble();
        
        double result1 = a + b * c;     // Multiplication before addition
        double result2 = a * b + c;     // Multiplication before addition
        double result3 = c + a / b;     // Division before addition
        double result4 = a % b + c;     // Modulus before addition
        
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n", 
                         result1, result2, result3, result4);
        
        scanner.close();
    }
}