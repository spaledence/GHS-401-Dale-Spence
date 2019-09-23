

public class dog2
{
   public static void main(){
       
       dog d1 = new dog("jimothy", "bigdog", 2);
       dog d2 = new dog();
       
       System.out.println(d1.toString());
       System.out.println(d2.toString());
       
       System.out.println(d1.getWeight());
}
}
