package javaprep.exceptionhandling;
import java.lang.*;
 class NegativeRadiusException extends Exception{

     public NegativeRadiusException(String message) {
         super(message);
     }

     public String toString(){
         return " Exception : Radius entered is negative" +"\n" + getMessage();
     }

 }
public class throw_throws {
   public static double area(int r) throws NegativeRadiusException {
       if(r<0){
           throw new NegativeRadiusException(" Invalid Radius :"+r);
       }
       double area=Math.PI *r*r;
       return area;
    }
    public static void main(String[] args) {
        try{
            System.out.println("Circle area = " + area(-7));
        }
        catch (NegativeRadiusException e){
            System.out.println(e);

        }
    }
}
