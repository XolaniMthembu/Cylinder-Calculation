import java.util.Scanner;

public class DecisionApp{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int age;
        
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        
        if(age < 13)
        {
           System.out.println("You are a child"); 
            
        }
        else if(age >= 13 && age <= 18)
        {
            System.out.println("You are a teenager");
        }
        else if(age > 18 && age <= 59)
        {
            System.out.println("You are an adult");
        }
        else{
            
            System.out.println("Okay boomer!!!");
        }
        
        
    }
}