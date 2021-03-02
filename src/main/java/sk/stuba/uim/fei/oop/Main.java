package sk.stuba.uim.fei.oop;

public class Main {
    public static void main(String[] args){
        Auto skoda = new Auto();
        System.out.println(skoda.currentState());
        skoda.setStavNadrze(100);
        skoda.drive(100);
        System.out.println(skoda.getStavNadrze());
        System.out.println(skoda.currentState());
    }
}
