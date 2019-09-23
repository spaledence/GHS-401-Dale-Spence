
/**
 * Write a description of class ArraysAndStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArraysAndStuff
{
  public static void main(){
      
      
      int[] myArray = new int[8];
      
      
     
      
      for(int i=0; i < myArray.length; i++){
          
          myArray[i] = i*15;
        }
      
      for(int i=0; i < myArray.length; i++){
          
          System.out.println("value is " + myArray[i]);
        }
    }
}
