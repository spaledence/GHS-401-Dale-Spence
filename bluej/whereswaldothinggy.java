import javax.swing.JOptionPane;
/**
 * Write a description of class whereswaldothinggy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class whereswaldothinggy
{
    public static void main(){
        String School = JOptionPane.showInputDialog("What school do you attend?:");
        String SchoolAnswer = "Granada";
        String MascotAnswer = "Matador";
        String[] coolguys = {"marjulian", "jackmaratrix", "Waldo", null};
        String FavoriteArtist = "Pimp Tobi";

        if( School.equals(SchoolAnswer)){
            String Mascot = JOptionPane.showInputDialog("Whats the mascot ?:");
            
            if( Mascot.equals(MascotAnswer)){

                for(int i=0; i<coolguys.length; i++){
                    if(coolguys[i]== null){
                         System.out.println("spot is empty");
                    }
                    else if(coolguys[i].equals("Waldo")){
                        System.out.println("You have found waldo in spot" + (i+1));

                        
                    }
                    else{
                        System.out.println("You have not found waldo! You have found " + coolguys[i] + " In spot " + (i+1));

                
                    } 
                    
                }
                
            }
            else{
                System.out.println("youre a bum");
            }
        }
        else{
            System.out.println("school is wrong");
        }
        String Artist = JOptionPane.showInputDialog("Whos your favorite song artist?:");
                        if (Artist.equals(FavoriteArtist)){
                            System.out.println("we have the same artist omg lol");
                            

                        }
                        else{
                            System.out.println("we dont have the same artist omg lol");
                            

                        }
    }
}
