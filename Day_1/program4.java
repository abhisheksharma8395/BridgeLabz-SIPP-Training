import java.util.Scanner;
class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double r = sc.nextDouble();

        double a = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + a);
    }
}
