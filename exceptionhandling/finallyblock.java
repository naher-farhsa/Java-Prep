package javaprep.exceptionhandling;

import java.lang.*;

import javaprep.exceptionhandling.throw_throws;

class NegativeRadiusException2 extends Exception {
    public String toString() {
        return " Exception : Radius entered is negative";
    }

    public String getMessage() {
        return "Invalid Radius ";
    }
}

public class finallyblock {

    public static class throw_throws {
        public static double area(int r) throws NegativeRadiusException2 {
            if (r < 0) {
                throw new javaprep.exceptionhandling.NegativeRadiusException2();
            }
            double area = Math.PI * r * r;
            return area;
        }

        public static void main(String[] args) {
            try {
                System.out.println("Circle area = " + area(-2));
            } catch (NegativeRadiusException2 e) {
                System.out.println(e);
            } finally {
                System.out.println("Formula used for circle area : PI * radius^2");
            }
        }
    }
}
