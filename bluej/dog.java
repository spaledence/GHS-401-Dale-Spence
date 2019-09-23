
public class dog
{
    private String name;
    private String breed;
    private int weight;
    public dog(){
        name = null;
        breed = null;
        weight = 0;
    }

    public dog(String name, String breed, int weight){
        this.name = name;
        this.breed= breed;
        this.weight = weight;
        

    }
    
    //return type is a double
    public int getWeight(){
        return this.weight;
    }
    public String toString(){
        
        return "name: " + this.name + " breed: " + this.breed + " weight: " + this.weight;
        
    }
}
