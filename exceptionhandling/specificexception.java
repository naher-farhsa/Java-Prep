package javaprep.exceptionhandling;
import java.util.*;
public class specificexception {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
          int []arr= new int[3];
          arr[0]=101;
          arr[1]=202;
          arr[2]=303;
        System.out.println("Enter index to divide: ");
       int a= sc.nextInt();
        System.out.println("Enter the no. to divide with: ");
        int b= sc.nextInt();
        try{
            System.out.println("Result : "+a/b);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index: "+a);
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("Invalid division: "+e);
        }
    }

}
