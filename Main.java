import java.util.Scanner;
import java.text.DecimalFormat;  

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double area, volume, height, radius;
        double PI;
        
        System.out.print("Enter the height of a cylinder: ");
        height = sc.nextDouble();
        
        System.out.print("Enter the radius of a cylinder: ");
        radius = sc.nextDouble();
        
        area = 2 * Math.PI * radius * height;
        volume = Math.PI * Math.sqrt(radius) * height;
        
        System.out.println("The Surface Area of a Cylinder is : " + df.format(area));
        System.out.println("The Volume of the the Cylinder is : " + df.format(volume));
        
        
        
    }
}