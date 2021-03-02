package sk.stuba.uim.fei.oop;

public class Main {
    public static void main(String[] args){
        Auto skoda = new Auto();

        skoda.stavNadrze = 100;
        skoda.drive(100);
        System.out.println(skoda.stavNadrze);

    }
}
