
/**
 * Write a description of class GhostDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GhostDriver
{
    public static void main(){
        
   
        
        
        
        
        Ghost g4 = new Ghost("chartruse", 99, 1);
        
        System.out.println(g4.toString());
        
        g4.bumpSpeed(10);
        
        System.out.println(g4.toString());
        
        g4.bumpSpeed(); //increase speed of Ghost 4 by 1
        
        System.out.println(g4.toString());
        
        g4.doubleColor();
        
        System.out.println(g4.toString());
        
        
    }
}
