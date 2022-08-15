import java.util.Scanner;
public class admission{
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your gpa ");
        
        double gpa = keyboard.nextDouble();
        
        System.out.println("Please enter your test score ");
        
        double score = keyboard.nextDouble();
        
        if(gpa >= 3.0)
        {
            if(score >= 60)
            System.out.println("You are accepted!");
            
            else
            System.out.println("You are not accepted");
        }
        else 
        if(score >= 80)
        System.out.println("You are accepted!");
    }
}