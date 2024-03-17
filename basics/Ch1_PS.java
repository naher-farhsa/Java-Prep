import java.util.Scanner;
public class Ch1_PS{
    public static void main(String[] x){
        Scanner sc= new Scanner(System.in);
        //sum of 3 no.
        System.out.print("enter the no. :");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int sum =a+b+c;
        System.out.println("Sum is :"+ sum);
        // print name;
        System.out.print(" enter your name:");
        String name=sc.next();
        System.out.println("Hello " + name + " have good day");
        // convert km to miles
        System.out.print("enter the kilometer:");
        float km=sc.nextFloat();
        double miles=0.6214*km;
        System.out.println("miles:" + miles);


    }




}

