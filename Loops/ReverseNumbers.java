import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        int sumDigits = 0;
        int reverseNumbers = 0;

        while (M != 0) {
            int digit = M % 10;
            sumDigits += digit;
            reverseNumbers = (reverseNumbers * 10) + digit;

            M /= 10;
        }

        System.out.println(sumDigits);
        System.out.println(reverseNumbers);

    }

}