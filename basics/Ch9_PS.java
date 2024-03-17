import java.util.concurrent.Callable;

//1.create a class with some methods
   class Cylinder {
    private float radius, height;

    public void setRadius(float r) {
        this.radius = r;
    }

    public float getRadius() {
        return radius;
    }

    public void setHeight(float h) {
        this.height = h;
    }

    public float getHeight() {
        return height;
    }

//2.calculate surface area and volume of cylinder of above class
    public float surface_area() {
        float sa = 2 * 3.14f * radius * height + 2 * 3.14f * radius * radius;
        return sa;
    }

    public float volume() {
        float vol = 3.14f * radius * radius * height;
        return vol;
    }

//3.create a constructor of class cylinder
    public Cylinder() {
        this.radius = 2.5f;
        this.height = 2.5f;
    }

//4.overload the above constructor
    public Cylinder(float r, float h) {
        this.radius = r;
        this.height = h;
    }
}
//5.create a class sphere with same methods as class cylinder
    class Sphere{
      private float radius;

    public void setRadius(float r) {
        this.radius = r;
    }
    public float getRadius(){
        return radius;
    }
}

public class Ch9_PS {
     public static void main(String[] args) {
     //1.
     Cylinder c1=new Cylinder();
     c1.setRadius(1.5f);
     c1.setHeight(1.5f);
     System.out.println("cylinder1 radius : "+c1.getRadius());
     System.out.println("cylinder1 height : "+c1.getHeight());
     //2.
     System.out.println("cylinder1 surface area : "+c1.surface_area());
     System.out.println("cylinder1 volume : "+c1.volume());
     //3.
     Cylinder c2=new Cylinder();
     System.out.println("cylinder2 radius : "+c2.getRadius());
     System.out.println("cylinder2 height : "+c2.getHeight());
     //4.
     Cylinder c3=new Cylinder(3.5f,3.5f);
     System.out.println("cylinder3 radius : "+c3.getRadius());
     System.out.println("cylinder3 height : "+c3.getHeight());
     //5.
     Sphere s=new Sphere();
     s.setRadius(6.5f);
     System.out.println("sphere radius : "+s.getRadius());

     }
}
