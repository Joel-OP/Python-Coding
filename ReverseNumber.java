import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = input.nextInt();

        // Ensure the number is a 3-digit number
        if (number >= 100 && number <= 999) {
            int originalNumber = number;
            int reversedNumber = 0;

            // Loop to extract digits and build the reversed number
            while (number > 0) {
                int digit = number % 10; // Get the last digit
                reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
                number /= 10; // Remove the last digit from the original number
            }

            System.out.println("The reverse of " + originalNumber + " is: " + reversedNumber);
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }

        input.close();
    }
}
