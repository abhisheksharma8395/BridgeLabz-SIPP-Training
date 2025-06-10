import java.util.Scanner;
class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter base:");
        int b = sc.nextInt();
        System.out.println("Enter exponent:");
        int e = sc.nextInt();
        int result = (int)Math.pow(b, e);
        System.out.println(b + " raised to the power " + e + " is: " + result);
    }
}
