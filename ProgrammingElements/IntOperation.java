import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking Input of a,b,c from user
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        
        int result1 = a + b * c;     // Multiplication has higher precedence than addition
        int result2 = a * b + c;     // Multiplication has higher precedence than addition
        int result3 = c + a / b;     // Division has higher precedence than addition
        int result4 = a % b + c;     // Modulus has same precedence as division
        
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", 
                         result1, result2, result3, result4);
        
        scanner.close();
    }
}