import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        // right angle triangle
        for (int i = 0; i < M; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // inverted right angle triangle
        for (int i = 0; i < M; i++) {
            for (int j = M; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Pyramid

        for (int i = 1; i <= M; i++) {

            for (int j = 1; j <= M - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

    }
}
