import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to the Calculator!");

                System.out.print(" ১ নাম্বার বলুন  : ");
                double num1 = scanner.nextDouble();

                System.out.print(" ২ নাম্বার বলুন : ");
                double num2 = scanner.nextDouble();

                System.out.println("Select an operation:");
                System.out.println("1.(+) Addition");
                System.out.println("2.(-) Subtraction");
                System.out.println("3.(*) Multiplication");
                System.out.println("4.(/) Division");
                System.out.print("Enter your choice (1-4): ");


                int choice = scanner.nextInt();
                double result = 0;

                if (choice == 1) {
                    result = num1 + num2;
                } else if (choice == 2) {
                    result = num1 - num2;
                } else if (choice == 3) {
                    result = num1 * num2;
                } else if (choice == 4) {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Invalid choice!");
                    System.exit(0);
                }

                System.out.println("Result: " + result);

                scanner.close();
            }
        }





