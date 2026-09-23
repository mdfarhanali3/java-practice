import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pick +,-,*,/");

        char chosenOperator = sc.next().charAt(0);

        double num1, num2;

        System.out.println("Enter First Number: ");

        num1 = sc.nextDouble();

        System.out.println("Enter Second Number: ");

        num2 = sc.nextDouble();

        switch (chosenOperator) {
            case '*':
                System.out.println((num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                } else {

                    System.out.println((num1 / num2));
                }
                break;
            case '+':
                System.out.println((num1 + num2));
                break;
            case '-':
                System.out.println((num1 - num2));
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }

        sc.close();
    }
}
