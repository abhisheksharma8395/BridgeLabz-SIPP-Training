import java.util.Scanner;
class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder:");
        double r = sc.nextDouble();

        System.out.println("Enter height of the cylinder:");
        double h = sc.nextDouble();

        double volume = Math.PI * r * r * h;
        System.out.println("Volume of the cylinder is: " + volume);
    }
}
