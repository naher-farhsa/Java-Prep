import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = sc.nextLine();
        System.out.println("enter your class:");
        String standard = sc.nextLine();
        System.out.println("enter marks of your five subject:-");
        System.out.print("english out of 100:");
        float english = sc.nextFloat();
        System.out.print("physics out of 100:");
        float physics = sc.nextFloat();
        System.out.print("chemistry out of 100:");
        float chemistry = sc.nextFloat();
        System.out.print("maths out of 100:");
        float maths = sc.nextFloat();
        System.out.print("computer out of 100:");
        float computer = sc.nextFloat();
        System.out.println("");
        float totalmarks = english + physics + chemistry + maths + computer;
        float percent = totalmarks / 500 * 100;
        System.out.print("percentage:" + "" + percent);
    }
}