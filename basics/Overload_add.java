package study.java;

public class Overload_add {
   void add(){
       System.out.println("no parameters"+5+5);
   }
    void add(int a,int b){
        System.out.println("2 int parameters"+a+b);
    }
    void add(double a,double b){
        System.out.println("2 double parameters"+a+b);
    }
    void add(int a,int b,int c){
        System.out.println("3 int  parameters"+a+b+c);
    }
    public  static  void  main(String []arg){
       Overload_add obj=new Overload_add();
       obj.add();
        obj.add(2,3);
        obj.add(4,5,6);
        obj.add(4.67,7.34);
    }
}
