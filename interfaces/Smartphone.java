package javaprep.interfaces;
import java.lang.Math;

    interface camera{
        void snap();
        void record();
       default void potrait(){
           System.out.println("Taking Potrait...");
        }
    }
    interface wifi{
        void networks();
        void speed();
    }
    abstract class phone{
        abstract void call();
        abstract void receive();
    }
    public class Smartphone extends phone implements camera,wifi {
        @Override
        void call() {
            System.out.println("Calling...");
        }
        void receive() {
            System.out.println("Receiving...");
        }
  //----------------------------class phone--------------------------------------
        @Override
        public void snap() {
            System.out.println("Taking snap...");
        }
        public void record(){
            System.out.println("Recording...");
        }
 //------------------------------interface camera---------------------------------------
        @Override
        public void networks() {
            System.out.println("Connecting to network...");
        }
        public void speed() {
            System.out.println("Speed is : "+Math.random()*100+" mbps");
        }
 //-------------------------------interface wifi----------------------------------------
        public static void main(String[] args) {
            Smartphone a34=new Smartphone();
            wifi a54=new Smartphone();
            a54.networks();
            a54.speed();
            a34.call();
            a34.snap();
            a34.networks();
            a34.potrait();
        }
    }


