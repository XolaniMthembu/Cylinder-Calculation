import java.util.Scanner;

public class Greeting{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is your name?: ");
        String name = sc.nextLine();
        
        System.out.print("How old are you?: ");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.print("What is your favorite food? ");
        String food = sc.nextLine();
    
        
        System.out.print("Hello "+name + " you are " + age + " years old.");
        System.out.print("You like " + food );
        
        
        
    }
    
}