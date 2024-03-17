import java.util.*;
public class Ch4_PS {
    public static void main(String [] arg) {

        Scanner sc = new Scanner(System.in);
       //1.find the output
        System.out.print("Age: ");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("you can drive!");
        else
            System.out.println(" wait upto 18,kido!");

        //2.pass or fail
        System.out.println("enter your subject marks:");
        System.out.print("ENGLISH: ");
        int eng = sc.nextInt();
        System.out.print("SCIENCE: ");
        int pcb = sc.nextInt();
        System.out.print("MATHEMATICS: ");
        int maths = sc.nextInt();
        int total = eng + pcb + maths;
        if (total >= 40) {
            System.out.println("your are promoted !");
            if (eng >= 33 && pcb >= 33 && maths >= 33)
                System.out.println("you are passed in all subjects :-)");
            else
                System.out.println("you aren't passed in all subjects :-|");
        } else
            System.out.println("your are failed! :-(");

        //3. check the income tax
        System.out.print("enter your income(per annum) : ");
        float income = sc.nextFloat();
        float tax =0.0f;
        if (income>=250000.0 && income<=500000.0)
        {System.out.println("your income tax is 15% ");
            tax=tax+0.15f*(income);
            System.out.println(tax);
        }
        else if(income>=500000.0 && income<=1000000.0)
        {System.out.println("your income tax is 20% ");
            tax=tax+0.15f*(income-500000.0f);
            tax=tax+0.20f*(income);
            System.out.println(tax);
        }
        else if(income>1000000.0)
        {System.out.println("your income tax is 30% ");
            tax=tax+0.15f*(income-500000.0f);
            tax=tax+0.20f*(income-1000000.0f);
            tax=tax+0.30f*(income);
            System.out.println(tax);
        }
        else{
            System.out.println("your income tax is nil ");
            tax=tax+0.0f*(income);
            System.out.println(tax);
        }
        //4.find the day of the week
        System.out.print("enter the no. between 1 to 7 : ");
        int day= sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Day is MONDAY");
             break;
             case 2:
                System.out.println("Day is TUESDAY");
                break;
            case 3:
                System.out.println("Day is WEDNESDAY");
                break;
            case 4:
                System.out.println("Day is THURSDAY");
                break;
            case 5:
                System.out.println("Day is FRIDAY");
                break;
            case 6:
                System.out.println("Day is SATURDAY");
                break;
            case 7:
                System.out.println("Day is SUNDAY");
                break;
          }
          //5.check for leap year
         System.out.print("enter the year : ");
          int year=sc.nextInt();
          if (year%4==0)
             System.out.println(year+" is a leap year");
          else
             System.out.println(year+" isn't a leap year");
         //6.check the type of website
               String s=" ";
              System.out.print("enter the website : ");
               String website=sc.nextLine();
               if (website.endsWith(".com"))
                System.out.println( website+" is commercial website");
               else if (website.endsWith(".org"))
                System.out.println( website+" is organization website");
               else if(website.endsWith(".in"))
                System.out.println( website+" is indian website");




    }

}


