import java.util.Scanner;

public class WeekDaysApp{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int day;
        
        System.out.println("What is today's day of the week?: ");
        day = sc.nextInt();
        
        switch(day){
            case 1: System.out.println("It is Sunday");
            break;
            case 2: System.out.println("It is Monday");
            break;
            case 3: System.out.println("It is Tuesday");
            break;
            case 4: System.out.println("It is Wensday");
            break;
            case 5: System.out.println("It is Thursday");
            break;
            case 6: System.out.println("It is Friday");
            break;
            case 7: System.out.println("It is Saturday");
            break;
            default: System.out.println("That is not a day of the week.");
            
        }
        
    }
    
}