package study.java;

public class Outer {
    private int outdata =89;
    class Inner{
        void display(){
             int indata=46;
            System.out.println("Inner class Data"+indata);
            System.out.println("Outer class Data"+outdata);
        }
        public static void main(String []arg){
            Outer out=new Outer();
            Outer.Inner in=out.new Inner();
            in.display();


        }
    }
}
