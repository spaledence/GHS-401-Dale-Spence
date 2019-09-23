
/**
 * Write a description of class loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class loops
{
    public static void main(){
        int num1; 
        int num2;
        String[]firstnames = {"tony", "chris", "chulo", "cream", "bob"};
        String[]lastnames =  {"culio", "flem" , "ross", "roonan", "terry"};

        System.out.println("First Name\t\tLastname");
        for( int i = 1; i<10; i++){
            num1 =(int)(Math.random()*firstnames.length);
            num2 =(int)(Math.random()*firstnames.length);
            System.out.println(firstnames[num1] + "\t\t\t" + lastnames[num2]);

            
        }
        int a = 93;
        while(82<a){
            System.out.println(a);
            a--;
            System.out.println(firstnames[] + lastnames[]);
        }
    }
}