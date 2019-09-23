
public class pandaguy
{
    public static void main(){
        
        panda panda1 = new panda("China " , 1010101101.21);
        
        double currentWeight = panda1.getWeight();
        
        currentWeight += 1000.0;
        
        panda1.setWeight(currentWeight);
        
        System.out.println(panda1.getWeight());
        // datatype name = new new datatype
        panda[] zoo = new panda[3];
        zoo[0] = new panda("USA" , 311.2);
        zoo[1] = new panda("Canada" , 211.2);
        zoo[2] = new panda("Germany" , 666.6);
        for( int i = 0; i < zoo.length; i++){
            System.out.println(zoo[i]);
    }

    
}
}
