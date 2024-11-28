import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their full name
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();

        // Split the full name to get the first name
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];

        // Greet the user
        System.out.println("Hello, " + firstName + "!");
        System.out.println("Hope you have a great day ahead!");
    }
}
