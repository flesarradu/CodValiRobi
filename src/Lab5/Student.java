package Lab5;

public class Student extends Persoana{
    int numarSemestreBuget;
    public Student(String nume, String prenume, int anNastere, STUDII ultimeStudiiAbsolvite, int numarSemestreBuget) {
        super(nume, prenume, anNastere, ultimeStudiiAbsolvite);
        this.numarSemestreBuget = numarSemestreBuget;
    }
    public Student(String nume, String prenume, int anNastere, STUDII ultimeStudiiAbsolvite) {
        super(nume, prenume, anNastere, ultimeStudiiAbsolvite);
        numarSemestreBuget =0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numarSemestreBuget=" + numarSemestreBuget +
                "} " + super.toString();
    }
}
