//1.create a class Employee with some methods
    class Employee{
     private int salary;
     private String name;
     public int getSalary(){
        return salary;
     }
     public void setSalary(int s) {
        this.salary = s;
     }
     public String getName(){
        return name;
     }
     public void setName(String n) {
        this.name = n;
     }
 }
//2.create a class cellphone  with some methods
    class Cellphone{
    public void incomingcall(){

        System.out.println("ringing");
        System.out.println("vibrating");
    }
    public void outgoingcall(){
        System.out.println("callertuning");
    }
    public String battery(int percent){
        if(percent>=80)
            return "best performance-increase display rate ";
        else if(percent>=50 && percent<80)
            return "better performance - optimizing battery ";
        else if(percent>=20 && percent<50)
            return "good performance -decrease brightness & optimizing battery";
        else if(percent>=5 && percent<20)
            return "best battery life -power saver ON";
        else
            return "low battery -recharge battery";
    }
 }
//3.create class square with some methods
    class Square{
    private float side;
    public void setSide(float s){
       this.side=s;
    }
    public float area(){
       float a=side*side;
       return a;
    }
    public  float perimeter(){
        float p=4*side;
        return p;
    }
 }
 //4.create a class rectangle with same methods as square class
     class Rectangle{
     private float length;
     private float width;
     public void setLength_width(float l,float w){
         this.length=l;
         this.width=w;
     }
     public float area(){
         float a=length*width;
         return a;
     }
     public  float perimeter(){
         float p=2*(length+width);
         return p;
     }
 }
//5.create a class rockstar games with object tommyvecetti
    class Rockstar_Game{
    public void hit(){
        System.out.println("hitting with: hand ,leg ,bat ,car ,bike");
    }
    public void run(){
        System.out.println("running with : leg");
    }
    public void fire(){
        System.out.println("firing with : gun, missile ,grenade");
    }
    public void drive(){
        System.out.println("driving : car,bike,cycle,bus,chopper,jetpack");
    }

}
//6.create a class circle with same methods as class square
    class Circle{
    private float radius;
    public void setradius(float r){
        this.radius=r;
    }
    public float area(){
        float a=3.14f*radius*radius;
        return a;
    }
    public  float perimeter(){
        float p=2*3.14f*radius;
        return p;
    }
}

public class Ch8_PS {
    public static void main(String[] args) {
       //1.
       Employee emp=new Employee();
       emp.setName("Rehan Ashraf");
       emp.setSalary(980000);
       System.out.println(emp.getName());
       System.out.println(emp.getSalary());
       System.out.println("");
       //2.
       Cellphone phn=new Cellphone();
       phn.incomingcall();
       phn.outgoingcall();
       System.out.println(phn.battery(15));
       System.out.println("");
       //3.
       Square sqr=new Square();
       sqr.setSide(2.5f);
       System.out.println("area of square : "+sqr.area());
       System.out.println("perimeter of square : "+sqr.perimeter());
       System.out.println("");
       //4.
       Rectangle rec=new Rectangle();
       rec.setLength_width(1.5f,1.5f);
       System.out.println("area of rectangle : "+rec.area());
       System.out.println("perimeter of rectangle : "+rec.perimeter());
       System.out.println("");
       //5.
       Rockstar_Game tommyvecetti=new Rockstar_Game();
       tommyvecetti.hit();
       tommyvecetti.run();
       tommyvecetti.drive();
       tommyvecetti.fire();
       System.out.println("");
       //6.
       Circle crcl= new Circle();
       crcl.setradius(2.5f);
       System.out.println("area of circle : "+crcl.area());
       System.out.println("perimeter of circle : "+crcl.perimeter());
    }

}
