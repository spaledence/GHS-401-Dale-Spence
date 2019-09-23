
/**
 * Write a description of class inputoutput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class inputoutput
{
   public static void main(){
       String name = JOptionPane.showInputDialog("what is your name");
       int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
       
       if(age >= 16){
           System.out.println("You can drive!!!!!!!!!!!!");
        } 
        else{
            System.out.println("You cant u bum");
        

        }
    }
}    


