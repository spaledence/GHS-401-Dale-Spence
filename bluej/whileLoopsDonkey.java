import javax.swing.JOptionPane;
/**
 * Write a description of class whileLoopsDonkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class whileLoopsDonkey
{
    public static void main(){
        double hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("Hours of sleep last night?"));
        while(hoursSleep < 0){
        hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("try again"));
    }
        System.out.println("You said " + hoursSleep + " hours");
    
}
}
