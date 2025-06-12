import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;
        
        System.out.printf("Area of triangle is %.2f square inches or %.2f square centimeters\n", areaInches, areaCm);
        
        scanner.close();
    }
}