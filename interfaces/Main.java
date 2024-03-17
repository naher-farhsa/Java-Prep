package javaprep.interfaces;

  interface Twowheeler {
       int s=25;
      void brake(int s);

      void speedup(int s);
  }
  interface Scooty {
      int l=4;
      int b=67;
      void fuellevel(int l);
      void battery(int b);
  }
  class TVS implements Twowheeler,Scooty {
      @Override
      public void brake(int s) {
          System.out.println("Applying Brake");
          s--;
      }

      @Override
      public void speedup(int s) {
          System.out.println("Applying Speedup");
          s++;
      }

      @Override
      public void fuellevel(int l) {
          System.out.println("Fuellevel decreases");
          l--;
      }

      @Override
      public void battery(int b) {
          System.out.println("Battery decreases");
          b--;
      }
  }
   class Interface{
      public static void main(String[] args) {
        TVS Ntorq=new TVS();

        Ntorq.brake(2);
        Ntorq.speedup(5);
          System.out.println(Ntorq.s);
          System.out.println(Ntorq.l);
          System.out.println(Ntorq.b);
    }
}
