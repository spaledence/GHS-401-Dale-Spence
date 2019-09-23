
public class panda
{
    private String country;
    private double weight;
    
    public panda(){
        this.country = null;
        this.weight = 0;
    }
    public panda(String country, double weight){
        
        this.country = country;
        this.weight = weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setCountry(String country){
        this.country = country;
    }
    
    public String getCountry(){
        return this.country;
    }
    public double getWeight(){
        return this.weight;
    }
    public String toString(){
        return "Country: " + this.country + "Weight: " + this.weight;
    }

}
