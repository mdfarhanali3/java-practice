import java.util.Scanner;

public class TempConverter {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        double celcius = sc.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;
        double kelvin = celcius + 273.15;

        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}