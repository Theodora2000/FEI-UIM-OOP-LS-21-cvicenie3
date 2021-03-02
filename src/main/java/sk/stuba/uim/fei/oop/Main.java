package sk.stuba.uim.fei.oop;

public class Main {
    public static void main(String[] args){
        Auto skoda = new Auto();
        Auto bmw = new Auto();

        skoda.jedna=1;
        bmw.jedna=2;

        if(skoda.jedna==bmw.jedna){
            System.out.println("rovnake");
        }else{
            System.out.println("rozne");
        }

    }
}
