package Lab2;

public class Dreptunghi extends Figura {
    double lungime;
    double latime;
    Dreptunghi(double lungime, double latime, boolean umplut){
        this.umplut = umplut;
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double perimetru() {
        return lungime + latime;
    }

    @Override
    public double arie() {
        return lungime*latime;
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                ", umplut=" + umplut +
                '}';
    }
}
