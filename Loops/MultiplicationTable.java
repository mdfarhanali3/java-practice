import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int i = 1;

        while (i < 11) {
            System.out.println(M + " * " + i + " = " + (M * i));
            i++;
        }
    }

}
