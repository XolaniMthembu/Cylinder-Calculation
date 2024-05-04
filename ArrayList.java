import java.util.ArrayList;

public class ArrayList{
    public static void main (String[] args) {
        
        ArrayList<String> teams = new ArrayList<String>();
        
        teams.add("Mamelodi Sundowns FC");
        teams.add("Orlando Pirates FC");
        teams.add("Kaizer Chiefs FC");
        
        teams.set(0, "Stellenbosch FC");
		teams.remove(2);
		teams.clear();
        
        for(int i=0; i<teams.size(); i++){
            System.out.println(teams.get(i));
        }
        
        
    }
}