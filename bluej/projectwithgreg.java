import javax.swing.JOptionPane;
/**
 * Write a description of class projectwithgreg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectwithgreg
{
    public static void main(){
        int array = Integer.parseInt(JOptionPane.showInputDialog("How many numbers in your array"));
        int most = 10000;
        int least = 10;
        int bottom=31;
        int top=38;
        int maximum;
        int minimum;
        while(array < least){
            array = Integer.parseInt(JOptionPane.showInputDialog("How many numbers in your array"));

        }
        while(array > most){
            array = Integer.parseInt(JOptionPane.showInputDialog("How many numbers in your array"));

        }
        int Newarray[] = new int[array];
        minimum = top;
        maximum = bottom;
        for( int i = 0; i < array; i++){
             
             Newarray[i] = (int)(Math.random()*(top - bottom +1) +bottom);
             System.out.print(Newarray[i] + " ");
             
             if(minimum>Newarray[i]){
                 minimum = Newarray[i];
                }
             if(maximum<Newarray[i]){
                 maximum = Newarray[i];
                }

        }
        System.out.println("Smallest: " + minimum);
        System.out.println("Max: " + maximum);
    }
}
