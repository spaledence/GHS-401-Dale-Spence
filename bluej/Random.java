
/**
 * Write a description of class Random here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Random
{
    public static void main(){
        
        //random double between 90 and 100 inclusive
        
        int num;
        
        for( int i = 0; i < 30; i ++) {
            num = (int)(Math.random()*11 + 90);
            System.out.println(num);
            
            System.out.println("remainder when divided by 2 is " + num%2);
    }
}
}
