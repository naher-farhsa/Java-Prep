import java.util.*;
public class Ch2_PS {
    public static void main(String [] arg){

        //1.find output
        float a=7/4f*9/2;
        /* a =1.75*9/2
             =15.75/2
             =7.875
         */
        System.out.println(a);

        //2.encrypt and decrypt
          char grade='B';
          grade=(char)(grade+8);
          System.out.println(" encrypt grade: "+grade); //encrypt
          grade=(char)(grade-8);
          System.out.println(" decrypt grade: "+grade); //decrypt

        //3. compare no. with user no.
        Scanner sc=new Scanner(System.in);
           System.out.print("enter your no: ");
           float num1=sc.nextFloat();
           int   num2=45;
           if(num1>num2)
            System.out.println("number1 is greater than number2");
           else
            System.out.println("number2 is greater than number1");
           //4. write the expression in java
             float v,u,g,s;
             v=2;u=1;g=5;s=7;
             float y=(v*v-u*u)/(2*g*s);
             System.out.println("y = "+y );
          //5.  find the value of b
             int x=7;
           double b=7.92/x+34f/x;
             System.out.println("b = "+b);
         //6.operator precedence and associativity
         int no1=4/2+3-2*1;
         /*  no1=2+3-2*1
                =2+3-2
                =5-2
                =3
          */

         int no2=3-4*1+2/1;
         /* no2=3-4+2/1
               =3-4+2
               =-1+2
               =1
          */
       System.out.println("no1 = " + no1 + ",no2 = " + no2);
     //7. increment and decrement operator
         int var1=8;                 // ++a or --a :change then use
         int var2=6;                 // a++ or a-- :use then change
         System.out.println(var1++  +" and "+ ++var2 );

    }
}
