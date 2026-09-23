import java.util.Scanner;

public class SimpleInterest{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal");
        double Principal = sc.nextDouble();
        System.out.println("Enter Rate%");
        double Rate = sc.nextDouble();
        System.out.println("Enter Time in years");
        double Time = sc.nextDouble();

        double SimpleInterest = (Principal*Rate*Time)/100;

        System.out.println("Simple Interest: " + SimpleInterest);
        
        System.out.println("Total Amount: " + (Principal+SimpleInterest));

        sc.close();
    }
}