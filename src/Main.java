import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner for user input
        // Ask the user to enter their age
        // If the age is 21 or older
        // Display that they get a paper wrist band

        Scanner in = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid age: " + trash);
        }
    }
}
