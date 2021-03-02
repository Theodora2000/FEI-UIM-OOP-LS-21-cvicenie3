package sk.stuba.uim.fei.oop;
public class Auto {

    private static final double FUEL_PER_KM=0.5;
    private double kapacitaNadrze;
    public double stavNadrze;

    public void drive(double distance){
        stavNadrze -= distance*FUEL_PER_KM;
        if(stavNadrze<0){
            stavNadrze=0;
        }
    }

}
