// YoungestAndTallestFinder.java

import java.util.Scanner;

public class YoungestAndTallestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();

        // Find youngest
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony)
            youngest = "Amar";
        else if (ageAkbar <= ageAnthony)
            youngest = "Akbar";
        else
            youngest = "Anthony";

        // Find tallest
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony)
            tallest = "Amar";
        else if (heightAkbar >= heightAnthony)
            tallest = "Akbar";
        else
            tallest = "Anthony";

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
