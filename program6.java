import java.util.Scanner;
class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        double p = sc.nextDouble();
        System.out.println("Enter Rate of Interest:");
        double r = sc.nextDouble();
        System.out.println("Enter Time (in years):");
        double t = sc.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + interest);
    }
}
