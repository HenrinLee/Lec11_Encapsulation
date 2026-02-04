package Lec11_Encapsulation.Final.FinalVarriable;

public class Bike {

    final int speedLimit = 90;

    void run() {
        speedLimit = 400;
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }

}
