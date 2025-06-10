import java.util.Scanner;
class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        double l = sc.nextDouble();
        System.out.println("Enter width of the rectangle:");
        double w = sc.nextDouble();
        double p = 2 * (l + w);
        System.out.println("Perimeter of the rectangle is: " + p);
    }
}
