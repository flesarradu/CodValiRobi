package Lab5;

public class Angajat extends Persoana{
    int salariu;

    public Angajat(String nume, String prenume, int anNastere, STUDII ultimeStudiiAbsolvite, int salariu) {
        super(nume, prenume, anNastere, ultimeStudiiAbsolvite);
    }
    public Angajat(String nume, String prenume, int anNastere, STUDII ultimeStudiiAbsolvite) {
        super(nume, prenume, anNastere, ultimeStudiiAbsolvite);
        salariu = 0;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "salariu=" + salariu +
                "} " + super.toString();
    }
}
