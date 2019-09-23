import javax.swing.JOptionPane;
/**
 * Write a description of class stringshit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stringshit
{
    public static void main(){
        String[] classmates = {"marjulian", "jackmaratrix", null, "thumper", "cumberkee"};

        for(int i=0; i<classmates.length; i++){
            if(classmates[i] != null)
                System.out.println(classmates[i].length());

        
        
            /* String name = new String("greg");
            //String name2 = new String("greg");
            //String name = "greg";
            //String name2 = JOptionPane.showInputDialog("Name: ");

            int a = 10;
            int b = 10;

            if(name.equals(name2)){
            System.out.println("They are TWINS MY BOI!!!!!!!!!!!!");
            }
            else{
            System.out.println("Ya aint got no twins ;c");
             */}
    }
}
