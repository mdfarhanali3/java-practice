import java.util.Scanner;

public class StudentsGrade {

    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the score: ");
        int score = sc.nextInt();

        if((score < 0) || (score > 100)){
            System.out.println("invalid score");
        }
        else if(score < 40){
            System.out.println("F");
            
        }
        else if(score < 60){
            System.out.println("D");
            
        }
        else if(score < 80){
            System.out.println("C");
            
        }
        else if(score < 90){
            System.out.println("B");
            
        }
        else if(score <= 100){
            System.out.println("A");
            
        }
        
        sc.close();
    }
    
}
