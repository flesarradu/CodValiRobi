package Lab2;

public class Cerc extends Figura {
    double raza;
    Cerc(double raza,boolean umplut) {
        this.raza=raza;
        this.umplut = umplut;
    }

    @Override
    public double perimetru() {
        return 2*Math.PI*raza;
    }

    @Override
    public double arie() {
        return Math.PI*raza*raza;
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                ", umplut=" + umplut +
                '}';
    }
}
