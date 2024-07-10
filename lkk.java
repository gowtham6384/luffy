import java.util.Scanner;

public class SumOfTwoNumbers {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Main method - execution starts here
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read the second number

        // Calculate the sum of the two numbers
        int sum = add(num1, num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // Close the scanner
        scanner.close();
    }
}
