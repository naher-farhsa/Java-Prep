package javaprep.exceptionhandling;

//import java.util.Scanner;

public class trycatchblock {
    public static void main(String[] args) {
        // arithmetic exception
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int div = a / b;
            System.out.println("quotient = " + div);
        } catch (Exception e) {
            System.out.println("Invalid division " + e);
        }
        System.out.println("End of program");
    }
}
