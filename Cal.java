import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'y';   // ✅ initialized here

        do {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            int result = 0;

            switch(op) {
                case '+':
                    result = a + b;
                    break;

                case '-':
                    result = a - b;
                    break;

                case '*':
                    result = a * b;
                    break;

                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
                    continue;
            }

            System.out.println("Answer: " + result);

            System.out.print("Do you want to calculate again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}