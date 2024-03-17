import java.util.*;
public class Ch5_PS {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

       //1. pattern printing
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
        System.out.print("enter the string : ");
        String s = sc.nextLine();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                char ch = s.charAt(j);
                System.out.print(ch);
            }
            System.out.println("");
        }

        //2.print sum of  first n even no. using for loop
        System.out.print("enter the n : ");
        int n1 = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 2*n1; i++) {
            if (i % 2 == 0)
                sum = sum + i;
        }
        System.out.println("sum of first n even no.using for loop : " + sum);

        //3.multiplication table of given no
        System.out.print("enter the no. : ");
        int no1 = sc.nextInt();
        long mul1;
        for (int i = 1; i <= 10; i++) {
            mul1 = no1 * i;
            System.out.println(no1 + " * " + i + " = " + mul1);
        }

        //4.multiplication table of given no. in reverse order
        System.out.print("enter the no. : ");
        int no2 = sc.nextInt();
        long mul2;
        for (int i = 10; i >= 1; i--) {
            mul2 = no2 * i;
            System.out.println(no2 + " * " + i + " = " + mul2);
        }

        //5.factorial of given no. using for loop
        System.out.print("enter the no. : ");
        int no3 = sc.nextInt();
        long fact1 =1;
        for (int i = 1; i <= no3; i++) {
           if(no3==0)
               fact1=fact1;
           else
            fact1 =fact1*i;
        }
        System.out.println(" factorial of no. "+no3+ " using for loop : " + fact1);

        //6.factorial of given no. using while loop
        System.out.print("enter the no. : ");
        int no4 = sc.nextInt();
        long fact2 = 1;
        int i = 1;
        while (i <= no3) {
            if(no4==0)
                fact1=fact1;
            else
            fact2 = fact2*i;
            i++;
        }
        System.out.println(" factorial of no. "+no4+" using while loop : " + fact2);

        //7. pattern printing
              int a=1;
              while (a <= 4) {
                  int b = 4;
                  while ( b >= a) {
                        System.out.print("*"+" ");
                  b--;  }
                    System.out.println("");
                  a++;  }

        //8. TRUE OR FALSE
        System.out.println("we can write code by using any type of loop such as (for/while/do while)");

        //.9.sum of multiple of 8 upto  10
         int num=8,add1=0;
         for(int p=1;p<=10;p++){
           add1=add1+num*p;
         }
        System.out.println("sum of multiple of 8 : "+add1);

        //11.MCQ
        System.out.println(" do while loop is executed at least once");

        //12.sum of n even no. using while loop
        System.out.print("enter the n : ");
        int n2=sc.nextInt(); int p=1; int add2=0;
        while(p<=2*n2){
          if(p%2==0)
              add2=add2+p;
          p++;
        }
        System.out.println("sum of n even no. using while loop :"+add2);


    }

}






