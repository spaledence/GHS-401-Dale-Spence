
/**
 * Write a description of class Ghost here.
 * 
 * @author Dale 
 * @version (a version number or a date)
 */
public class Ghost
{
    //instance vairables for the class Ghost
    private String color;
    private int speed;
    private int level;

    //zero-argument constructor, basically makes a default ghost
    public Ghost(){
        color = null;
        speed = 73;
        level = 1;

    }

    //two argument constructor, can set the instance variables to anything desired
    public Ghost(String color, int speed, int level){
        this.color = color;
        this.speed = speed;
        this.level = level;
        
    }
    
    public void bumpSpeed(){
        
        this.speed ++;
    }
    
     public void bumpSpeed(int bump){
        
        this.speed += bump;
    }
    
    public void doubleColor(){
        this.color = color + color;
    }
    
    //public means that other classes have access to this method
    //String is the return type of this method, it gives back a String 
    //toString is the name of this method
    public String toString(){
        
        return "Color: " + this.color + " Speed: " + this.speed + " Level: " + this.level;
        
    }
}