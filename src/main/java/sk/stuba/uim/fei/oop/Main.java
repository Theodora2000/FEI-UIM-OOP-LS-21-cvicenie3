package sk.stuba.uim.fei.oop;

public class Main {
    public static void main(String[] args){
        Auto skoda = new Auto(80);//instancia
        Auto bmw = new Auto();//instancia
        System.out.println("Skoda----------");
        testAuto(skoda);

        System.out.println("Bmw----------");
        testAuto(bmw);
    }
    public static void testAuto(Auto auto){


        System.out.println("Dotankoval som"+auto.dotankova());
        System.out.println(auto.currentState());
        auto.drive(100);
        System.out.println("Dotankoval som"+auto.dotankova());
        System.out.println(auto.getStavNadrze());
        System.out.println(auto.currentState());

    }
}
