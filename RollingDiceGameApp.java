import java.util.Random;

public class RollingDiceGameApp{
    public static void main(String[] args){
        
        Random rnd = new Random();
        
        int dice = rnd.nextInt(6)+1;
        
        System.out.println(dice);
    }
}