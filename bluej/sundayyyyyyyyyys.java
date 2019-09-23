
/**
 * Write a description of class sundayyyyyyyyyys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sundayyyyyyyyyys
{
    // instance variables - replace the example below with your own
    public static void main(){

        int months[] = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };
        int year=1901;
        int dayoftheweek=2;  //put a 2 because the 1 jan 1901 is tuesday. 0-sunday 6-Saturday
        int sunday=0;
        int firstsundays=0;

        while(year<=2000){
            if(year%4==0){   
                months[1]=29;
                year++;

                for (int i = 0; i < 12; i++) {
                    for (int d = 1; d <= months[i]; d++){
                        if(dayoftheweek==7){  
                            dayoftheweek=0;

                            if(dayoftheweek==sunday && d==1){
                                firstsundays++;

                                dayoftheweek++;
                            }
                        }
                    }
                }
                    else{

                        months[1]=28;
                        year++;
                        //System.out.println("There are "  + " Sundays in the twentieth century.");

                    }
                }
            
                
                
                
                
                
                
                
                
                
                
                
           

