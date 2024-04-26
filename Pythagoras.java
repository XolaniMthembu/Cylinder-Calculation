import java.util.Scanner;

public class Pythagoras{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double x;
        double y;
        double z;
        
        System.out.println("Enter opposite side y: ");
        y = sc.nextDouble();
        
        System.out.println("Enter adjacent side x");
        x = sc.nextDouble();
        
        z = Math.sqrt(x*x + y*y);
        
        System.out.println("The hypotenuse: " +z);
    }
}