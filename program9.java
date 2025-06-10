import java.util.Scanner;
class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
        double a = sc.nextDouble();
		System.out.println("Enter second number:");
        double b = sc.nextDouble();
		System.out.println("Enter third number:");
        double c = sc.nextDouble();
		double average = (a + b + c) / 3;
        System.out.println("Average of the three numbers is: " + average);
    }
}
