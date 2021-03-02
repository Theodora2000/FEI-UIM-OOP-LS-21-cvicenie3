package sk.stuba.uim.fei.oop;

public class Main {
    public static void main(String[] args){
        Auto skoda = new Auto(80);//instancia

        System.out.println("Dotankoval som"+skoda.dotankova());
        System.out.println(skoda.currentState());
        skoda.drive(100);
        System.out.println("Dotankoval som"+skoda.dotankova());
        System.out.println(skoda.getStavNadrze());
        System.out.println(skoda.currentState());
    }
}
