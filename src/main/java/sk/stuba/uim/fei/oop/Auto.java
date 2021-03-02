package sk.stuba.uim.fei.oop;
public class Auto {

    private static final double FUEL_PER_KM=0.5;
    private double kapacitaNadrze;
    public double stavNadrze;
    private boolean neojazdene;

    public void drive(double distance){
        this.neojazdene=false;
        stavNadrze -= distance*FUEL_PER_KM;
        if(stavNadrze<0){
            stavNadrze=0;
        }
    }
    public double getStavNadrze(){
        return stavNadrze;
    }
    public void setStavNadrze(double stavNadrze){
        this.stavNadrze = stavNadrze;
    }
    public String currentState(){
        String result;
        if(this.neojazdene){
            result="Auto je neojazdene\n";
        }
        else
            {
                result="Auto je ozajdene";
            }
        result +="\n"+ stavNadrze+"\\"+kapacitaNadrze;
        return  result;
    }
}
